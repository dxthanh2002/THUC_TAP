import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void groupArray(int[] arr) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 1) {
                oddList.add(num); // Lưu số lẻ vào danh sách oddList
            } else {
                evenList.add(num); // Lưu số chẵn vào danh sách evenList
            }
        }

        // In kết quả
        for (int num : oddList) {
            System.out.print(num + " ");
        }
        for (int num : evenList) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        System.out.println("Nhập giá trị của mảng");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Nhập số phần tử
        System.out.printf("Array có %d phần tử",n);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Nhập các phần tử mảng
        }

        groupArray(arr);
        scanner.close();
    }
}
