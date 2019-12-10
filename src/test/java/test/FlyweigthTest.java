package test;

import flywieght.ShapeFactory;
import flywieght.ShapeToDraw;
import flywieght.ShapeType;
import flywieght.Shapes;
import mainPackage.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FlyweigthTest {

    @Test
    public void flyweightTest(){

        int shapeNumber = 10000;

        Shapes shapes = new Shapes();

        for(int i = 0; i<shapeNumber/2; i++){
            shapes.addShape(ShapeType.CIRCLE, Main.randomColor(), Main.random(100), Main.random(100), Main.random(10));
            shapes.addShape(ShapeType.SQUARE, Main.randomColor(), Main.random(100), Main.random(100), Main.random(10));
        }

        //Numbers of objects to draw.
        assertTrue(shapes.getShapesSize() == shapeNumber, "Number of object to draw should be " + shapeNumber);
        //Numbers of created type of object.
        assertTrue(ShapeFactory.createdShapes == 10, "ShapeFactory should create 10 objects, 5 colors 2 shapes.");


    }

}
