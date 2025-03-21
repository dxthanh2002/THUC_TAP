package OverView;

class Utils {
    // Phương thức generic
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main2 {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"A", "B", "C"};

        // Gọi phương thức generic với Integer
        Utils.printArray(intArr); // Output: 1 2 3 4

        // Gọi phương thức generic với String
        Utils.printArray(strArr); // Output: A B C
    }
}

