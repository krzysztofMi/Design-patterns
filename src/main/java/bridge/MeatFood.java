
package bridge;


public class MeatFood implements Food {

    private Meat meat;

    public Meat getMeat() {
        return meat;
    }

    public MeatFood(Meat meat){
        this.meat = meat;
    }

    @Override
    public String eat() {
       return meat.eat();
    }

    @Override
    public String cook() {
        return meat.cook();
    }

    @Override
    public boolean isCooked(){
        return meat.isCooked();
    }
}
