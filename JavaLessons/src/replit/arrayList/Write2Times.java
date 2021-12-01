package replit.arrayList;

import java.util.*;

public class Write2Times {

	public static void main(String[] args) {
		//This method should create a new ArrayList of Integers 
		//that contains every value of the ArrayList parameter repeated twice. (1,5,3,7)--> (1,1,5,5,3,3,7,7)
		Scanner in = new Scanner(System.in);
		    int size = in.nextInt();
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int i=0; i < size; i++) {
		      list.add(in.nextInt());
		    }
		    System.out.println(twoTimes(list));

	} 
			
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
		
		for(int i=0; i< list.size(); i++) {
			list.add(i+1, list.get(i));
			i++;
		}
		return list;
	}



}
