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
    protected int dim;
    protected int x;
    protected int y;
    
    Shape(Color color, int dim, int x, int y){
        this.color = color;
        this.dim = dim;
    }
    
    public void draw(Graphics graphic){
        
    }
}
