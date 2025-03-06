package BtWork;
//So hoan hao la tong cua cac so nguyen to chia het cho no
public class SoHoanHao {
    public static void main(String[] args) {
        if(isPerfectNumber(6)){
            System.out.println(" 1 number is a perfect number");
        }
        if(isPerfectNumber(5)){
            System.out.println("2 perfect number is a perfect number");
        }
        if(isPerfectNumber(-1)){
            System.out.println("3 perfect number is a perfect number");
        }
    }
    public static boolean isPerfectNumber(int a){
        int sum=0;
        if(a<1){
            return false;
        }else{

            for(int i=1;i<=a/2;i++){
                if(a%i==0){
                    sum= sum+i;
                }
            }
        }
        if(a==sum){
            return true;
        }
        return false;
    }
}
