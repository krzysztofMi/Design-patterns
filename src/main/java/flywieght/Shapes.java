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
    private ArrayList<ShapeToDraw> shapes = new ArrayList();
    
    public void addShape(ShapeType shapeType, Color color, int x, int y, int dim){
        Shape shape = ShapeFactory.getShape(shapeType, color);
        shape.setX(x);
        shape.setY(y);
        switch (shapeType){
            case CIRCLE:
                addCircle((Circle)shape, dim);
                break;
            case SQUARE:
                addSquare((Square)shape, dim);
                break;
        }
    }

    private void addCircle(Circle circle, int radious){
        circle.setRadious(radious);
        ShapeToDraw shape = new ShapeToDraw(circle, circle.getX(), circle.getY(), circle.getRadious());
        shapes.add(shape);
    }

    private void addSquare(Square square, int width){
        square.setWidth(width);
        ShapeToDraw shape = new ShapeToDraw(square, square.getX(), square.getY(), square.width);
        shapes.add(shape);
    }
    
    @Override
    public void paint(Graphics graphic){
        for (ShapeToDraw shape : shapes) {
            shape.draw(graphic);
        }
    }

    public int getShapesSize(){
        return shapes.size();
    }
}
