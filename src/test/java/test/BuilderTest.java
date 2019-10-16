
package test;

import Eats.Cake;
import Eats.PotatoSoup;
import Eats.Soup;
import Eats.StrawberryCake;
import builder.Meal;
import org.junit.jupiter.api.Test;


public class BuilderTest {

    private Object Meal;
    @Test
    public void BuilderTest(){
         
        Soup soup = new PotatoSoup();
        Cake cake = new StrawberryCake();
        Meal meal = new Meal.MealBuilder(soup, cake).create();
    }
}
