package BaiTap;

public class Floor_34_main {
    public static void main(String[] args) {
        Floor_34.Carpet carpet = new Floor_34.Carpet(3.5);
        Floor_34.Floor floor = new Floor_34.Floor(2.75, 4.0);
        Floor_34.Calculator calculator = new Floor_34.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Floor_34.Carpet(1.5);
        floor = new Floor_34.Floor(5.4, 4.5);
        calculator = new Floor_34.Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
