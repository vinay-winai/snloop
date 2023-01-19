package org.vin;

public class Player{

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    int position;

    public String getName() {
        return name;
    }

    String name;

    public Player(String name)
    {
        this.name = name;
        this.position = 0;
    }
}
