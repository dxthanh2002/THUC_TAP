package OverView;
// Định nghĩa 1 lớp Generic kiểu T
class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter
    public T getValue() {
        return value;
    }

    // Setter
    public void setValue(T value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo Box chứa Integer
        Box<Integer> intBox = new Box<>(10);
        System.out.println(intBox.getValue()); // Output: 10

        // Tạo Box chứa String
        Box<String> strBox = new Box<>("Hello");
        System.out.println(strBox.getValue()); // Output: Hello
    }
    //
}
