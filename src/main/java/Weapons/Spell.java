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
        int damagePoints = this.spellDamage -= enemy.getHealthPoints();
        enemy.setHealthPoints(damagePoints);
    }
}
