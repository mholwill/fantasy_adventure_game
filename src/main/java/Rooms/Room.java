package Rooms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Room {

    private String name;
    private ArrayList<Exit> exits;

    public Room(String name){
        this.name = name;
        this.exits = new ArrayList<Exit>();
        addExitsToRoom();
        shuffleExits();
    }

    public int getExit() {
        return exits.size();
    }

    public void addExitsToRoom(){
        for (Exit exit : Exit.values()){
            this.exits.add(exit);
        }
    }

    public void shuffleExits(){
        Collections.shuffle(exits);
    }

}
