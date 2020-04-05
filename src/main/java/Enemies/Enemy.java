package Enemies;

import Characters.Player;
import Weapons.Axe;
import Weapons.IAttack;
import Weapons.Sword;

public abstract class Enemy {

    private String name;
    protected int healthPoints;
    protected Sword sword;


    public Enemy(String name, int healthPoints, Sword sword){
        this.name = name;
        this.healthPoints = healthPoints;
        this.sword = sword;
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

    public Sword getSword(){
        return this.sword;
    }


//   Method Can take damage


}
