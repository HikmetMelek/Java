package lessons_EU7.day40_accessmodifiers_final_hiding;

public class FinalVariables {

    public final int ROASTER_MAX_RANGE=60; // in same statement
    public final int MODEL_3_MAXSPEED;
    public final int MODEL_X_PASSENGERS;
    public static final String ADMIN_USERNAME;

    //constructor
    public FinalVariables(){
        MODEL_3_MAXSPEED=200;
      //  ADMIN_USERNAME="MIKE"; // WHY ?
    }

    //init blocks
    {
        MODEL_X_PASSENGERS=5;
        //  ADMIN_USERNAME="MIKE"; // WHY ?
    }

    static {
        ADMIN_USERNAME="Mike";
    }


    public static void main(String[] args) {

        final int MAX_PESSANGERS_COUNT= 5;
        final int SSN;
        SSN=65;
        FinalVariables finalVars= new FinalVariables();
        System.out.println(finalVars.ROASTER_MAX_RANGE);
        System.out.println(finalVars.MODEL_3_MAXSPEED);
        System.out.println(finalVars.MODEL_X_PASSENGERS);
        System.out.println(FinalVariables.ADMIN_USERNAME);
        System.out.println(ADMIN_USERNAME); // public value in same class

    }
}
