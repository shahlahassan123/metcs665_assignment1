package edu.bu.met.cs665.condiments;

public class Condiments implements CondimentsInterface{

    public static final int MAX_UNIT = 3;
    int currentMilkUnit =0;
    int currentSugarUnit = 0;


    public void addMilk(){
        /* Add 1 unit of milk*/
        currentMilkUnit ++;
    }

    public int getMilkUnit(){
        /* Returns unit of milk added*/
        return currentMilkUnit;
    }

    public void addSugar(){
        /* Add 1 unit of sugar*/
        currentSugarUnit++;
    }

    public int getSugarUnit(){
        /* Returns unit of sugar added*/
        return currentSugarUnit;
    }

    public int getNumberOfCondiments() {
        /* Returns the total number of condiments added*/
        int units = currentMilkUnit + currentSugarUnit;
        return units;
    }


}
