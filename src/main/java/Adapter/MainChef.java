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
public class MainChef implements Chef {

    @Override
    public String makeFood() {
        return "Make tasty food.";
    }
}
