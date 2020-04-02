package Enemies;

import Weapons.IAttack;

public abstract class Enemy {

    private String name;
    protected int healthPoints;

    public Enemy(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//   Method Can take damage


}
