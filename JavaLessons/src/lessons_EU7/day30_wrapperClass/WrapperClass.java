package lessons_EU7.day30_wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		
		int n1= 10;
		Integer n2= new Integer(10);// because of java version is old. no problem
		Integer n3= Integer.valueOf(10);
		System.out.println(n1);
		System.out.println(n2); // n2 is a object
		System.out.println(n3+5);
		
		double d1= 44.5;
		Double d2= new Double("44.5");
		Double d3= new Double(44.5);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);
		
		char c1= 'a';
		Character c2= new Character('a');
		System.out.println(c1);
		System.out.println(c2);
		
		byte b1= 100;
		Byte b2= new Byte("100");
		Byte b3= new Byte((byte)100);// cause of 100--> int
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		float f1= 45f;
		Float f2= new Float(45f);
		Float f3= new Float("45f");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		Integer num1= Integer.valueOf(1234);
		String num5= Integer.toString(num1);
		System.out.println("num1+4 = " + num1 + 4);
		System.out.println(num1+50);
		
		Boolean bool1= Boolean.valueOf(true);
		Boolean bool2= Boolean.valueOf("false");
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
	}

}
