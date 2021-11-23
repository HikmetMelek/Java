package lessons_EU7.day33_constructors;

public class RectangleTest_ExpOfConstructor {

	public static void main(String[] args) {
		/*
		Rectangle R1= new Rectangle(); // when i use 'new', it means: calling(invokes) the constructor.
									   // but how i going create constructor?(in template class)
									   // which constructor you use?(in template class)
									    * 
		// 'new' keywords --> call the constructor and create the object.
		//  which constructor you use?
		//  constructor is --> initialize object variables (for instance:R1.length=5.4;)
		
		
		System.out.println(R1.length); // who is giving me default values (0.0) , how?
		System.out.println(R1.width); //0.0
		R1.length=5.4;
		R1.width=2.2;
		R1.getArea();
		
		Rectangle R2= new Rectangle();
		R2.length=19.4;
		R2.width=64.5;
		R2.getArea();
		 */
		Rectangle_ExampleOfConstrructor R1= new Rectangle_ExampleOfConstrructor(5.4,2.2);// 'new' invoke constructor which accepting 2 arguments
											 //	 which are doubles	
		System.out.println(R1.length);
		System.out.println(R1.width);
		
		Rectangle_ExampleOfConstrructor R2= new Rectangle_ExampleOfConstrructor();
		System.out.println(R2.length); // it become fix value. value come from no-argument
									   // constructor from class!--> it is not good typing
		
		
		
		
	}

}
