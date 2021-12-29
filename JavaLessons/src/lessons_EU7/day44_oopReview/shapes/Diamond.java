package lessons_EU7.day44_oopReview.shapes;

public class Diamond extends Shape{

    public Diamond(){
        type="diamond";
    }

    @Override
    public void draw() {
        System.out.println("drawing a diamond");
    }
}
