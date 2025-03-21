package Coding48;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        System.out.println(player);
        player.setWeapon("Axe");
        System.out.println("After changing weapon: " + player);

        List<String> savedData = player.write();
        Player newPlayer = new Player("Default", 1, 1);
        newPlayer.read(savedData);
        System.out.println("Loaded player: " + newPlayer);

        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println(monster);

        List<String> monsterData = monster.write();
        Monster newMonster = new Monster("Default", 1, 1);
        newMonster.read(monsterData);
        System.out.println("Loaded monster: " + newMonster);
    }
}
