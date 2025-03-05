package BtWork;

public class NumberInMonth {
    public static void main(String[] args) {
        isLeapYear(2000);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year){
        if(month <1 || month>12){
            return -1;
        }
        if(year<1 || year>9999){
            return -1;
        }
        boolean nhuan = isLeapYear(year);
        return switch(month){
            case 1,3,5,7,8,10,12 ->31;
            case 2 -> { yield nhuan ? 29 : 28; }
            default -> 30;
        };
    }
}
