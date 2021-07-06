/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flywieght;

import java.awt.*;
import java.util.HashMap;

/**
 *
 * @author student
 */
public class ShapeFactory {
    static HashMap<String, Shape> shapeMap = new HashMap();
    public static int createdShapes = 0;

    public static Shape getShape(ShapeType shapeType, Color color){
        switch (shapeType){
            case CIRCLE:
                return getCircle(color);
            case SQUARE:
                return getSquare(color);
        }
        return null;
    }


    public static Circle getCircle(Color color){
        Circle circle = (Circle) shapeMap.get("Circle" + color);
        if( circle == null){
            circle = new Circle(color);
            shapeMap.put("Circle" + color, circle);
            createdShapes ++;
        }
        return circle;
    }

    public static Square getSquare(Color color) {
        Square square = (Square) shapeMap.get("Square" + color);
        if( square == null) {
            square = new Square(color);
            shapeMap.put("Square" + color, square);
            createdShapes ++;
        }
        return square;
    }
}
