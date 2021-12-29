package lessons_EU7.day43_polymorphism.shapes;

import lessons_EU7.day43_polymorphism.shapes.Shape;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
