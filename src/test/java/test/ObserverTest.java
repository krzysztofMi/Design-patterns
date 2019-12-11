package test;

import observer.MarketPrices;
import observer.Observer;
import observer.ShopPrices;
import org.junit.jupiter.api.Test;

public class ObserverTest {
    @Test
    public void observerTest(){
        MarketPrices marketPrices = new MarketPrices();

        Observer observer1 = new ShopPrices(marketPrices);

        marketPrices.setEggPrice(2.0);
        marketPrices.setOnionPrice(3.5);
        marketPrices.setSugarPrice(10.0);
        marketPrices.setMessageOfTheDay("Hello world");

        System.out.println(observer1.toString());

        Observer observer2 = new ShopPrices(marketPrices);

        marketPrices.setSugarPrice(5.0);
        marketPrices.setMessageOfTheDay("Wow");


    }
}
