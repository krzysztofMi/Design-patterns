package test;

import observer.Market;
import observer.Observer;
import observer.Shop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObserverTest {

    @Test
    public void nullTesting(){
        Market subject = new Market();
        Shop shop1 = new Shop(subject);
        assertTrue(shop1.getEggPrice() == null);
        assertTrue(shop1.getOnionPrice() == null);
        assertTrue(shop1.getSugarPrice() == null);
        assertTrue(shop1.getMessageOfTheDay() == null);
        subject.setSugarPrice(5.00);
        assertTrue(Double.compare(5.00, shop1.getSugarPrice()) == 0);
    }

    @Test
    public void testing(){
        Market subject = new Market();
        Shop shop1 = new Shop(subject);
        assertTrue(shop1.getEggPrice() == null);
        assertTrue(shop1.getOnionPrice() == null);
        assertTrue(shop1.getSugarPrice() == null);
        assertTrue(shop1.getMessageOfTheDay() == null);
        subject.setEggPrice(10.00);
        subject.setSugarPrice(15.00);
        subject.setOnionPrice(20.00);
        assertTrue(Double.compare(10.00, shop1.getEggPrice()) == 0);
        assertTrue(Double.compare(15.00, shop1.getSugarPrice()) == 0);
        assertTrue(shop1.getOnionPrice() != null);
        Shop shop2 = new Shop(subject);
        String messageOfTheDay = "Jaja, świeże jaja";
        subject.setMessageOfTheDay(messageOfTheDay);

        assertEquals(shop1.getMessageOfTheDay(), messageOfTheDay);
        assertEquals(shop2.getMessageOfTheDay(), messageOfTheDay);
        subject.setEggPrice(8.0);
        assertTrue(Double.compare(8.00, shop1.getEggPrice()) == 0);
        assertTrue(Double.compare(8.00, shop1.getEggPrice()) == 0);

    }
}
