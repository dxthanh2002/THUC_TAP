public class While {

    public static void main(String[] args) {



        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
        /// /
        int first = 4;
        int end = 20;
        while (first < end) {
            first++;
            if (isEvenNumber(first)) {
                System.out.println(first + " is even number");
            }
        }
        System.out.println("The sum of the digits is :"+ sumDigits(1234) );

    }

    private static Object sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }
        sum += number ;
        return sum;
    }


    /// //////////
    /// //////////
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
