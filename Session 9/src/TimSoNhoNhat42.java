import java.util.Arrays;
import java.util.Scanner;

public class TimSoNhoNhat42 {
    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println("Mảng đã nhập: " + Arrays.toString(numbers));
        System.out.println("Giá trị nhỏ nhất: " + findMin(numbers));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập danh sách số nguyên, cách nhau bởi dấu phẩy: ");
        return Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(s -> Integer.parseInt(s.trim()))
                .toArray();
    }

    private static int findMin(int[] array) {
        return Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
    }
}