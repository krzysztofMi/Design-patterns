
import Eats.*;
import factoryMethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryMethodTest {
    @Test
    public void getMushroomSoupTest(){
        SoupFactory factory = new MushroomSoupFactory();
        Soup soup = factory.create();
        assertTrue(soup instanceof MushroomSoup, "This is not a mushrooms soup!");
        assertTrue(soup instanceof Soup, "This is not a Soup!");
        assertFalse(soup instanceof PotatoSoup, "This is a potato soup!");
    }

    @Test
    public void getPotatoSoupTest(){
        SoupFactory factory = new PotatoSoupFactory();
        Soup soup = factory.create();
        assertTrue(soup instanceof PotatoSoup, "This is not a mushrooms soup!");
        assertTrue(soup instanceof Soup, "This is not a Soup!");
        assertFalse(soup instanceof MushroomSoup, "This is a mushrooms soup!");
    }

    @Test void getSoupTest(){
        SoupFactory factory = new PotatoSoupFactory();
        Soup soup = factory.create();
        assertTrue(soup instanceof Soup, "This is not a Soup!");
        factory = new MushroomSoupFactory();
        soup = factory.create();
        assertTrue(soup instanceof Soup, "This is not a Soup!");
    }

    @Test void getCakeTest(){
        CakeFactory factory = new StrawberryCakeFactory();
        Cake cake = factory.create();
        assertTrue(cake instanceof Cake, "This is not a cake!");
        factory = new CheeseCakeFactory();
        cake = factory.create();
        assertTrue(cake instanceof Cake, "This is not a cake!");
    }

    @Test void getStrawberryCake(){
        CakeFactory factory = new StrawberryCakeFactory();
        Cake cake = factory.create();
        assertTrue(cake instanceof StrawberryCake, "This is not a strawberry cake!");
        assertTrue(cake instanceof Cake, "This is not a cake!");
        assertFalse(cake instanceof CheeseCake, "This is a cheese cake!");
    }

    @Test void getCheeseCake(){
        CakeFactory factory = new CheeseCakeFactory();
        Cake cake = factory.create();
        assertTrue(cake instanceof CheeseCake, "This is not a cheese cake!");
        assertTrue(cake instanceof Cake, "This is not a cake!");
        assertFalse(cake instanceof StrawberryCake, "This is a strawberry cake!");
    }
}
