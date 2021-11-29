package lessons_EU7.day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike",30,1000);
		Student s2 = new Student("Ozzy",20,2000);
		Student s3 = new Student("Jamal",10,3000);
		
		s1.school="Cydeo"; // school static oldugu icin student class da, tum school degisiyor.
						  // eger static olmasaydi sadece s1 school degisecekti.
		//whenever i make changes, this change is reflected in class level
		//so all other object will be affected thru this change
		
	
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		Student.school="bilkent";
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		s3.school="odtü";
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		
	}

}
