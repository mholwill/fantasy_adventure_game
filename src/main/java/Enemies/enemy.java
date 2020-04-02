package Enemies;

import Weapons.IAttack;

public class enemy implements IAttack {

    protected int healthPoints;

    public enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attack(Weapon weapon){
        this.healthPoints -= weapon.getDamagePoints();
    }
}
