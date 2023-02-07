package edu.bu.met.cs665;

import edu.bu.met.cs665.condiments.Condiments;
import edu.bu.met.cs665.vendingmachine.coffee.Coffee;
import edu.bu.met.cs665.vendingmachine.tea.Tea;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBeverage {

   @Test
    public void TestGreenTeaWith3UnitsMilk(){
       // Adding 3 Units of Milk
       Tea tea = new Tea();
       Condiments condiments = new Condiments();
        tea.createDrink("Green Tea");
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        assertEquals(3, condiments.getNumberOfCondiments());
    }

    @Test
    public void TestBlackTeaWith2UMilkand1USugar(){
        // Adding 2 Units of Milk and 1 unit of Sugar
        Tea tea = new Tea();
        Condiments condiments = new Condiments();
        tea.createDrink("Black Tea");
        condiments.addMilk();
        condiments.addMilk();
        condiments.addSugar();
        assertEquals(3, condiments.getNumberOfCondiments());
    }

    @Test
    public void TestYellowTeaWith1UMilkand1USugar(){
        // Adding 1 Units of Milk and 1 unit of Sugar
        Tea tea = new Tea();
        Condiments condiments = new Condiments();
        tea.createDrink("Yellow Tea");
        condiments.addMilk();
        condiments.addSugar();
        assertEquals(2, condiments.getNumberOfCondiments());
    }


    @Test
    public void TestExpressoWithNoCondiments(){
        // Adding No Condiments
        Coffee coffee = new Coffee();
        Condiments condiments = new Condiments();
        coffee.createDrink("Expresso");
        assertEquals(0, condiments.getNumberOfCondiments());
    }

    @Test
    public void TestAmericanoWith1USugar(){
        // Adding  1 unit of Sugar
        Coffee coffee = new Coffee();
        Condiments condiments = new Condiments();
        coffee.createDrink("Americano");
        condiments.addSugar();
        assertEquals(1, condiments.getNumberOfCondiments());
    }

    @Test
    public void TestLatteWith3USugar(){
        // Adding  3 unit of Sugar
        Coffee coffee = new Coffee();
        Condiments condiments = new Condiments();
        coffee.createDrink("Latte");
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        assertEquals(3, condiments.getNumberOfCondiments());
    }
    @Test
    public void TestLatteWith3USugar3UMilk(){
        // Adding 3 Units of Milk and 3 unit of Sugar
        Coffee coffee = new Coffee();
        Condiments condiments = new Condiments();
        coffee.createDrink("Latte");
        condiments.addSugar();
        condiments.addSugar();
        condiments.addSugar();
        condiments.addMilk();
        condiments.addMilk();
        condiments.addMilk();
        assertEquals(6, condiments.getNumberOfCondiments());
    }



}
