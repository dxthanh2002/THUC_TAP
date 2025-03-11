package Encapsulation_donggoi.Challenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(true,50);
        System.out.println("page count: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current page job pages: %d , Printer Total: %d %n",pagesPrinted,printer.getPagesPrinted());
    }


}
