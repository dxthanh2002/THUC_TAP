import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        String year = "2002";
        String year2 = "2025";
        int birth = Integer.parseInt(year);
        int now = Integer.parseInt(year2);
        System.out.println("Age now :" +(now-birth));
        System.out.println("What your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Huh ? your name is "+name);

    }
}
