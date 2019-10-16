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
    
    @Test
    public void singletonTest(){
        Restaurant restaurant1 = Restaurant.getRestaurant();   
        Restaurant restaurant2 = Restaurant.getRestaurant();
        
        assertTrue(restaurant1.equals(restaurant2), "To nie jest singleton!");
        restaurant1.setName("Tomek");
        assertEquals(restaurant2.getName(), "Tomek", "Wartoœæ name nie zosta³a zmieniowa w drugiej instancji!");
        
    }
    
}
