import java.util.Random;

public class Enum46 {
    public static void main(String[] args) {
        Enum45 obj =  Enum45.TUES;
        System.out.println(obj);

        for (int i = 0; i < 10; i++ ) {
            obj = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    obj.name(), obj.ordinal());

            if (obj == Enum45.FRI) {
                System.out.println("Found a Friday!!!");
            }

        }
        // Duyệt mảng
        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }
    public static Enum45 getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = Enum45.values();

        return allDays[randomInteger];
    }
}
