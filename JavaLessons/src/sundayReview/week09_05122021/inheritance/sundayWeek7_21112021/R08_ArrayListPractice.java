package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

import java.util.ArrayList;

public class R08_ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums= new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(250);
		nums.add(350);
		nums.add(400);
		
		System.out.println(nums);
		
		System.out.println(nums.size()); // size of arraylist as integer
		
		System.out.println(nums.get(2));
		
		nums.add(2, 250);  // to add at a certain index
		System.out.println(nums);
		
		System.out.println("------------------");
		nums.remove(nums.size()-1); // remove the last element from the list, with index
		System.out.println(nums);
		
		System.out.println("*******************");
		nums.remove(nums.get(nums.size()-1)); // this is removing with value
		System.out.println(nums);
		
		System.out.println("------------------");
		nums.remove(Integer.valueOf(300)); // this one removes with the object value
		// nums.remove(300) ---> gives error
		System.out.println(nums);
		
		System.out.println("------------------");
		boolean b1= nums.contains(250);
		System.out.println(b1);
		
		
		
		

	}

}
