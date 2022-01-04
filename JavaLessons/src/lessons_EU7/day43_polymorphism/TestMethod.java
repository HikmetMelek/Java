package lessons_EU7.day43_polymorphism;

public class TestMethod {
    public static void main(String[] args) {
        ChildA chA= new ChildA(); // chA can access m1(),m2(),m3()
        ChildB chB= new ChildB(); // chB can access m1(),m2(),m4()
        Parent p1= new ChildA(); // p1 can access m1()
        p1.m1();
        p1= chB;
        ((ChildB)p1).m4();
        Parent p2= new ChildB(); // p2 can access m1()
        MyInterface int1= new ChildA(); // int1 can access m2()
        int1.m2();
        MyInterface int2= new ChildB(); // int2 can access m2()
    }
}

class Parent{
    public void m1(){
        System.out.println("m1 parent");
    }

}

interface MyInterface{
    void m2();
}

class ChildA extends Parent implements MyInterface{
    @Override
    public void m1() {
        System.out.println(" m1 childA");
    }

    @Override
    public void m2() {
        System.out.println("m2 in childA");
    }
    public void m3(){}
}

class ChildB extends Parent implements MyInterface{
    @Override
    public void m2() {
        System.out.println("m2 in childB");
    }
    public void m4(){
        System.out.println("m4 in childB");
    }
}