package lessons_EU7.day33_constructors;

public class Task_Student {
	
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university="Cybertec University";
	
	public Task_Student(String name, int age, char gender, int year, String course) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}

	public Task_Student(String name, int age, char gender, int year, String course, String university) {
		
		this.name=name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}
	
	public void attendLecture() {
		System.out.println(name+" is attending lecture");	
	}
	
	public void submitAssignment() {
		System.out.println(name+" is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name+" is attending labe");
	}


}
