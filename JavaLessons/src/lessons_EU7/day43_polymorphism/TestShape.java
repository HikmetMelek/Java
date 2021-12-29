package lessons_EU7.day43_polymorphism;

public class TestShape {
    public static void main(String[] args) {

        Shape s1= new Shape();
        s1.draw();   //Drawing shape

        Shape s2= new Circle();
        s2.draw();   //Drawing circle

        Shape s3= new Triangle(); // Triangle class does not have overridden method!!
        s3.draw();   //Drawing shape      --> if not overridden, run it from parent
    }
}
