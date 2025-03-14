
//Iterator là một interface trong Java
// duyệt các phần tử Collection mà k cần quan tâm đến cấu trúc


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator_36 {
    public static void main(String[] args) {
        // Tạo một LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Tạo Iterator để duyệt danh sách
        Iterator<String> iterator = list.iterator();
        //Duyệt
        System.out.println("Duyệt LinkedList bằng Iterator:");
        while (iterator.hasNext()) {  // Kiểm tra nếu còn phần tử
            String lang = iterator.next();  // Lấy phần tử tiếp theo
            System.out.println(lang);
        }
        //
        while (iterator.hasNext()) {
            String lang = iterator.next();
            if (lang.equals("Python")) {
                iterator.remove(); // Xóa phần tử "Python"
            }
        }
        System.out.println("Danh sách sau khi xóa: " + list);



        ListIterator<String> listIterator = list.listIterator(list.size());
        System.out.println("Duyệt ngược danh sách:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
// hasNext: kiểm tra phía trước
// next : lấy giá trị phía trước