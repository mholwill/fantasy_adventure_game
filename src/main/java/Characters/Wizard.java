package Characters;

import Weapons.ISpell;
import Weapons.Spell;

import java.util.ArrayList;

public class Wizard extends Player{

    private ArrayList<ISpell> spells;

    public Wizard(String name, int healthPoints) {
        super(name, healthPoints);
        this.spells = new ArrayList<ISpell>();
    }


    public int getSpells() {
        return this.spells.size();
    }

    public void addSpell(Spell spell) {
        spells.add(spell);
    }
}
