package Coding48;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    // write code here
    private String name;
    private int hitPoints;
    private int strength;

    // Constructor
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    // Implement write() từ ISaveable
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add(String.valueOf(this.hitPoints));
        values.add(String.valueOf(this.strength));
        return values;
    }

    // Implement read() từ ISaveable
    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    // Override toString()
    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + "}";
    }
}
