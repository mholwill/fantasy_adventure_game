import Characters.Dwarf;
import Enemies.Orc;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackTest {

    Dwarf dwarf;
    Axe axe;
    Orc orc;
    Sword sword;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Fraser",100);
        axe = new Axe("Hammer Head Axe",25);
        sword = new Sword("Sword1", 30);
        orc = new Orc("Trevor", 50, sword);
    }

    @Test
    public void canGetName(){
        assertEquals("Fraser", dwarf.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void checkWeaponsEmpty(){
        assertEquals(0, dwarf.getWeapons());
    }

    @Test
    public void addWeapon(){
        dwarf.addWeapon(axe);
        assertEquals(1, dwarf.getWeapons());
    }

    @Test
    public void canAttackEnemy(){
        dwarf.addWeapon(axe);
        axe.attack(orc);
        assertEquals(25, orc.getHealthPoints());
    }

    @Test
    public void canCheckAttackPlayer(){
        sword.attackPlayer(dwarf);
        assertEquals(70, dwarf.getHealthPoints());
    }






}
