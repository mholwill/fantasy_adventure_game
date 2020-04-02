package Characters;

import Weapons.ISpell;

import java.util.ArrayList;

public class Wizard extends Player{

    private ArrayList<ISpell> spells;

    public Wizard(String name, int healthPoints) {
        super(name, healthPoints);
        this.spells = new ArrayList<ISpell>();
    }


}
