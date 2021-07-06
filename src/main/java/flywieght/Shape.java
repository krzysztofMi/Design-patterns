/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flywieght;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author student
 */
public abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;
    
    Shape(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics graphic, int x, int y, int dim){
        
    }

    public void drawString(){
        System.out.println();
    }
}
