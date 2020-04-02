package Characters;

import Weapons.IAttack;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }



//    public ArrayList<IAttack> getWeapons() {
//        return weapons;
//    }
}
