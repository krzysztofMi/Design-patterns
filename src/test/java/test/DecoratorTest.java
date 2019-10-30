/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import decorator.Food;
import decorator.FoodWithSalt;
import decorator.FoodWithSpices;
import decorator.Potato;
import org.junit.jupiter.api.Test;

/**
 *
 * @author student
 */
public class DecoratorTest {
    @Test
    public void testDecorator(){
        Food potato = new Potato();
        assertEquals(potato.taste(), "Taste potato", "Potato isn't tast :(");
        FoodWithSpices spices = new FoodWithSalt(potato);
        assertEquals(spices, "Taste potato with Salt", "Potato isn't salty :(");
    }
}
