package Adapter;

public class HungryClient implements Client {
    @Override
    public String orderFood() {
        return  "Order a lot of food.";
    }
}
