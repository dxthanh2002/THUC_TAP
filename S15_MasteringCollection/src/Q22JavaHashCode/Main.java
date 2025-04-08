package Q22JavaHashCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> xinchao =
                Arrays.asList(aText, bText, cText, dText, eText);

        xinchao.forEach(s -> System.out.println(s + ": " + s.hashCode()));//hashCode ktra trùng

        Set<String> mySet = new HashSet<>(xinchao);

        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());
        //mySet = [Hello, hello]
        //# of elements = 2
        for (String setValue : mySet) {
            System.out.print(setValue + " có :  ");
            for (int i = 0; i < xinchao.size(); i++) {
                if (setValue == xinchao.get(i)) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println(" ");
        }

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards =
                Arrays.asList(aceHearts, kingClubs, queenSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard c : cards) {
            if (!deck.add(c)) {
                System.out.println("Found a duplicate for " + c);
            }
        }
        System.out.println(deck);

        // LinkHashSet,HashSet,HashMap,LinkHashMap

    }
}
