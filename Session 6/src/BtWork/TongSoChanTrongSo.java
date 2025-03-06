package BtWork;

public class TongSoChanTrongSo {
    public static void main(String[] args) {
        System.out.println("Tong So Chan Trong So: "+getEvenDigitSum(34451));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }else{
            int sum = 0;
            while(number>0){
                int digits = number %10;
                if(digits %2 ==0){
                    sum = sum + digits;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
