package org.vin;

import java.util.HashMap;

public class Board {

    private final int dimension;

    HashMap<Integer, SpecialEntity> specialEntities;

    public Board(int dimension)
    {
        this.dimension = dimension;
    }

    public void printBoard()
    {
        int totalCells = dimension*dimension;
        for(int i=totalCells; i > 0; i--)
        {
            System.out.print(" | " + i + " ");

            if(hasSpecialEntity(i))
                System.out.print(specialEntities.get(i).getID());

            System.out.print(" |");
            if(totalCells % 10 == 0)
                System.out.println();
        }
    }

    public int getTotalCells()
    {
        return dimension * dimension;
    }

    public void addSpecialEntity(SpecialEntity entity)
    {
        int actionPosition = entity.getActionPosition();

        specialEntities.put(actionPosition, entity);
    }

    public boolean hasSpecialEntity(int position)
    {
        return specialEntities.containsKey(position);
    }

    public SpecialEntity getSpecialEntity(int position)
    {
        if(hasSpecialEntity(position))
            return specialEntities.get(position);

        return null;
    }
}
