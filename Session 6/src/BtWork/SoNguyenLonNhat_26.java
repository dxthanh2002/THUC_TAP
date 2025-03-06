package BtWork;

public class SoNguyenLonNhat_26 {
    public static void main(String[] args) {
        System.out.println("Largest prime number is "+getLargestPrime(45));
        System.out.println("Largest prime number is "+getLargestPrime(217));
        System.out.println("Largest prime number is "+getLargestPrime(21));
        System.out.println("Largest prime number is "+getLargestPrime(-10));
    }
    public static int getLargestPrime(int n){
        if(n<=1){
            return -1;
        }
        int largestPrime = -1;

        while (n % 2 == 0) {
            largestPrime = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestPrime = i;
                n /= i;
            }
        }
        if (n > 2) {
            largestPrime = n;
        }
        return largestPrime;
    }
}
