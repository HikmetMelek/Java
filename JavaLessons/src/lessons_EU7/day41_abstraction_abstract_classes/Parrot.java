package lessons_EU7.day41_abstraction_abstract_classes;

public class Parrot extends Bird{

    String x = "apple";

    public Parrot(String name) {
        super(name);
    }

    @Override
    public int eat(String x) {
        return 0;
    }

    @Override
    public void fly() {

    }
}
