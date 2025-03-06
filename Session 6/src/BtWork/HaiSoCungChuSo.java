package BtWork;

public class HaiSoCungChuSo {
    public static void main(String[] args) {
        if( hasSharedDigit(23,32)){
                System.out.println("Yes");
        }
        if( hasSharedDigit(124,256)){
            System.out.println("Yes");
        }
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        } else {
            int tempNum1 = num1;
            while (tempNum1 > 0) {
                int digit1 = tempNum1 % 10;
                int tempNum2 = num2;
                while (tempNum2 > 0) {
                    int digit2 = tempNum2 % 10;
                    if (digit1 == digit2) {
                        return true;
                    }
                    tempNum2 /= 10;
                }
                tempNum1 /= 10;
            }
            return false;
        }
    }

}
