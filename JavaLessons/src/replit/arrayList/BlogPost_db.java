package replit.arrayList;

import java.util.*;

public class BlogPost_db {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    String id = in.next();
	    in.nextLine();
	    ArrayList<String[]> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
	    }

	    System.out.println(blogDb(list, id));

	  } 

	public static String blogDb(ArrayList<String[]> r, String id) {
		String[] arr= new String[r.size()];
		String a="";
		
			
			
		
		
		return a;
		
	}
}
