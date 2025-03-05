package BtWork;

public class CungSoCuoi {
    public static void main(String[] args) {
        if ( hasSameLastDigit(41, 22, 71)){
            System.out.println("true");
        }
        if ( hasSameLastDigit (23, 32, 42)){
            System.out.println("true");
        }
        if (hasSameLastDigit (9, 99, 999)){
            System.out.println("true");
        }
    }


    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }

}
