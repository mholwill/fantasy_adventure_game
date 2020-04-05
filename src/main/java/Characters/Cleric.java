package Characters;

import Enemies.Enemy;
import Weapons.HealPotion;
import Weapons.IAttack;
import Weapons.IHeal;

import java.util.ArrayList;

public class Cleric extends Player {

    private ArrayList<IHeal> potions;

    public Cleric(String name, int healthPoints) {
        super(name, healthPoints);
        this.potions= new ArrayList<IHeal>();
    }

    public int getPotions() {
        return this.potions.size();
    }

    public void addPotion(IHeal potion){
        this.potions.add(potion);
    }

    public void heal(IHeal HealPotion, Player player) {
        if (this.potions.contains(HealPotion)){
        HealPotion.heal(player);}
    }
    
}
