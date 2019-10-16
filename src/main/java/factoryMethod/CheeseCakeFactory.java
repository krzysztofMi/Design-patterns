package factoryMethod;

import Eats.Cake;
import Eats.CheeseCake;

public class CheeseCakeFactory implements CakeFactory {

    @Override
    public Cake create() {
        return new CheeseCake();
    }
}
