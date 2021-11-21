package lessons_EU7.sundayReview.sundayWeek7_21112021;

public class R04_WrapperClassPractices {

	public static void main(String[] args) {
		
		int i1=100; //  i1 is primitive
		Integer i2= new Integer ("100"); // i2 is object
		Integer i3= new Integer (100);
		Integer i4= Integer.valueOf("100"); // it is turning string to int 
		Integer i5= Integer.valueOf(100); // ---> auto boxing
		Integer i6=100;
	// un-boxing (object to primitive), auto-boxing (primitive to object)
		
		// auto exp:
		i2=i1;
		
		//un-boxing exp:
		int i7=i3;
		
		System.out.println("-------------------------------");
		String str="123";
		// parseInt method --> this one return primitive
		int num= Integer.parseInt(str);
		System.out.println(num+1);
		
		// Integer.valueOf ---> returns object Integer
		
		Integer num2= Integer.valueOf(str);
		System.out.println(num2+1);
		System.out.println(num2.equals(123));
		System.out.println(num2.equals(str)); // str a string, num2: a Integer (wrapper class)
		
		
		
		
		
		
		
		
		
	}

}
