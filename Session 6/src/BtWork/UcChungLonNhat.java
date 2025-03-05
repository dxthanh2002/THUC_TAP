package BtWork;

public class UcChungLonNhat {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));  // Output: 5
        System.out.println(getGreatestCommonDivisor(12, 30));  // Output: 6
        System.out.println(getGreatestCommonDivisor(9, 18));   // Output: -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // Output: 9
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
