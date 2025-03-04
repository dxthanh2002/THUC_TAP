public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp (true, 1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false; // Invalid hour range
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
