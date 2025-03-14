import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayvsArrayList_30 {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        System.out.println("================");
        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
    //So sánh
//    Cố định khi khai báo. Không thể thay đổi.
//    Nhanh hơn vì quản lý bộ nhớ tĩnh.
//    Có thể là kiểu nguyên thủy (int, double...) hoặc đối tượng (Integer, String...).
//    int[] arr = new int[5];
//    Không thể thay đổi kích thước sau khi khởi tạo.
//    Phải tự dịch chuyển các phần tử nếu cần xóa.
//            for truyền thống, for-each, hoặc Arrays.stream().
//    Dùng Arrays.asList(arr) để chuyển thành ArrayList.



//    Động, có thể thay đổi kích thước linh hoạt.
//    Chậm hơn do quản lý bộ nhớ động.
//    Chỉ chứa đối tượng (Integer, String, ...). Không hỗ trợ kiểu nguyên thủy trực tiếp.
//    ArrayList<Integer> list = new ArrayList<>();
//    Dùng add() để thêm phần tử vào danh sách.
//    Dùng remove() để xóa dễ dàng.
//            for, for-each, forEach(), stream().
//    Dùng list.toArray(new String[0]) để chuyển thành Array
}
