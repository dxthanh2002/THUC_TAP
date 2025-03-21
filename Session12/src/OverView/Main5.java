package OverView;
import java.util.Arrays;
import java.util.List;

class Utils1 {
    // Wildcard `?` giúp chấp nhận danh sách của bất kỳ kiểu dữ liệu nào
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}



public class Main5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");

        Utils1.printList(intList); // Output: 1 2 3
        Utils1.printList(strList); // Output: A B C
    }
}
