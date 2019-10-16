package factoryMethod;

import Eats.MushroomSoup;
import Eats.Soup;

public class MushroomSoupFactory implements SoupFactory {
    @Override
    public Soup create() {
        return new MushroomSoup();
    }
}
