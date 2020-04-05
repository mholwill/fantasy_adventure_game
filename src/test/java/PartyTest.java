import Treasures.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    Party party;
    Treasure treasure1;
    Treasure treasure2;

    @Before
    public void setUp(){
        party=new Party();
        treasure1 = new Treasure("GEM",400);
        treasure2 = new Treasure("Ruby",300);
        party.addTreasure(treasure1);
        party.addTreasure(treasure2);
    }

    @Test
    public void checkTotalValueOfTreasures(){
        assertEquals(700,party.getValuesOfTreasures());
    }




}
