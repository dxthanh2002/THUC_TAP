package Polymorphism_dahinh.ChallengeOOP;

public class Item {
//Khai bao thuoc tinh
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";
// Ham tao
    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }
// them kich thuoc neu co SIDE DRINK
    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;
    }
//Price
    public double getBasePrice() {
        return price;
    }
//Thanh toan
    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }
//Size
    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

}
