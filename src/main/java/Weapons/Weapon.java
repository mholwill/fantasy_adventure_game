package Weapons;

public class Weapon implements IWeapon {

    private int damagePoints;

    public Weapon(int damagePoints){
        this.damagePoints = damagePoints;
    }

    public void attack(Weapon Weapon) {
        this.damagePoints -= enemy.healthPoints;
    }
}