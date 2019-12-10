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

    int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Square(Color color) {
        super(color);
    }
    
    @Override
    public void draw(Graphics g, int x, int y, int width){
        g.setColor(color);
        g.fillRect(x, y, width, width);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, width);
    }
}
