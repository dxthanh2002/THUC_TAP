package Lambda;

import java.util.ArrayList;
import java.util.List;

public class MainQ2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }
    //lambdas reduce code
        System.out.println("-------");
        list.forEach((var myString) -> System.out.println(myString));
        //element
        //(element)
        //(String element)
        //(var element)

        System.out.println("-------");
        String prefix = "nato";
        list.forEach((var myString) -> {
            // sau arrow là code block
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
    }
}
// Lambda -> Steams
