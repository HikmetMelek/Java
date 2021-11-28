package lessons_EU7.day35_encapsulation;

public class PersonTest_explanationOnEncapsulation {

	public static void main(String[] args) {
		
		Person p= new Person();
		//p.age=-10; // syntax does not give me error. But age cannot be minus.
		// So; user should not access directly to variable, but should access thru different mech. which i have filter on it
		// cut the access on age --> no visible on PersonTest class(age) --> with make 'age' private on Person Class.
																	// p.age does not work.
		// Encapsulation: Data Hiding --> encapsulate variables
			//cut the access  - private
			//create setter method to initialize my value
			//create getter method to retrieve it 
		
				// Encapsulation in Java--> to create encapsulation;
					//1.private variables !!
					//2.public setter methods
					//3.public getter methods
				
		
		//System.out.println(p.age); when age is public you can do this. but when age is private-->
		// print age:
		p.setAge(20); // you set 20 in age with setter method. but you cannot System.out.println(p.setAge(0));
					// output the age value;
		System.out.println(p.getAge(20)); // i have to call getter method to display value of age
		
		
		
		System.out.println("--------------");
		p.setAge(-5);
		

		System.out.println("--------------");
		Person2 c= new Person2("Melek", 41, 'F');
		System.out.println(c.getAge());
		c.setAge(42);
		System.out.println(c.getAge());
		
	}

}
