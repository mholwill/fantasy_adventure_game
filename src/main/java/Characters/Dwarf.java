package Characters;

import Weapons.IAttack;

import java.util.ArrayList;

public class Dwarf extends Player{

    private ArrayList<IAttack> weapons;


    public Dwarf(String name, int healthPoints) {
        super(name, healthPoints);
        this.weapons = new ArrayList<IAttack>();
    }

    public int getWeapons() {
        return this.weapons.size();
    }

    public void addWeapon(IAttack weapon){
        this.weapons.add(weapon);
    }

}
