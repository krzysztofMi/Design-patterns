/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author student
 */
public class Restaurant {
    
    private static Restaurant restaurant = null;
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static Restaurant getRestaurant(){
        return restaurant = restaurant == null ? new Restaurant() : restaurant;
    }
    
}
