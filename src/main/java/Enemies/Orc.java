package Enemies;

import Characters.Player;
import Weapons.Sword;

public class Orc extends Enemy{

    public Orc(String name, int healthPoints, Sword sword) {
        super(name, healthPoints, sword);
    }

    public void attackPlayer(Player player){
        sword.attackPlayer(player);
    }

}
