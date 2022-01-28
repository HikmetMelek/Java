package assignments.assignmentOnOOPConsept.Q4;

public class Q4_Person_Main {

	public static void main(String[] args) {
		
		Person person = new Person();

		System.out.println(person.getFirstName()); //"undefined"
		System.out.println(person.getLastName()); //"undefined"
		System.out.println(person.getAge()); // -1
		System.out.println(person.toString()); //"undefined | undefined | -1"

		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString() ); // "John | Doe | 44"

		Person person2 = new Person("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName()); //"Fatima"
		System.out.println(person2.getLastName()); //"Lee"
		System.out.println(person2.getAge()); // 22
		System.out.println(person2.toString()); //"Fatima | Lee | 22"
	}

}
