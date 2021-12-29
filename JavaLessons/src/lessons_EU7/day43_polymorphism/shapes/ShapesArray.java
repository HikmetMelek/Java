package lessons_EU7.day43_polymorphism.shapes;

import lessons_EU7.day43_polymorphism.shapes.Circle;
import lessons_EU7.day43_polymorphism.shapes.Shape;
import lessons_EU7.day43_polymorphism.shapes.Square;

public class ShapesArray{
    public static void main(String[] args) {

        Shape[] shapes= new Shape[3]; // holding 3 objects
        shapes[0]= new Shape();
        shapes[1]= new Circle();
        shapes[2]= new Square();

        for (Shape i: shapes){
        //  System.out.println(i.getClass().getName());
            System.out.println(i.getClass().getSimpleName());
        //  i.draw();
        }



    }
}
