package lessons_EU7.day42_interfaceAndAbstractExample.abstract_example;

public class TeslaTruck extends TeslaSemi {

    public TeslaTruck(String model, double price, String color, double engineSize) {
        super(model, price, color, engineSize);
    }

    @Override
    public String toString() {
        return "TeslaTruck{engine size} "+getEngineSize()+" /" + super.toString();
    }
}
