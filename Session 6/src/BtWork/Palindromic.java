package BtWork;

public class Palindromic {
    public static void main(String[] args) {

        if(isPalindrome(131)){
            System.out.println("La so doi xung");
        }else {
            System.out.println("Khong doi xung");
        }
    }
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}
