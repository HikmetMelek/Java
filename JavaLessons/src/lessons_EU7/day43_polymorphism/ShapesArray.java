package lessons_EU7.day43_polymorphism;

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
