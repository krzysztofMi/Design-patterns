package test;

import composite.Composite;
import composite.Egg;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class CompositeTest {

    @Test
    public void eggBreakTest(){
        Egg egg1 = new Egg(10);
        egg1.breakEgg();
        assert (egg1.getSize() == 0);
    }

    @Test
    public void eggSizeTest(){
        Egg egg = new Egg(5);
        assert (egg.getSize() == 5);
    }

    @Test
    public void compositeTest(){
        Egg egg1 = new Egg(10);
        Egg egg2 = new Egg(10);
        Egg egg3 = new Egg(10);
        Egg egg4 = new Egg(10);
        List<Egg> eggList = new LinkedList<>(){
            {
                add(egg1);
                add(egg2);
                add(egg3);
            }
        };
        eggList.add(egg4);
        Composite eggComposite = new Composite(eggList);
        eggComposite.remove(egg2);
        eggComposite.breakEgg();
        assert (egg1.getSize() == 0);
        assert (egg2.getSize() == 10);
        assert (egg3.getSize() == 0);
        assert (egg4.getSize() == 0);

        assert (eggComposite.getSize() == 0);

        eggComposite.add(egg2);

        assert (eggComposite.getSize() == 10);

    }
}
