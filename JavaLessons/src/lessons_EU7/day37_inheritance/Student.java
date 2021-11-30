package lessons_EU7.day37_inheritance;

public class Student extends Person {  //student can have everything person class has 
// student class have 5 values and 5 method(3 of them coming from Person class: Super Class)
	int studentId;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name + " is coding " + lang);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + termClass + " class");
	}


}
