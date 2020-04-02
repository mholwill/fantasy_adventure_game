package Weapons;

import Enemies.Enemy;


public class Axe implements IAttack{

    private String name;
    private int damage;

    public Axe(String name, int damage){
        this.name=name;
        this.damage=damage;
    }


    public void attack(Enemy enemy) {
        int healthpointsTaken = this.damage -= enemy.getHealthPoints();
        enemy.setHealthPoints(healthpointsTaken);
    }
}
