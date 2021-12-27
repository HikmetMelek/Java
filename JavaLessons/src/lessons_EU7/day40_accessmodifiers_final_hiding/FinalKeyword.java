package lessons_EU7.day40_accessmodifiers_final_hiding;

public class FinalKeyword {

    final String name;
    final int age;
    final String color="red";
    final static String gender;
    final static String city="bursa";

    public FinalKeyword(String name){
        this.name=name;
    }

    {
        this.age=25;
    }

    static{
        gender="female";
    }

    public static void main(String[] args) {

        final int x;// declare
        x=10;// initialize
        System.out.println(x);

    }


}
