package MythicalCreatures;

import Weapons.Sword;

public class Creature implements IDefend {

    private String type;
    private int healthPoints;

    public Creature(String type, int healthPoints){
        this.type = type;
        this.healthPoints = healthPoints;
    }

    public String getType() {
        return type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void defend(Sword sword) {
        int defensivePoints = sword.getDamagePoints() / 2;
        this.healthPoints -= defensivePoints;
    }

}
