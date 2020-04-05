package Treasures;

public class Treasure {

    private String name;
    protected int value;

    public Treasure(String name, int value){
        this.name= name;
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
