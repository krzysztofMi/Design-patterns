/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flywieght;

import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape {

    public Circle(Color color, int dim, int x, int y) {
        super(color, dim, x, y);
    }
    
    public void draw(Graphics g) {
        g.drawOval(20, 30, 5, 0);
    }
    
    
}
