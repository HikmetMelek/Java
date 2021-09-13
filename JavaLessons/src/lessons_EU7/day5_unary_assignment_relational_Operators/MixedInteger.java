package lessons_EU7.day5_unary_assignment_relational_Operators;

public class MixedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1= i1+i2;// int+int: int
		
		//float res2= i1 + f1;  // int+float: float, cause float bigger then int
		
		double res3=i2 + d1;   // int+double: double, cause double bigger then int
		
		short firstNumber=10;
		short secondNumber=20;
		//short thirdNumber= firstNumber+secondNumber; // short: int+int 
											//(when you want to addition (+ or - or * etc.) by short data type, 
										// after "="  java saw the value is int)---> so error
		
		// so you can write this two options;		
		int thirdNumber= firstNumber+secondNumber;
		short thirdNumber2= (short) (firstNumber+secondNumber);
		
		/*byte b1=20;
		byte b2=2;
		int b3=b1*b2; 
		byte b4= (byte)(b1*b2);*/
		
		int b1=126;
		int b2=1;
		byte res=(byte) (b1+b2); // Casting is required! byte= byte(int+int)
		
		//byte result=b1+b2;// result is 127--> in the byte range. BUT GIVE ERROR. because b1 and b2 are changeable; 
							//when you change b1/b2 (for exp: b1:130) result become out of range of byte.
							// therefore you have to write code--> byte result=(byte) (b1+b2); or int result: b1+b2;)
		
		byte res2=126+1; // res2:127, Range on byte area, 126 and 1 fixed values. No castling is required!
		
			
	}	

}


