package lessons_EU7.day40_accessmodifiers_final_hiding;

public class TestParentChild {
    public static void main(String[] args) {

        Child s= new Child();

        System.out.println("value of before increment "+ s.x); //200

        s.increment(); //101
        System.out.println("value of after increment "+ s.x); //200 // hiding variable--> in parent x. i call child class

        Parent p= new Parent();

        System.out.println("value of before increment "+ p.x);//100
        p.increment();//101
        System.out.println("value of after increment "+ p.x);//101


    }
}
