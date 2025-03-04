public class FeetToCM {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
        System.out.println(getDurationString(80));
        System.out.println(getDurationString(80,60));

    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

         return convertToCentimeters((feet * 12) + inches);
//        int feetToInches = feet * 12;
//        int totalInches = feetToInches + inches;
//        double result = convertToCentimeters(totalInches);
//        return result;
    }
    /// /////////////////////////////////////////////////////
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Không hợp lệ");
        }
            int minutes = seconds / 60;
            int seconds1 = (seconds % 60);
            int hours = minutes / 60;
            int minutes1 = minutes % 60;
            return String.format(hours + " Giờ " + minutes1 + " phút " + seconds1 + " giây ");

    }
    public static String getDurationString(int seconds,int minutes) {
    if (seconds < 0 || (minutes <= 0 || minutes >= 59)) {
        return "Invalid";
    }
        int hours = seconds / 3600;
        int seconds1 = seconds % 3600;
        return hours + " Giờ " + minutes + " phút " + seconds1 + " giây ";
    }
}

