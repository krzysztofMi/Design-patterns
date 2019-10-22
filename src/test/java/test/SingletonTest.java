/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import singleton.Restaurant;

/**
 *
 * @author student
 */
public class SingletonTest {
    Restaurant restaurant1 = Restaurant.getRestaurant();
    Restaurant restaurant2 = Restaurant.getRestaurant();

    @Test
    public void singletonReferenceTest(){
        assertTrue(restaurant1.equals(restaurant2), "That is not a singleton!");
    }

    @Test
    public void singletonChangeValueTest(){
        restaurant1.setName("Tomek");
        assertEquals(restaurant2.getName(), "Tomek", "Value name was not changed in second reference!");
        restaurant2.setName("Wojtek");
        assertEquals(restaurant1.getName(), "Wojtek", "Value name was not changed in second reference!");
        assertEquals(restaurant2.getName(), restaurant1.getName(), "Name in both references are different! Should be the same.");
    }
}
