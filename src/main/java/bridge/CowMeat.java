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
public class CowMeat implements Meat{
    
    private boolean isCooked = false;
    
    public String eat() {
        if(isCooked){
            return "You eat cooked cow meat.";
        }
        return "You eat raw cow meat.";
    }

    public String cook() {
        isCooked = true;
        return "You cook cow meat.";
    }
   
}
