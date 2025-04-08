package Q26_Q27TaskManagerment;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Lấy tất cả các task chưa được giao cho ai (tasks chung)
        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        // Tạo comparator để sắp xếp task theo mức độ ưu tiên (Priority)
        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);

        // Lấy danh sách công việc của Ann và sắp xếp theo Priority
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

        // Lấy danhsách công việc của Bob và Carol
        Set<Task> bobsTasks = TaskData.getTasks("Bob");
        Set<Task> carolsTasks = TaskData.getTasks("Carol");
        List<Set<Task>> sets = List.of(annsTasks, bobsTasks, carolsTasks);

        // Hợp tất cả công việc đã được giao cho Ann Bob Carol
        Set<Task> assignedTasks = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTasks);

        // Hợp tất cả công việc(bao gồm cả công việc chung và công việc đã giao)
        Set<Task> everyTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("The True All Tasks", everyTask);

        // Tìm các task bị thiếu (có thể do lỗi nhập liệu)
        Set<Task> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("Missing Tasks", missingTasks);

        // Tìm các task chưa được giao cho ai (có trong tasks nhưng không có trong assignedTasks)
        Set<Task> unassignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unassignedTasks, sortByPriority);

        // Tìm các task được giao cho nhiều người (giao trùng lặp)
        Set<Task> overlap = getUnion(List.of(
                getIntersect(annsTasks, bobsTasks), // Task chung giữa Ann và Bob
                getIntersect(carolsTasks, bobsTasks), // Task chung giữa Carol và Bob
                getIntersect(annsTasks, carolsTasks) // Task chung giữa Ann và Carol
        ));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        // Danh sách task bị giao trùng
        List<Task> overlapping = new ArrayList<>();
        for (Set<Task> set : sets) {
            Set<Task> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }

        // Sắp xếp overlapping tasks theo Priority, sau đó theo thứ tự tự nhiên của Task
        Comparator<Task> priorityNatural = sortByPriority.thenComparing(
                Comparator.naturalOrder());
        sortAndPrint("Overlapping", overlapping, priorityNatural);

    }

    /**
     * Hàm in danh sách task với sắp xếp tùy chọn
     * @param header Tiêu đề in ra màn hình
     * @param collection Danh sách task cần in
     */
    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }

    /**
     * Hàm in danh sách task có thể được sắp xếp theo comparator truyền vào
     * @param header Tiêu đề in ra màn hình
     * @param collection Danh sách task cần in
     * @param sorter Comparator để sắp xếp (nếu có)
     */
    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter) {

        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        // Chuyển tập hợp (Set) thành danh sách (List) để có thể sắp xếp
        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter); // Sắp xếp nếu có comparator truyền vào
        list.forEach(System.out::println); // In danh sách
    }

    /**
     * Lấy hợp (union) của danh sách các tập hợp công việc
     * @param sets Danh sách tập hợp công việc
     * @return Hợp của tất cả các tập hợp
     */
    private static Set<Task> getUnion(List<Set<Task>> sets) {

        Set<Task> union = new HashSet<>();
        for (var taskSet : sets) {
            union.addAll(taskSet);
        }
        return union;
    }

    /**
     * Lấy giao (intersection) của hai tập hợp công việc
     * @param a Tập hợp thứ nhất
     * @param b Tập hợp thứ hai
     * @return Giao của hai tập hợp
     */
    private static Set<Task> getIntersect(Set<Task> a, Set<Task> b) {

        Set<Task> intersect = new HashSet<>(a);
        intersect.retainAll(b); // Giữ lại phần chung
        return intersect;
    }

    /**
     * Lấy hiệu (difference) giữa hai tập hợp công việc
     * @param a Tập hợp thứ nhất
     * @param b Tập hợp thứ hai
     * @return Phần tử có trong a nhưng không có trong b
     */
    private static Set<Task> getDifference(Set<Task> a, Set<Task> b) {

        Set<Task> result = new HashSet<>(a);
        result.removeAll(b); // Loại bỏ phần tử có trong b
        return result;
    }
}
