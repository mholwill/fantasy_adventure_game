import Characters.Dwarf;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackTest {

    Dwarf dwarf;
    Axe axe;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Fraser",100);
        axe = new Axe("Hammer Head Axe",25);
    }

    @Test
    public void canGetName(){
        assertEquals("Fraser", dwarf.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }



}
