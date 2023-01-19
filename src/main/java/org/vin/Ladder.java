package org.vin;

public class Ladder extends SpecialEntity{

    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String getID() {
        return "L_"+ this.getEndPosition();
    }
}
