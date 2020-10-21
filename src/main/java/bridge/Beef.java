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
public class Beef implements Meat{
    
    private boolean isCooked = false;

    @Override
    public String eat() {
        if(isCooked){
            return "You eat cooked beef.";
        }
        return "You eat raw beef.";
    }

    @Override
    public String cook() {
        isCooked = true;
        return "You cook beef.";
    }

    @Override
    public boolean isCooked() {
        return isCooked;
    }

}
