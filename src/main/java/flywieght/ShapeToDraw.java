package flywieght;

import java.awt.*;

public class ShapeToDraw {
    Shape shape;
    int x;
    int y;
    int dim;

    public ShapeToDraw(Shape shape, int x, int y, int dim){
        this.shape = shape;
        this.x = x;
        this.y = y;
        this.dim = dim;
    }

    public void draw(Graphics g){
        shape.draw(g, x, y, dim);
    }

   public String testDraw(){
       if(shape instanceof Circle){
           return  "Draw circle, color:" + shape.getColor() + " x: " +
                   shape.getX() + " y: " + shape.getY() + " radious: " + ((Circle) shape).getRadious();
       }else if(shape instanceof Square){
           return "Draw square, color:" + shape.getColor() + " x: " +
                   shape.getX() + " y: " + shape.getY() + " width: " + ((Square) shape).getWidth();
       }
            return "ERROR without try catch :(";
   }

}
