package abstractFactory;

import Eats.Cake;
import Eats.MushroomSoup;
import Eats.Soup;
import Eats.StrawberryCake;

public class TuesdayMealFactory implements AbstractEatsFactory {
    @Override
    public Cake createCake() {
        return new StrawberryCake();
    }

    @Override
    public Soup createSoup() {
        return new MushroomSoup();
    }
}
