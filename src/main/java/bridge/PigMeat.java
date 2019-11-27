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
public class PigMeat implements Meat{
    
    private boolean isCooked;

    public boolean isIsCooked() {
        return isCooked;
    }

    public void setIsCooked(boolean isCooked) {
        this.isCooked = isCooked;
    }
    
    public String eat() {
        if(isCooked){
            return "You eat cooked pig meat.";
        }
        return "You eat raw pig meat.";
    }

    public String cook() {
        isCooked = true;
        return "You cook pig meat.";
    }
    
}
