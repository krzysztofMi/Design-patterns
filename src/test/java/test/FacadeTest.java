package test;

import Eats.Cake;
import facade.CakeMaker;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class FacadeTest {

    @Test
    public void testFacade(){
        CakeMaker cakeMaker = new CakeMaker();
        Map<String, Integer> ingredients = new HashMap<String, Integer>(){
            {
                put("egg", 10);
                put("sugar", 10);
                put("flour", 5);
            }};
        System.out.println(cakeMaker.getCakeStatus());
        cakeMaker.makeCake(ingredients, 8);
        assert (12 == cakeMaker.getCakeStatus());
    }
}
