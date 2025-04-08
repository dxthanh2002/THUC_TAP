package Q16.games;


import Q16.games.poker.PokerGame;

public class GameController {

    public static void main(String[] args) {

        PokerGame fiveCardDraw = new PokerGame(4, 10);
        fiveCardDraw.startPlay();

    }
}
