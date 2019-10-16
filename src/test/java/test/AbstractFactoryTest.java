package test;



import Eats.*;
import abstractFactory.AbstractEatsFactory;
import abstractFactory.MondayMealFactory;
import abstractFactory.TuesdayMealFactory;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

    @Test public void mondayMealFactoryTest(){
        AbstractEatsFactory factory = new MondayMealFactory();
        Cake cake = factory.createCake();
        Soup soup = factory.createSoup();
        assertTrue(cake instanceof CheeseCake, "On Monday you can eat only cheese cake!");
        assertTrue(soup instanceof PotatoSoup, "On Monday you can eat only potato soup!");
        assertFalse(soup instanceof MushroomSoup, "You can't eat mushroom soup on Monday!");
        assertFalse(soup instanceof StrawberryCake, "You can't eat strawberry cake on Monday!");
    }

    @Test public void tuesdayMealFactoryTest(){
        AbstractEatsFactory factory = new TuesdayMealFactory();
        Cake cake = factory.createCake();
        Soup soup = factory.createSoup();
        assertTrue(cake instanceof StrawberryCake, "On Tuesday you can eat only strawberry cake!");
        assertTrue(soup instanceof MushroomSoup, "On Tuesday you can eat only mushroom soup!");
        assertFalse(soup instanceof PotatoSoup, "You can't eat potato soup on Tuesday!");
        assertFalse(soup instanceof CheeseCake, "You can't eat cheese cake on Tuesday!");
    }

    @Test public void eatsTest(){
        AbstractEatsFactory factory = new TuesdayMealFactory();
        Cake cake = factory.createCake();
        Soup soup = factory.createSoup();
        assertTrue(cake instanceof Cake, "Cake is not a cake!");
        assertTrue(soup instanceof Soup, "Soup is not a soup!");
        factory = new MondayMealFactory();
        cake = factory.createCake();
        soup = factory.createSoup();
        assertTrue(cake instanceof Cake, "Cake is not a cake!");
        assertTrue(soup instanceof Soup, "Soup is not a soup!");
    }




}
