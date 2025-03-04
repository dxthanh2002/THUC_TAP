public class ReuseableCode {
    public static void main(String[] args) {



// chuyền tham số vào hàm
        calculateScore(true, 800, 5, 200);


    }
// Khai báo tham số chuyền vào
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
