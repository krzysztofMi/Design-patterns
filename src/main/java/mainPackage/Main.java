package mainPackage;


import flywieght.Shape;
import flywieght.ShapeType;
import flywieght.Shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;

public class Main {
    static int CANVAS_SIZE = 800;
    static int SHAPES_TO_DRAW = 1000000;
    static int SHAPES_TYPES = 2;

    private static final List<Color> colors = Arrays.asList(Color.RED, Color.green, Color.blue, Color.black, Color.white);

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        for (int i = 0; i < Math.floor(SHAPES_TO_DRAW / SHAPES_TYPES); i++) {
            shapes.addShape(ShapeType.CIRCLE, randomColor(), random(CANVAS_SIZE), random(CANVAS_SIZE), random(CANVAS_SIZE));
            shapes.addShape(ShapeType.SQUARE, randomColor(), random(CANVAS_SIZE), random(CANVAS_SIZE), random(CANVAS_SIZE));
    }
        shapes.setSize(1000, 1000);
        shapes.setVisible(true);
    }

    public static int random(int max) {
        return (int)(Math.random()*max );
    }

    public static Color randomColor(){
        return colors.get(random(colors.size()));
    }
}
