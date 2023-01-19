package org.vin;

public class Dice{

    int maxValue;

    public Dice(int maxVal)
    {
        this.maxValue = maxVal;
    }

    public int roll()
    {
        return (int) Math.floor(Math.random()*maxValue + 1);
    }
}
