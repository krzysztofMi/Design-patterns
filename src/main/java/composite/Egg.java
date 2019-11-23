package composite;



public class Egg implements Component{

    private Integer size;

    public Egg(){ size = 5; }
    public Egg(Integer size){this.size = size;}


    public void breakEgg(){
        System.out.println("Oh no the egg is broken :(/n Egg size decrease to 0.");
        size = 0;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
