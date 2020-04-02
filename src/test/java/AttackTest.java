import Characters.Dwarf;
import Enemies.Enemy;
import Enemies.Orc;
import Weapons.Axe;
import Weapons.IAttack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackTest {

    Dwarf dwarf;
    Axe axe;
    Orc orc;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Fraser",100);
        axe = new Axe("Hammer Head Axe",25);
        orc = new Orc("Trevor", 50);
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






}
