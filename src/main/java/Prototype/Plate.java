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
public class Plate extends Prototype {
        Integer size;
        String color;
        public Plate(Integer size, String color){
            this.size = size;
            this.color = color;
        }

    public Integer getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
