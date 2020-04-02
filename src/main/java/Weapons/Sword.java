package Weapons;

import Enemies.Enemy;

public class Sword implements IAttack {

    private String name;
    private int damage;

    public Sword(String name, int damage){
        this.name=name;
        this.damage=damage;
    }

    public void attack(Enemy enemy) {
        int healthpointsTaken = this.damage -= enemy.getHealthPoints();
        enemy.setHealthPoints(healthpointsTaken);
    }
}
