package Characters;

import Weapons.IAttack;

import java.util.ArrayList;

public class Dwarf extends Player{

    private ArrayList<IAttack> weapons;


    public Dwarf(String name, int healthPoints, IAttack weapons) {
        super(name, healthPoints);
        this.weapons=new ArrayList<IAttack>();
    }
}
