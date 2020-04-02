package Enemies;

import Weapons.Weapon;

public class Enemy {

    private int healthPoints;

    public Enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

}
