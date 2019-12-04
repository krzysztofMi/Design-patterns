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
public class Square extends Shape {
    
    public Square(Color color, int dim, int x, int y) {
        super(color, dim, x, y);
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, dim, dim);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, dim, dim);
    }
}
