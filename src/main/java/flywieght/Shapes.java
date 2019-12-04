/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flywieght;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Shapes extends JFrame{
    private ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    public void addShape(String name, Color color, int x, int y, int dim){
        Shape shape = ShapeFactory.getTreeType(name, color, dim, x, y);
        shapes.add(shape);
    }
    
    @Override
    public void paint(Graphics graphic){
        for (Shape shape : shapes) {
            shape.draw(graphic);
        }
    }
}
