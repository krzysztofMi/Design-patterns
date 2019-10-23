/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author dstudent
 */
public abstract class Prototype implements Cloneable{
    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}



