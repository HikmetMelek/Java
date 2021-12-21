package lessons_EU7.day40_accessmodifiers_final_hiding;

public class Mouse extends Rodent{

    protected int tailLength=8;

    public void getMouseDetails() {
        System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
    }

// if u want to print Rodent tailLength in Mouse class u have to use super.tailLength; because of hiding

}
