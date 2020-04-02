package Characters;

import MythicalCreatures.Creature;
import MythicalCreatures.IDefend;
import Weapons.ISpell;
import Weapons.Spell;

import java.util.ArrayList;

public class Wizard extends Player{

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
}
