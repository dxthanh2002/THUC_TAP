package BtWork;

public class TongDauCuoi {
    public static void main(String[] args) {

        System.out.println("Tong Dau Cuoi la: "+sumFirstAndLastDigit(121));
        System.out.println("Tong Dau Cuoi la: "+sumFirstAndLastDigit(175));
        System.out.println("Tong Dau Cuoi la: "+sumFirstAndLastDigit(208));

    }
    public static int sumFirstAndLastDigit(int number){
        int sodau = number;
        int socuoi = number%10;
        if (number<0){
            return -1;
        }else{

            while(sodau>=10){
                sodau/=10;
            }
            return(sodau + socuoi);
        }
}}
