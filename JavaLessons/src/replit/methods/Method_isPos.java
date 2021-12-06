package replit.methods;

import java.util.*;

public class Method_isPos {

	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++){
	    arr[i]=inp.nextInt();
	    }
	    //#2 Your code here
	    for(int i: arr) {
			  isPos(i);   
	    }
	  }
	  
	public static void isPos(int num){
	    //#1 your code here
	   if (num<0) System.out.println("negative");
	   else if (num>0) System.out.println("positive");
	   else System.out.println("zero");
		     
	}
	  
}
