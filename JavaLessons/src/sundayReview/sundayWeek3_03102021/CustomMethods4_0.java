package lessons_EU7.sundayReview.sundayWeek3_03102021;

public class CustomMethods4_0 {

	public static void main(String[] args) {
		   //create a method which will receive two boolean parameters
	    //isUpperCase:true print alphabet in upperCase
	    //goAtoZ: true print aphabet from A/a - Z
	    // getAllLetters

	        getAllLetter(false, true);
	        System.out.println();
	        getAllLetter(true, true);
	    }

	    public static void getAllLetter(boolean isUpperCase, boolean goAtoZ) {

	        if(isUpperCase && goAtoZ) {
	            for(char c = 'A'; c<='Z';c++) {
	                System.out.print(c + " ");
	            }
	        }else if(!isUpperCase && goAtoZ) {
	            for(char c = 'a'; c<='z';c++) {
	                System.out.print(c + " ");
	            }
	        }else if(!isUpperCase && !goAtoZ) {
	            for(char c = 'z'; c>='a';c--) {
	                System.out.print(c + " ");
	            }
	        }else {
	            for(char c = 'Z'; c>='A';c--) {
	                System.out.print(c + " ");
	            }
	        }
	    }	

}
