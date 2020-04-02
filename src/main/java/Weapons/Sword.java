package Weapons;

import Characters.Player;
import Enemies.Enemy;

public class Sword implements IAttack {

    private String name;
    private int damage;

    public Sword(String name, int damage){
        this.name=name;
        this.damage=damage;
    }

    public void attack(Enemy enemy) {
        int healthpoints = enemy.getHealthPoints();
        healthpoints -= this.damage;
        enemy.setHealthPoints(healthpoints);
    }

    public void attackPlayer(Player player) {
        int healthpoints = player.getHealthPoints();
        healthpoints -= this.damage;
        player.setHealthPoints(healthpoints);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePoints() {
        return damage;
    }
}
