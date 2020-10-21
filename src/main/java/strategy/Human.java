package strategy;

import lombok.Data;

@Data
public class Human {
    private int size;
    private int age;
    private String name;
    private Run runType;

    public String run(){
        return runType.run();
    }

}
