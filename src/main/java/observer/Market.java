package observer;


import java.util.ArrayList;
import java.util.List;

public class Market implements Subject {

    List<Observer> observerList = new ArrayList<>();

    static int ids = 0;

    private Double eggPrice;
    private Double sugarPrice;
    private Double onionPrice;
    private String messageOfTheDay;

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(eggPrice, sugarPrice, onionPrice, messageOfTheDay));
    }


    public Double getEggPrice() {
        return eggPrice;
    }

    public void setEggPrice(Double eggPrice) {
        this.eggPrice = eggPrice;
        this.notifyObservers();
    }

    public Double getSugarPrice() {
        return sugarPrice;
    }

    public void setSugarPrice(Double sugarPrice) {
        this.sugarPrice = sugarPrice;
        this.notifyObservers();
    }

    public Double getOnionPrice() {
        return onionPrice;
    }

    public void setOnionPrice(Double onionPrice) {
        this.onionPrice = onionPrice;
        this.notifyObservers();
    }

    public String getMessageOfTheDay() {
        return messageOfTheDay;
    }

    public void setMessageOfTheDay(String messageOfTheDay) {
        this.messageOfTheDay = messageOfTheDay;
        this.notifyObservers();
    }
}
