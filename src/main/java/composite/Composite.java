package composite;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component {

    List<Egg> eggList;

    public Composite(){
        eggList = new LinkedList<>();
    }

    public Composite(List<Egg> eggList){
        this.eggList = eggList;
    }

    @Override
    public void breakEgg() {
        eggList.forEach(egg->egg.breakEgg());
    }

    @Override
    public Integer getSize() {
        Integer size = 0;
        for(Egg egg : eggList){
            size+=egg.getSize();
        }
        return size;
    }

    public void add(Egg egg){
        eggList.add(egg);
    }

    public void remove(Egg egg){
        eggList.remove(egg);
    }

    public Egg getChild(int i){
        return eggList.get(i);
    }

}
