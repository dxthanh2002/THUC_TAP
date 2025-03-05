package BtWork;

public class SumOddRange {
    public static void main(String[] args) {
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
    }
    // write code here
    public static boolean isOdd( int number){
        if(number <0){
            return false;
        }

        return number % 2 != 0;

    }
    public static int sumOdd(int start,int end){
        if (start > end || start < 0 || end < 0) {
            return -1;
        }
        int sum=0;
        for(int i = start ;i <= end;i ++){
            if(isOdd(i)){
                sum += i;
            }

        }
        return sum;
    }
}
