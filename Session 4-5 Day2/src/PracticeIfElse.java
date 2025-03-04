public class PracticeIfElse {
    //method là 1 hoặc nhiều tập hợp các câu lệnh thực hiện 1 THAO TÁC
    //MAIN METHOD là nơi java tìm kiếm đầu tiên để chạy
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

    }
}
