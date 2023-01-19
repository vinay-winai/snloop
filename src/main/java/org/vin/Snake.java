package org.vin;

public class Snake extends SpecialEntity{

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String getID() {
        return "S_"+ this.getEndPosition();
    }
}