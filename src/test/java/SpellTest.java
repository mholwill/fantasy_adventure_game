import Characters.Wizard;
import Enemies.Troll;
import MythicalCreatures.Creature;
import Weapons.Spell;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Wizard wizard;
    Spell spell;
    Troll troll;
    Sword sword;
    Creature creature;

    @Before
    public void setUp() {
        creature = new Creature("Dragon", 400);
        wizard = new Wizard("Merlin", 140);
        spell = new Spell("Expecto Patronum", 40);
        sword = new Sword("Sword1", 30);
        troll = new Troll("Calum", 50, sword);
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
    public void getCreatureType(){
        assertEquals("Dragon", creature.getType());
    }

    @Test
    public void addCreatureToWizard(){
        wizard.addCreature(creature);
        assertEquals(1, wizard.getCreatures());
    }

    @Test
    public void canDefendWizard(){
        creature.defend(sword);
        assertEquals(140, wizard.getHealthPoints());
        assertEquals(385, creature.getHealthPoints());
    }

    @Test
    public void canCastSpell(){
        wizard.addSpell(spell);
        spell.cast(troll);
        assertEquals(10, troll.getHealthPoints());
    }





}
