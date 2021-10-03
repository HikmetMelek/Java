package lessons_EU7.sundayReview.sundayWeek3_03102021;

public class CustomMethods4_1 {
	 // create a method which will receive two boolean parameter
    // isUpperCase : true print alphabet in upper case
    // goAtoZ : true print alphabet from A/a - > Z / z  false z->a
    // getAllLetters

    public static void main(String[] args) {

        System.out.println(getAllLetters(false,true));
        System.out.println(getAllLetters(true,true));
        System.out.println(getAllLetters(false,false));
        System.out.println(getAllLetters(true,false));
    }
	
    public static String getAllLetters(boolean isUpperCase, boolean goAtoZ) {

        char start;
        char finish;
        String result="";  // dummy variable


        if (isUpperCase) {
            start = 'A';
            finish = 'Z';
        }else {
            start = 'a';
            finish = 'z';
        }

        if(goAtoZ) {
            for( ; start<=finish;start++) {
                result+=start+ " ";
            }
        }else {
            for ( ; finish >= start; finish--) {
                result+=finish+ " ";
            }
        }

        return result;
    }
     
}
