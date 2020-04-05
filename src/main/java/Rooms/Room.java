package Rooms;

import Enemies.Enemy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Room {

    private String name;
    private ArrayList<Exit> exits;
    private ArrayList<Enemy> enemy;

    public Room(String name){
        this.name = name;
        this.exits = new ArrayList<Exit>();
        addExitsToRoom();
        shuffleExits();
        this.enemy = new ArrayList<Enemy>();
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

    public void addEnemyToRoom(Enemy enemy){
            this.enemy.add(enemy);
    }

    public int getEnemy(){
        return this.enemy.size();
    }

    public void checkEnemyStatus(Enemy enemy){
        if(enemy.getHealthPoints() <= 0){
            this.enemy.remove(enemy);
        }
    }

}
