import java.util.Arrays;

public class Array2D_24 {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
//                System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(array2));

        System.out.println("===========================");
        //tạo lại mảng
        array2[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array2));
        //mảng được tạo lại null
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        //3 biến a,b,c vào 1 ô trong mảng
        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));
        // ép 1 mảng vào 1 mảng
        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));
        //        ;
        anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
//            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }
}
