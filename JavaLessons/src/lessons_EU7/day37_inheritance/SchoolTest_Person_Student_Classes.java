package lessons_EU7.day37_inheritance;

public class SchoolTest_Person_Student_Classes {

	public static void main(String[] args) {
		
		Person person= new Person();
		Student student = new Student();
		
		person.name= "Mike";
		person.age= 35;
		person.gender='M';
		
		student.name="Smith"; // coming from person class: parent class
		student.age=30;
		student.gender='M';
		
		student.studentId=1234; // coming from student class
		
		person.eat("Steak"); // coming from person class
		student.eat("Pizza"); // coming from person class
		
		// person.code("Java"); --> error= person class do not have code method
		
		

	}

}
