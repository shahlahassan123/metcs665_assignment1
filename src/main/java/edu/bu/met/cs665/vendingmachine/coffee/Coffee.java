package edu.bu.met.cs665.vendingmachine.coffee;
import edu.bu.met.cs665.vendingmachine.BeverageInterface;

public class Coffee implements BeverageInterface {
    String beverage;

    public void createDrink(String coffee){
        /* Creating drink*/
        beverage = coffee;
    }

    public String getDrink(){
        /*Returns Drink Type */
        return beverage;
    }

}
