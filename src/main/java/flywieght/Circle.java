/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flywieght;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape {

    private int radious;

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public Circle(Color color) {
        super(color);
    }
    
    public void draw(Graphics g, int x, int y, int radious) {
        g.setColor(color);
        g.fillOval(x, y, radious, radious);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, radious, radious);
    }

    
}
