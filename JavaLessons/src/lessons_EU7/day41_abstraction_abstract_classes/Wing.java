package lessons_EU7.day41_abstraction_abstract_classes;

public class Wing extends Bird{
    public Wing(String name) {
        super(name);
    }
                                   // Animal --> Bird --> Wing (Wing extends Bird extends Animal)
                                  //  Bird needs to implement abstract methods(override abstract class). it is first concrete class
                                  //  But Wing Class do not need to implement abstract methods, it is second class

    public void walk(){
        System.out.println("walking");
    }


    @Override
    public int eat(String x) {
        return 0;
    }

    @Override
    public void fly() {

    }
}
