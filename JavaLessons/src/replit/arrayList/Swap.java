package replit.arrayList;

import java.util.*;

public class Swap {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int pos1 = in.nextInt();
	    int pos2 = in.nextInt();
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.next());
	    }

	    System.out.println(swap(list, pos1, pos2));

	} 
	
	public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {
		
		list.add("yoyo");
	
		list.set(list.size()-1, list.get(pos1));
		list.set(pos1, list.get(pos2));
		list.set(pos2, list.get(list.size()-1));
		list.remove(list.size()-1);
		
		return list;
	}

}
