import Characters.Dwarf;
import Enemies.Orc;
import Party.Party;
import Rooms.Room;
import Treasures.Treasure;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Orc orc;
    Sword sword;
    Dwarf dwarf;
    Axe axe;
    Treasure treasure;
    Party party;

    @Before
    public void setUp(){
        party = new Party();
        treasure = new Treasure("Gem", 200);
        room= new Room("Castle");
        sword = new Sword("Sword1", 30);
        orc = new Orc("Trevor", 50, sword);
        dwarf = new Dwarf("Fraser",100);
        axe = new Axe("Hammer Head Axe",25);
        room.addEnemyToRoom(orc);
        room.addTreasure(treasure);
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

    @Test
    public void checkAddEnemyToRoom(){
        assertEquals(1, room.getEnemy());
    }

    @Test
    public void checkIfEnemyIsKilled(){
        dwarf.addWeapon(axe);
        dwarf.attack(axe, orc);
        dwarf.attack(axe, orc);
        room.checkEnemyStatus(orc);
        assertEquals(0, room.getEnemy());
    }

    @Test
    public void checkEnemyStatus(){
        room.checkEnemyStatus(orc);
        assertEquals(1, room.getEnemy());
        assertEquals(50, orc.getHealthPoints());
    }

    @Test
    public void checkHasTreasure(){
        assertEquals(1, room.getTreasure());
    }

    @Test
    public void checkIfGiveTreasureToParty(){
        dwarf.addWeapon(axe);
        dwarf.attack(axe, orc);
        dwarf.attack(axe, orc);
        room.checkEnemyStatus(orc);
        room.giveTreasureToParty(party, treasure);
        assertEquals(0, room.getTreasure());
        assertEquals(1, party.getTreasures());
    }

}
