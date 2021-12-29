package lessons_EU7.day42_interfaceAndAbstractExample.abstract_example;

public interface IElectric { // interface have 3 method type: abstract(without body), default(with body) and static(with body)
                             // interfaces can not have init block and static block

    public static final boolean HAS_BATTERIES=true;
    boolean HAS_BATTERIES2= false; // public static final

    public abstract void charge();

    void charge2(); // public abstract , u write public abstract or do not write methods are public. because interface is public abstract

    public default void methodA(){
        //implementation/coding
    }

    public static int methodB(){
        //code
        return 0;
    }

}
