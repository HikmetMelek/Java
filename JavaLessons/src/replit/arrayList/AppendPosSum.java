package replit.arrayList;

import java.util.*;

public class AppendPosSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }
	
	    System.out.println(appendPosSum(list));

	} 

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> num){
		
		ArrayList<Integer> list= new ArrayList<>();
		int sum=0;
		for (Integer i: num) {
			if(i>0) {
				list.add(i);
				sum+=i;
			}
		}
		list.add(sum);
		return list;
	}
	
}
