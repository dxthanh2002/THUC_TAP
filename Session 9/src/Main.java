
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        // Vị trí thứ 5 thực ra là số 6

        double[] myDoubleArray = new double[10];
        myDoubleArray[5] = 3.5;

        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[5]);

        int[] firstFivePositives = new int[]{1,2,3,4,5};
        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("First 5 positive integers: " + Arrays.toString(firstFivePositives));
        System.out.println("First 10 positive integers: " + firstTen.length);

        for(int element : firstFivePositives){
            System.out.println(element);
        }
        System.out.println("Nhap mang");

        int[] mang = nhapMang();
    }
    private static int[] nhapMang() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(s->Integer.parseInt(s.trim()))
                .toArray();
    }

}
