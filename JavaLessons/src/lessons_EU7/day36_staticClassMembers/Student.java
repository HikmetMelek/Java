package lessons_EU7.day36_staticClassMembers;

public class Student {
	
	String name;
	int age;
	int idNumber; // belongs to object
	static String school="Cybertek"; // belongs to class
	
	public Student(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}


	
	
	
	
	
	
	
}
