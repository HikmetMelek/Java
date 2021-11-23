package lessons_EU7.day33_constructors;

public class Task_StudentTest {

	public static void main(String[] args) {
		
		Task_Student student1= new Task_Student("Mike", 17, 'M', 2016, "Java", "Cybertek University");// invoke cons. with 6 arg.
		Task_Student student2= new Task_Student("Smith", 25, 'M', 1999, "TS");// invoke cons. with 5 arg.
		Task_Student student3= new Task_Student("Mike", 17, 'M', 2016, "Java");
		// that objects all heve same univ. name. so we assign univ name in class part
		
		student1.attendLecture();
		student2.attendLab();
		
		
		
	}

}
