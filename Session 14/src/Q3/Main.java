package Q3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int result = calculator((var a, var b) -> a + b,5, 2);//nếu dùng codeblock phải có return
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);// var: reusable
        var result3 = calculator(
                (a, b) -> a.toUpperCase() + " " + b.toUpperCase(),
                "Ralph", "Kramden");

    }

    public static <T> T calculator(Operation<T> function, T value1, T value2) {

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

}
