package Characters;

import Enemies.Enemy;
import MythicalCreatures.Creature;
import MythicalCreatures.IDefend;
import Weapons.IAttack;
import Weapons.ISpell;
import Weapons.Spell;
import Weapons.Sword;

import java.util.ArrayList;

public class Wizard extends Player {

    private ArrayList<ISpell> spells;
    private ArrayList<IDefend> creatures;

    public Wizard(String name, int healthPoints) {
        super(name, healthPoints);
        this.spells = new ArrayList<ISpell>();
        this.creatures = new ArrayList<IDefend>();
    }


    public int getSpells() {
        return this.spells.size();
    }

    public void addSpell(Spell spell) {
        spells.add(spell);
    }

    public int getCreatures() {
        return this.creatures.size();
    }


    public void addCreature(Creature creature) {
        creatures.add(creature);
    }

    public void attack(ISpell spell, Enemy enemy) {
        if (this.spells.contains(spell)) {
            spell.cast(enemy);
        }
    }

    public void defend(IDefend creature, Sword sword){
        if (this.creatures.contains(creature)){
            creature.defend(sword);
        }
    }
}
