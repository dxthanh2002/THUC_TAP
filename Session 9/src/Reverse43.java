import java.util.Arrays;
import java.util.Scanner;

public class Reverse43 {

    public static void main(String[] args) {

        int[] numbers = readIntegers();
        System.out.println("Mảng đã nhập: " + Arrays.toString(numbers));

        // Đảo ngược bằng cách tạo bản sao
        int[] reversedCopy = reverseCopy(numbers);
        System.out.println("Sau khi đảo ngược bản sao: " + Arrays.toString(reversedCopy));
        System.out.println("Mảng gốc không thay đổi: " + Arrays.toString(numbers));

        // Đảo ngược tại chỗ (mảng gốc bị thay đổi)
        reverseInPlace(numbers);
        System.out.println("Mảng gốc sau khi đảo ngược: " + Arrays.toString(numbers));
    }
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập danh sách số nguyên, cách nhau bởi dấu phẩy: ");

        return Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(s -> Integer.parseInt(s.trim()))
                .toArray();
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length / 2; i++) {
            swap(reversedArray, i, array.length - 1 - i);
        }
        return reversedArray;
    }
    private static void reverseInPlace(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
