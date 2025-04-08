package Q11Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    private record Person( String first) {

        public String last( String s ) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }
    }

    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names = {"Jing","Clara","Yunli","DanHeng","Bronya","Seele","Sunday","Your Star were bad"};

        Person to = new Person("DV");

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                s -> s += " " + getRandomChar('A','Z') + ".",
                s -> s += " " + reverse(s,0,s.indexOf(" ")),
                Main::reverse,
                String::new,
                s -> new String(s),
//                s -> new String("duma "+s),
                String::valueOf,


                to::last,
                (new Person("th"))::last



        ));
        applyChanges(names, list);
    }
    private static void applyChanges(String[] names,List<UnaryOperator<String>> stringfunction) {
        List<String> backedbyArray = Arrays.asList(names);
        for (var function : stringfunction) {
            backedbyArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));
        }
    }

    private static char getRandomChar(char batdau,char cuoicung) {
        return (char) random.nextInt((int)batdau, (int)cuoicung + 1);
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }
    private static String reverse(String s, int i, int j) {
        return new StringBuilder(s.substring(i,j)).reverse().toString();
    }

}
