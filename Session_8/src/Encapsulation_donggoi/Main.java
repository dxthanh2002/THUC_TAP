package Encapsulation_donggoi;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,
                "Sword");
        int damage = 10;
        tim.loseHealth(damage);
        System.out.println("Remaining health = " + tim.healthRemaining());
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
