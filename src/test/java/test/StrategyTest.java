package test;

import org.junit.jupiter.api.Test;
import strategy.DontRun;
import strategy.Human;
import strategy.RunFast;
import strategy.RunSlow;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    public void strategyTest(){

        Human human = new Human();
        human.setRunType(new RunFast());
        System.out.println(human.run());
        assertEquals(human.run(), "You run fast.");

        human.setRunType(new RunSlow());
        System.out.println("You are tired ;(");
        System.out.println(human.run());
        assertEquals(human.run(), "You run slow.");

        System.out.println("You enter danger zone!");
        human.setRunType(new DontRun());
        System.out.println(human.run());
        assertEquals(human.run(), "You are not allowed to run.");
    }
}
