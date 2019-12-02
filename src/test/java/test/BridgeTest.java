package test;

import bridge.*;
import org.junit.jupiter.api.Test;

import javax.management.remote.JMXServerErrorException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 *
 * @author student
 */
public class BridgeTest {
    
    @Test
    public void bridgeTest(){
        Food food = new MeatFood(new Pork());
        meetTest((MeatFood)food);
        food = new MeatFood(new Beef());
        meetTest((MeatFood)food);
    }


    public void meetTest(MeatFood food){
        String foodName = food.getMeat() instanceof Beef ? "beef" : "pork";
        assertTrue(food.isCooked() == false);
        assertEquals("You eat raw " + foodName + ".", food.eat());
        assertEquals("You cook " + foodName + ".", food.cook());
        assertEquals("You eat cooked " + foodName + ".", food.eat());
        assertTrue(food.isCooked() == true);
    }
}
