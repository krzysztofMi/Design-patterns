package observer;

import lombok.Getter;
import lombok.ToString;

@ToString(exclude = {"marketPrices"})
public class ShopPrices implements Observer {


    private int observerID;
    private Double eggPrice;
    private Double sugarPrice;
    private Double onionPrice;
    private String messageOfTheDay;
    private MarketPrices marketPrices;

    public ShopPrices(MarketPrices marketPrices){
        this.marketPrices = marketPrices;
        observerID = MarketPrices.ids++;
        marketPrices.register(this);
    }

    @Override
    public void update(Double eggPrice, Double sugarPrice, Double onionPrice, String messageOfTheDay) {
        this.eggPrice = eggPrice;
        this.sugarPrice = sugarPrice;
        this.onionPrice = onionPrice;
        this.messageOfTheDay = messageOfTheDay;

        System.out.println(this.toString());
    }



}
