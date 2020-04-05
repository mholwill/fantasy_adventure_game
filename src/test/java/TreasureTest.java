import Treasures.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TreasureTest {

    Treasure treasure;

   @Before
    public void setUp(){
       treasure = new Treasure("GEM", 400);
   }

   @Test
    public void checkIfTreasureHasName(){
       assertEquals("GEM",treasure.getName());
   }

   @Test
    public void checkIfTreasureHasValue(){
       assertEquals(400,treasure.getValue());
   }

}
