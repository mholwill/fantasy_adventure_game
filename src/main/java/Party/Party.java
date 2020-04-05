package Party;

import Characters.Player;
import Treasures.Treasure;

import java.util.ArrayList;

public class Party {

    private ArrayList<Player> players;
    private ArrayList<Treasure> treasures;

    public Party(){
        this.players = new ArrayList<Player>();
        this.treasures = new ArrayList<Treasure>();
        getValuesOfTreasures();
    }

    public int getPlayers() {
        return players.size();
    }

    public int getTreasures() {
        return treasures.size();
    }

    public void addTreasure(Treasure treasure){
        this.treasures.add(treasure);
    }

    public int getValuesOfTreasures(){
        int total = 0;
        for (Treasure treasure : this.treasures){
            total += treasure.getValue();
        } return total;
    }
}
