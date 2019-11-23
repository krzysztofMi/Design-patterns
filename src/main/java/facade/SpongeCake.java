package facade;

import Eats.Cake;

import java.util.Map;

public class SpongeCake implements Cake {
    Integer cakeStatus = 0;
    Map<String, Integer> ingrediens;

    public SpongeCake(Map<String, Integer> ingrediens){
        this.ingrediens = ingrediens;
    }

    public SpongeCake(){}

    @Override
    public void bake() {

    }

    public Cake prepareCake(){
        addIngrediens();
        makeCake();
        return this;
    }

    private void makeCake() {
        cakeStatus++;
    }

    private void addEggs(){
        cakeStatus++;
        Integer eggNumbers = ingrediens.get("egg");
        ingrediens.put("egg", eggNumbers-3);
    }

    private void addFlour(){
        cakeStatus++;
        Integer flourNumbers = ingrediens.get("flour");
        ingrediens.put("flour", flourNumbers-1);
    }

    private void addSugar(){
        cakeStatus++;
        Integer sugarNumber = ingrediens.get("sugar");
        ingrediens.put("sugar", sugarNumber-1);
    }

    private void addIngrediens(){
        addEggs();
        addFlour();
        addSugar();
    }

    public Integer getCakeStatus() { return cakeStatus; }
    public void setCakeStatus(Integer cakeStatus) { this.cakeStatus = cakeStatus; }
}
