
package test;

import Eats.Cake;
import Eats.PotatoSoup;
import Eats.Soup;
import Eats.StrawberryCake;
import builder.Meal;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class BuilderTest {

    private Object Meal;
    @Test
    public void BuilderTest(){
         
        Soup soup = new PotatoSoup();
        Cake cake = new StrawberryCake();
        Meal meal = new Meal.MealBuilder(soup, cake).create();
        assertTrue(meal.getSoup() instanceof PotatoSoup, "Soup should be PotatoSoup!");
        assertTrue(meal.getCake() instanceof Cake, "Cake should be StrawberryCake!");
    }
}
