package Challenge;

public class ArtObject extends ProductForSale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

        System.out.println(" " + type + " là sp tái sản xuất");
        System.out.printf("Giá của sp $%6.2f %n", price);
        System.out.println(description);
    }
}
