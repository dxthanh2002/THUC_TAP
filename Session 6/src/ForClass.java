public class ForClass {
    public static void main(String[] args) {


        int count = 0;

        for ( int i = 10;count < 10 && i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
        forloop();
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int sochia = 2; sochia <= wholeNumber / 2; sochia++){
            if(wholeNumber % sochia == 0){
                return false;
            }
        }
        return true;
    }

    public static void  forloop(){
        int a=0;
        for(int i = 1; i < 10; i++){
            System.out.println("i =" + i);
        }
        while(a<=5){

            System.out.println("a= " + a);


            a++;
        }
        System.out.println("======");

        do {

            System.out.println("a= " + a);
            a++;
        }while(a<=10);
    }

}
