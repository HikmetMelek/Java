package lessons_EU7.sundayReview.week08_28112021;

public class Employee_R03 {
	
	public String name;
	String jobtitle;
	double salary;
	int ID;
	
	public Employee_R03(String name, String jobtitle, double salary, int iD) {
		this.name = name; // it is assigning to object. It References the variable that refers to the current object.
		this.jobtitle = jobtitle;
		this.salary = salary;
		ID = iD;
	}
	
	public String toString() {
		return "R03_Employee [name=" + name + ", jobtitle=" + jobtitle + ", salary=" + salary + ", ID=" + ID + "]";
	}
	
	

}
