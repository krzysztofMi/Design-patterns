package abstractFactory;

import Eats.Cake;
import Eats.CheeseCake;
import Eats.PotatoSoup;
import Eats.Soup;

public class MondayMealFactory implements AbstractEatsFactory {
    @Override
    public Cake createCake() {
        return new CheeseCake();
    }

    @Override
    public Soup createSoup() {
        return new PotatoSoup();
    }
}
