public class Varargs {
    // Khai bao Varargs
    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));

        greet("Danh sách khách mời:", "An", "Bình", "Cường");
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
    public static void greet(String message, String... names) {
        System.out.println(message);
        for (String name : names) {
            System.out.println("Xin chào, " + name + "!");
        }
    }
}
