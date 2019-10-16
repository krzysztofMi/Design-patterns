package factoryMethod;

import Eats.PotatoSoup;
import Eats.Soup;

public class PotatoSoupFactory implements SoupFactory {
    @Override
    public Soup create() {
        return new PotatoSoup();
    }
}
