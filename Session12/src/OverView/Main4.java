package OverView;

// Chỉ cho phép Number hoặc các lớp con của Number
class MathUtils<T extends Number> {
    private T num;

    public MathUtils(T num) {
        this.num = num;
    }

    public double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

public class Main4 {
    public static void main(String[] args) {
        MathUtils<Integer> intMath = new MathUtils<>(5);
        System.out.println(intMath.square()); // Output: 25.0

        MathUtils<Double> doubleMath = new MathUtils<>(3.5);
        System.out.println(doubleMath.square()); // Output: 12.25
    }
}
