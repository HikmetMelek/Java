package lessons_EU7.day24_arrays_Part1;

public class ArrayCreation {

	public static void main(String[] args) {
		
		// option-1
		int[] numbers;
		numbers= new int[3];
		
		// option-2
		
		int [] numbers1= new int[4];
		float[] temp= new float[100];
		char[] letters= new char[40];
		long unit[]= new long[50];
		String words[]= new String[5];  // int[] num == int num[]
		
		System.out.println(numbers[2]); //default value for int   
		System.out.println(temp[82]);   //default value for float
		System.out.println(words[4]);  //default value for string is null
		System.out.println(unit[49]);
		
		int [] scores= new int[5];
		scores[0]= 80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		int avdScores= (scores[0]+ scores[1]+scores[2]+scores[3]+scores[4]) /5;
		System.out.println(avdScores);
		
		
		
		

	}

}
