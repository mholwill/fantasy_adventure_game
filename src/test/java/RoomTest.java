import Rooms.Exit;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void setUp(){
        room= new Room("Castle");
    }

    @Test
    public void checkExitsInTheRoom(){
        assertEquals(4,room.getExit());
    }

    @Test
    public void checkRoomsShuffled(){
        room.shuffleExits();
        assertEquals(4, room.getExit());
    }

}
