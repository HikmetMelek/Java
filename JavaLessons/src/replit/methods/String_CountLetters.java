package replit.methods;

import java.util.Scanner;

public class String_CountLetters {

	public static void main(String[] args) {
		// Write a method countLetters that can count letters in a given string and
		// return a new string in the given format: number of letters + letter
		// countLetters("aaabbcccc"); --> "3a2b4c" 
		Scanner in = new Scanner(System.in);
		System.out.println(countLetters(in.next()));
	}
	public static String countLetters(String str){
		String result = "";
	    int counter=1;

	        for(int i=0 ; i<str.length()-1 ; i++){
	        	if(str.charAt(i) == str.charAt(i+1)){
	                counter++;
	            }else{
	                result += counter +""+ str.charAt(i);
	                counter=1;
	            }
	        }
	        if(str.charAt(str.length()-2) == str.charAt(str.length()-1)){
	            result += counter +""+ str.charAt(str.length()-1);
	        }
	        else{
	            result += "1" + str.charAt(str.length()-1);
	        }
		return result;
	}
}
