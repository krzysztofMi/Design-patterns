package facade;

import Eats.Cake;

public class Oven {
    private SpongeCake cake;
    private Integer bakeTime;


    public Oven(){
        bakeTime = 5;
    }

    public SpongeCake getCake() {
        return cake;
    }

    public Integer getBakeTime() {
        return bakeTime;
    }

    public void setBakeTime(Integer bakeTime) {
        this.bakeTime = bakeTime;
    }

    public void setCake(SpongeCake cake) {
        this.cake = cake;
    }

    public Cake bakeCake(){
        System.out.println("Bake time: " + bakeTime);
        System.out.println("Cake is baking.");
        for(int i = 0; i<bakeTime; i++){
            Integer status = cake.getCakeStatus();
            cake.setCakeStatus(status+1);
        }
        return cake;
    }
}
