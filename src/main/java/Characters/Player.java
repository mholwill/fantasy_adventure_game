package Characters;

public abstract class Player {

    private int healthPoints;
    private ArrayList<Weapons> weapons;

    public Player(int healthPoints, Weapons weapons){
        this.healthPoints = healthPoints;
        this.weapons = new ArrayList<Weapons>();
    }

}
