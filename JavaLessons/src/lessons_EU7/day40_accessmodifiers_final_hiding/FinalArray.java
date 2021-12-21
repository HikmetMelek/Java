package lessons_EU7.day40_accessmodifiers_final_hiding;

public class FinalArray {
    public static void main(String[] args) {
        final int[] TEAMS= {11,11};
        System.out.println(TEAMS[0]);
        TEAMS[0]=15;
        System.out.println(TEAMS[0]);

        int[] nums= new int[]{20,20,40};
        nums= new int[] {10,15,100}; // new reference

        final int[] finalNums= {23,45,79};
        finalNums[0]=200; // final array--> can change variable of object in array
      // finalNums= {10,42,45}; // but i can not do this. because final array --> can NOT change reference


    }



}
