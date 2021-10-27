package lessons_EU7.day23_stringManipulationLab_randomClasss;

public class Question_11 {

	public static void main(String[] args) {
		
		System.out.println(countHi("abc hi hohihi"));
		System.out.println(countHi("hi come      hi"));
		System.out.println(countHi("hi! where are you"));

	}
	public static int countHi(String str) {
		
		int counter=0;
		for (int i=0; i<str.length()-1; i++) {
			
			if (str.substring(i, i+2).equals("hi")) { 
				
				counter++;
			}
		} 
		return counter;
		
		
	}

//	String str = "abc hi hohihi";  //hi 2 character     //hihello  = substring(0,2)   
//    										            //xhihello = substring(1,3)
//    										            //xxhihell = substring(2,4)
//	int counter=0;
//
//	for(int i=0;i<str.length()-1;i++) {  //9<10 ; last "i" condition is (9, 11) 11= length of string 
//													if looked string has 3 character you have to change (i, i+?) formula
//													and length condition (i<str.length-?)  
//		if(str.substring(i, i+2).equals("hi")) {    
//
//
//			counter++;
//		}
//
//	}
//
//	System.out.println(counter);
	
	
}
