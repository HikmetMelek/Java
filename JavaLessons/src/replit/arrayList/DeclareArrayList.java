package replit.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class DeclareArrayList {

	public static void main(String[] args) {
		
		System.out.println(test());
	  			
	}
	public static ArrayList<Integer> test(){
		//write code here
		Random rn= new Random();
		
		ArrayList<Integer> newList= new ArrayList<>();
		
		for (int i=1; i<=10; i++) {
			newList.add(rn.nextInt(51));
		}
		newList.clear();
		return newList;
	}

}
