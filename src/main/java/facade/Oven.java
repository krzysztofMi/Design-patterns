package facade;

import Eats.Cake;

public class Oven {
    private SpongeCake cake;

    public SpongeCake getCake() {
        return cake;
    }

    public void setCake(SpongeCake cake) {
        this.cake = cake;
    }

    public Cake bakeCake(Integer time){
        System.out.println("Cake is baking.");
        for(int i = 0; i<time; i++){
            Integer status = cake.getCakeStatus();
            cake.setCakeStatus(status+1);
        }
        return cake;
    }
}
