import Characters.Wizard;
import Enemies.Troll;
import Weapons.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Wizard wizard;
    Spell spell;
    Troll troll;

    @Before
    public void setUp() {
        wizard = new Wizard("Merlin", 140);
        spell = new Spell("Expecto Patronum", 40);
        troll = new Troll("Calum", 50);
    }

    @Test
    public void canGetName(){ assertEquals("Merlin",wizard.getName()); }

    @Test
    public void canGetHealthPoints(){
        assertEquals(140,wizard.getHealthPoints());
    }

    @Test
    public void checkSpellsEmpty(){
        assertEquals(0, wizard.getSpells());
    }

    @Test
    public void addSpell(){
        wizard.addSpell(spell);
        assertEquals(1, wizard.getSpells());
    }

    @Test
    public void canCastSpell(){
        wizard.addSpell(spell);
        spell.cast(troll);
        assertEquals(10, troll.getHealthPoints());
    }





}
