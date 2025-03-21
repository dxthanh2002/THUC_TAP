package OverView;

interface Container<T> {
    void add(T item);
    T get();
}

// Lớp triển khai Interface Generic
class StringContainer implements Container<String> {
    private String value;

    @Override
    public void add(String item) {
        this.value = item;
    }

    @Override
    public String get() {
        return value;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Container<String> container = new StringContainer();
        container.add("Hello Generics");
        System.out.println(container.get()); // Output: Hello Generics
    }
}
