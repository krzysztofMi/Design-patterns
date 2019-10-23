/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author dstudent
 */
public class ClientAdapter implements Client {

    Chef chef;
    
    ClientAdapter(Chef chef){
        this.chef = chef;
    }
    
    @Override
    public void getFood() {
        chef.makeOwnFood();
    }
    
}
