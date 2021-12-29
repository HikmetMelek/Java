package lessons_EU7.day44_oopReview.shapes;

import lessons_EU7.day44_oopReview.ShapeManager;

import java.util.ArrayList;
import java.util.List;

import static lessons_EU7.day44_oopReview.ShapeManager.drawShape;

public class ShapeAction_Test {

    public static void main(String[] args) {

        ShapeManager.drawSquare((Square)ShapeManager.buildShape("square")); //buildshape return: Shape shape= new Square();


        System.out.println("-------------");

        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Diamond());

        drawShape(myList);


    }




}
