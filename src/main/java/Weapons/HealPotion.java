package Weapons;

import Characters.Player;

public class HealPotion implements IHeal {

    private String name;
    private int healingPower;

    public HealPotion(String name, int healingPower){
        this.name = name;
        this.healingPower = healingPower;
    }


    public void heal(Player player) {
        int healPoints = this.healingPower += player.getHealthPoints();
        player.setHealthPoints(healPoints);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
