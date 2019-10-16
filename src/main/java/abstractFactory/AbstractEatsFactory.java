package abstractFactory;

import Eats.Cake;
import Eats.Soup;

public interface AbstractEatsFactory {
    Cake createCake();
    Soup createSoup();
}
