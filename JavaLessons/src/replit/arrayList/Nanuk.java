package replit.arrayList;

import java.util.*;

public class Nanuk {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int stones = in.nextInt();
	    int boast = in.nextInt();
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.next());
	    }

	    System.out.println(nanuk(list, stones, boast));

	  } 
	
	public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
		boolean result;
		int sumOfBoast=0;
		int counter=0;
		
		for (String i: r) {
			
			if(!i.equals("nanuk")) 
				sumOfBoast+= Integer.parseInt(i);
			else
				counter++;		
		}
		
		if(sumOfBoast>=boast && way_stones>=counter)
			result=true;
		else result=false;
		
		return result;
	}
	
	
}
