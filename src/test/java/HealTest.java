import Characters.Cleric;
import Characters.Dwarf;
import Enemies.Orc;
import Weapons.HealPotion;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealTest {
    
    Cleric cleric;
    Dwarf dwarf;
    Orc orc;
    Sword sword;
    HealPotion potion;
    
    @Before
    public void setUp(){
        cleric=new Cleric("Monk",130);
        dwarf = new Dwarf("Fraser",100);
        potion = new HealPotion("Heal me now!", 20);
        sword = new Sword("Sword1", 30);
        orc = new Orc("Trevor", 50, sword);
    }

    @Test
    public void canGetNameOfPotion(){
        assertEquals("Heal me now!",potion.getName());
    }

    @Test
    public void checkPotionsEmpty(){
        assertEquals(0, cleric.getPotions());
    }

    @Test
    public void addPotion(){
        cleric.addPotion(potion);
        assertEquals(1,cleric.getPotions());
    }

    @Test
    public void canHealPlayer(){
        sword.attackPlayer(dwarf);
        potion.heal(dwarf);
        assertEquals(90,dwarf.getHealthPoints());
    }





}
