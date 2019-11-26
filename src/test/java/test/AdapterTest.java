
package test;


import Adapter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {
   @Test
   public void mainChefTest(){
       Chef chef = new MainChef();
       assertEquals("Make tasty food.", chef.makeFood(),"Chef don't make tasty food ;(");
   }

   @Test
   public void hungryClientTest(){
       Client client = new HungryClient();
       assertEquals("Order a lot of food.", client.orderFood(), "Client is not hungry! He doesn't order a lot of food :(");
   }

   @Test
    public void clientAdapterTest(){
       Chef client = new ClientAdapter();
       assertEquals("Order a lot of food. Make food.", client.makeFood(), "Client can't order and make food :(");
   }
}
