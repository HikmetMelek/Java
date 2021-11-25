package lessons_EU7.day34_constructors;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1= new Apple(); // reference type reference variable=object	
		
		System.out.println(a1.color);
		
		changedApple(a1);
		System.out.println(a1.color);
		
		System.out.println(methodObject().color);
		
		a1.mA();
		methodObject().mA();
	}

		public static void changedApple(Apple x) {
		x.color="white";
	}
	
	 // i want to return object
	public static Apple methodObject(){
		Apple b1= new Apple();
		return b1;
	}

}
