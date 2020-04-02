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
        int healthpoints = enemy.getHealthPoints();
        healthpoints -= this.damage;
        enemy.setHealthPoints(healthpoints);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
