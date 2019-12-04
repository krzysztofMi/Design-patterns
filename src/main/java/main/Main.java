package main;


import flywieght.Circle;
import flywieght.Shapes;
import java.awt.Color;
import javax.swing.JFrame;

public class Main {
    static int CANVAS_SIZE = 500;
    static int SHAPES_TO_DRAW = 1000000;
    static int SHAPES_TYPES = 2;

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        for (int i = 0; i < Math.floor(SHAPES_TO_DRAW / SHAPES_TYPES); i++) {
            shapes.addShape("Circle", Color.GREEN, random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), random(0, CANVAS_SIZE));
            shapes.addShape("Circle", Color.GREEN, random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), random(0, CANVAS_SIZE));
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
