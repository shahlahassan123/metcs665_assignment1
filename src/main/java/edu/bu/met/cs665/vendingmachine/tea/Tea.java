package edu.bu.met.cs665.vendingmachine.tea;

import edu.bu.met.cs665.condiments.Condiments;
import edu.bu.met.cs665.vendingmachine.BeverageInterface;

import java.util.ArrayList;

public class Tea implements BeverageInterface {

    String beverage;

    public void createDrink(String tea){
        /* Creating drink*/
          beverage = tea;
    }

    public String getDrink(){
        /* Returns Drink Type */
        return beverage;
    }





}
