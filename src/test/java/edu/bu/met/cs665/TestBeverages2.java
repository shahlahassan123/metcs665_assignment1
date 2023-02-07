package edu.bu.met.cs665;

import edu.bu.met.cs665.condiments.Condiments;
import edu.bu.met.cs665.vendingmachine.coffee.Coffee;
import edu.bu.met.cs665.vendingmachine.tea.Tea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeverages2 {
    //This has the failed test cases
    @Test
    public void TestBlackTeaWith4UnitsMilk(){
        // Adding 4 Units of Milk
        Tea tea = new Tea();
        Condiments condiments = new Condiments();
        tea.createDrink("Black Tea");
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        assertEquals(3, condiments.getNumberOfCondiments());
    }

    @Test
    public void TestBlackTeaWith6UnitsSugar(){
        // Adding 6 Units of Sugar
        Tea tea = new Tea();
        Condiments condiments = new Condiments();
        tea.createDrink("Black Tea");
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        assertEquals(3, condiments.getNumberOfCondiments());
    }

    @Test
    public void TestLatteWith6USugar6UMilk(){
        // Adding 6 Units of Milk and 6 units of sugar
        Coffee coffee = new Coffee();
        Condiments condiments = new Condiments();
        coffee.createDrink("Latte");
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        assertEquals(6, condiments.getNumberOfCondiments());
    }

}
