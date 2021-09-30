package assignments.assignment2_arithmeticOperators;

public class Question_3_swappingNumbers {

	public static void main(String[] args) {
		/*Declare 2 variables (Num1, Num2)
		Swap values between Num1 and Num2
		Display new values of Num1 and Num2
      	Sample output:
      		n1=10     n1=20
      		n2=20     n2=10 */
    
   int num1=10;
   int num2=20;
   
   num1= num1+num2;
   num2= num1-num2;
   num1= num1-num2;
   
  // x=num1;   // another way to swapping numbers
  // num1=num2;
  // num2=x;
   
   System.out.println("num1:"+num1);
   
   
   System.out.println("num2:"+num2);

      
	}

}
