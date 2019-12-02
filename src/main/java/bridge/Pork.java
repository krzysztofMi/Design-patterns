/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author student
 */
public class Pork implements Meat{
    
    private boolean isCooked;

    public boolean isIsCooked() {
        return isCooked;
    }

    public void setIsCooked(boolean isCooked) {
        this.isCooked = isCooked;
    }

    @Override
    public String eat() {
        if(isCooked){
            return "You eat cooked pork.";
        }
        return "You eat raw pork.";
    }

    @Override
    public String cook() {
        isCooked = true;
        return "You cook pork.";
    }

    @Override
    public boolean isCooked(){
        return isCooked;
    }
    
}
