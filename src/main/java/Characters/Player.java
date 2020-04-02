package Characters;

import java.util.ArrayList;

import Weapons.weapon;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<Weapons> weapons;

    public Player(String name, int healthPoints, Weapons weapons){
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Weapons>();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }
}
