package lessons_EU7.day44_oopReview.shapes;

public class ShapeTest {

    public static void main(String[] args) {
        //create 3 shapes, using polymorphism:

        Shape square= new Square(); //1
        ((Square) square).squareMethod();
        square.draw();

        Shape diamond= new Diamond(); //2
        diamond.draw();

        Object shapeObj= new Shape(); //3
        System.out.println("shapeObj.getClass() = " + shapeObj.getClass());


    }

}
