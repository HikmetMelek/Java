package lessons_EU7.day04_arithmetic_operators;

public class task17 {

	public static void main(String[] args) {
		// TODO average of 3 numbers.
		
		double num1,num2,num3,average;
		num1=11;
		num2=24;
		num3=32;
		average=(num1+num2+num3)/3;
		
		System.out.println("Average is "+ average);
		
		
		System.out.println("==========================================");
		
		
		
		//  Casting: Implicit,Explicit.
		int x=130;
		byte b= (byte) x; // büyük yer kaplayan int r byte sigdirmaya calistiginda veri kaybi olur. sonuc -126 verdi// Explicit Casting
							// int (32 bit), byte (8 bit)
				System.out.println(b);
				
		double d=20;
		System.out.println(d);// 20 is integer. but when you use in double, compiler automatically 
							// change integer to double, cause result is not 20, result is 20.0 ..
			

	}

}
