package Challenge6_7;

public class Furniture extends ProductForSale {

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println("This " + type + " dc lam o VN");
        System.out.printf("Gia cua sp la $%6.2f %n", price);
        System.out.println(description);
    }
}
