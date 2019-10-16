package Eats;

import Eats.Soup;

public class PotatoSoup implements Soup {
    @Override
    public void cook() {
        System.out.println("Wait five minutes for cooking potato soup.");
    }
}
