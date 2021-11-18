package lessons_EU7.day31_arrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums= new ArrayList<>(); // Capacity:10
		
		System.out.println(nums.size()); // size:0
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.size()); //size:7
		System.out.println(nums.toString()); // it is array list
		
		nums.remove(5); // index of nums: 5. index // //removes the spficied index number from the list
		System.out.println(nums.toString()); // 100 is gone
		
		System.out.println("---------------");
		//but I wanna gone "5"(array list without 5). how can i do this?
		
		Integer n1= new Integer(5); // i need to pass integer to object. first 5 is primitive. 
		//I need to convert '5' to object to be able to remove it from array list.
		
		Integer n2= Integer.valueOf(5); // 5 is return object to 
		nums.remove(n1); // removes the specified element from the list
		System.out.println(nums.toString()); // 5 is gone
		
		nums.remove(Integer.valueOf(4)); // removes the specified element from the list
		System.out.println(nums.toString()); // 4 is gone
		
		
		
		
		
		

	}

}
