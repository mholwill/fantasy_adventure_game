package Weapons;

import Enemies.Enemy;

public class Spell implements ISpell {

    private String name;
    private int spellDamage;

    public Spell(String name, int spellDamage){
        this.name = name;
        this.spellDamage = spellDamage;
    }

    public void cast(Enemy enemy) {
        int healthpoints = enemy.getHealthPoints();
        healthpoints -= this.spellDamage;
        enemy.setHealthPoints(healthpoints);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePoints() {
        return spellDamage;
    }
}
