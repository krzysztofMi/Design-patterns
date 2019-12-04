/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flywieght;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author student
 */
public class ShapeFactory {
    static HashMap<String, Shape> shapeTypes = new HashMap<String, Shape>();

    public static Shape getTreeType(String name, Color color, int dim, int x, int y) {
        Shape result = shapeTypes.get(name);
        if(result instanceof Circle){
            result = new Circle(color, dim, x, y);
        }else{
            result = new Square(color, dim, x, y);
        }
        shapeTypes.put(name, result);
        return result;
    }
}
