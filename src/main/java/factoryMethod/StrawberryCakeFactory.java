package factoryMethod;

import Eats.Cake;
import Eats.StrawberryCake;

public class StrawberryCakeFactory implements CakeFactory{
    @Override
    public Cake create() {
        return new StrawberryCake();
    }
}
