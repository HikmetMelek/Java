package lessons_EU7.day43_polymorphism.shapes;

import lessons_EU7.day43_polymorphism.shapes.Circle;
import lessons_EU7.day43_polymorphism.shapes.Shape;
import lessons_EU7.day43_polymorphism.shapes.Square;
import lessons_EU7.day43_polymorphism.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
    public static void main(String[] args) {

        Shape sh= new Circle();

        if(sh instanceof Square)   // return true or false
            System.out.println("square");
        else if(sh instanceof Circle)
            System.out.println("circle");
        else System.out.println("triangle");

        List<Shape> shapeList= new ArrayList<>();
        shapeList.add(new Triangle());
        shapeList.add(new Circle());

    }
}
