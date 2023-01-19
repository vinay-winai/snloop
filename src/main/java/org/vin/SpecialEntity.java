package org.vin;

abstract class SpecialEntity {

    int start;
    int end;

    public abstract String getID();

    public int getActionPosition()
    {
        return this.start;
    }

    public int getEndPosition()
    {
        return this.end;
    }
}