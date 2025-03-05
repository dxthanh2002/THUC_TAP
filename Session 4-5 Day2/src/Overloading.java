public class Overloading {

    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
        System.out.printf("this" + calculateScore());
        boolean rs= compare_2_number(1,2);
        System.out.println("rs:"+rs);
    }

    private static boolean compare_2_number(int number_1, int number_2) {
        return (number_1> number_2) ? true : false;
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }


}