/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import Eats.Cake;
import Eats.Soup;

/**
 *
 * @author student
 */
public class Meal {
    private Soup soup;
    private Cake cake;
    
    private boolean isSalt;
    private boolean isSweet;

    public boolean isIsSalt() {
        return isSalt;
    }

    public boolean isIsSweet() {
        return isSweet;
    }
    
    public Soup getSoup() {
        return soup;
    }

    public void setSoup(Soup soup) {
        this.soup = soup;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }
    
    private Meal(MealBuilder meal){
        this.cake = meal.cake;
        this.soup = meal.soup;
        this.isSweet = meal.isSweet;
        this.isSalt = meal.isSalt;
    }
    
    
    public static class MealBuilder {
    private Soup soup;
    private Cake cake;
    
    private boolean isSalt;

        @Override
        public String toString() {
            return "MealBuilder{" + "soup=" + soup + ", cake=" + cake + ", isSalt=" + isSalt + ", isSweet=" + isSweet + '}';
        }
    private boolean isSweet;
    
    public MealBuilder(Soup soup, Cake cake){
        this.soup = soup;
        this.cake = cake;
    }
    
    public MealBuilder setMealIsSalty(boolean salty){
        this.isSalt = salty;
        return this;
    }
    
    public MealBuilder setMealIsSweet(boolean sweet){
        this.isSweet = sweet;
        return this;
    }
    
    public Meal create(){
        return new Meal(this);
    }
    }
}
