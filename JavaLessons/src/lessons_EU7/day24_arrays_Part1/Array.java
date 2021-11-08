package lessons_EU7.day24_arrays_Part1;

public class Array {

	public static void main(String[] args) {
		
		int [] myList= {10,20,30,40}; // myList do same thing == --> int[] myList= new int[4]
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myList.length);
		
		String[] myArray = {"Apple","Orange","Watermelon"};
		System.out.println(myArray.length);
		
		System.out.println("----------------------------------");
		
		for (int i=0; i< myList.length; i++) {
			System.out.println(myList[i]);
		}
		System.out.println("----------------------------------");
		
		int [] scores= {80,90,100,35,60,72,64,30,10,5,3,99,89,80,90,100,35,60,72,64,30,10,5,3,99,89};
		int total=0;
		for(int i=0; i<scores.length; i++) {
			total+=scores[i];	
		} 
		System.out.println("Average score is: "+ (total/scores.length));
		System.out.println(total);
		System.out.println("how many element are there: "+ scores.length);
		
		

	}

}
