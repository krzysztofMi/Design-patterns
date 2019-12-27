package observer;

import lombok.Getter;
import lombok.ToString;

@ToString(exclude = {"marketPrices"})
public class Shop implements Observer {


    private int observerID;
    @Getter
    private Double eggPrice;
    @Getter
    private Double sugarPrice;
    @Getter
    private Double onionPrice;
    @Getter
    private String messageOfTheDay;
    private Market market;

    public Shop(Market market){
        this.market = market;
        observerID = Market.ids++;
        market.register(this);
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
