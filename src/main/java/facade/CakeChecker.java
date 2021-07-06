package facade;

import Eats.Cake;

public class CakeChecker {
    SpongeCake spongeCake;

    public CakeChecker(){

    }

    public void checkCakeStatus(Cake cake) {
        spongeCake =(SpongeCake) cake;
        if(spongeCake.getCakeStatus() < 10){
            System.out.println("Cake is not ready yet.");
        }else if(spongeCake.getCakeStatus() < 15) {
            System.out.println("Cake is good");
        }else{
            System.out.println("You burn the cake");
        }

    }
}
