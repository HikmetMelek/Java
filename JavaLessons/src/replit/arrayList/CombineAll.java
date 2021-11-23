package replit.arrayList;

import java.util.*;

public class CombineAll {

	public static void main(String[] args) {
		//This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
		//then add all the words (in order) from wordList2. 
		//In other words, it is combining all the elements from the two parameters.
		 Scanner in = new Scanner(System.in);
		    int size = in.nextInt();
		    int size2 = in.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    ArrayList<Integer> list2 = new ArrayList<>();
		    for(int i=0; i < size; i++) {
		      list.add(in.nextInt());
		    }
		    for(int i=0; i < size2; i++) {
		      list2.add(in.nextInt());
		    }

		    System.out.println(combineAL(list, list2));

	}
	
	public static ArrayList<Integer> combineAL(ArrayList<Integer> wordList1, ArrayList<Integer> wordList2){

		wordList1.addAll(wordList2);
		return wordList1;
	}
	
	
}
