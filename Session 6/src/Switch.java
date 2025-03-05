public class Switch {

    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        /// ////////////////
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }

    /// ////////////////////////
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            default -> {
                yield "Invallid Day";
            }
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid day";
        if (day == 0){
            dayOfWeek = "Sunday";
        }else if (day == 1){
            dayOfWeek = "Monday";
        }else if (day == 2){
            dayOfWeek = "Tuesday";
        }else if (day == 3){
            dayOfWeek = "Wednesday";
        }else if (day == 4){
            dayOfWeek = "Thursday";
        }else if (day == 5){
            dayOfWeek = "Friday";
        }else if (day == 6){
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " is in the " + dayOfWeek);
    }
}


