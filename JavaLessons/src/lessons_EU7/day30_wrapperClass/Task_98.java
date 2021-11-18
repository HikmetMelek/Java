package lessons_EU7.day30_wrapperClass;

import java.util.Arrays;

public class Task_98 {

	public static void main(String[] args) {
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
	    System.out.println((decodeTheCode(str1)));
	        
		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
		 System.out.println((decodeTheCode(str2)));
	}

	public static String decodeTheCode(String str) {
	 	
		String code="";
	 	for (int i=0; i< str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i)) || str.charAt(i)==' ')
				code+= str.charAt(i);
		}
		code= code.toLowerCase();
		String[] arr= code.split(" ");
		
		String element=" ";
		for (int i=0; i< arr.length; i++){
			
			switch (arr[i]){
			
			case "zero":
				element+=0+" ";
				break;
			case "one":
				element+=1+" ";
				break;
			case "two":
				element+=2+" ";
				break;	
			case "three":
				element+=3+" ";
				break;
			case "four":
				element+=4+" ";
				break;	
			case "five":
				element+=5+" ";
				break;	
			case "six":
				element+=6+" ";
				break;	
			case "seven":
				element+=7+" ";
				break;	
			case "eight":
				element+=8+" ";
				break;	
			case "nine":
				element+=9+" ";
				break;	
			case "ten":
				element+=10+" ";
				break;	
			default:
				element+="";
			}	
			
		}
		return element;
	}
}
