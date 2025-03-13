import java.util.Arrays;
import java.util.Scanner;

public class Coding41 {
    public static int[] getIntegers(int capacity) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        int index = 0;
        for (int number : array) {
            System.out.println("Element " + index + " contents " + number);
            index++;
        }
    }

    public static int[] sortIntegers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Gọi hàm getIntegers() để nhập giá trị từ bàn phím
        int[] userArray = getIntegers(size);

        // Sắp xếp mảng theo thứ tự giảm dần
        int[] sortedArray = sortIntegers(userArray);

        // In ra mảng đã sắp xếp
        printArray(sortedArray);
    }
}
