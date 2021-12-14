package lessons_EU7.sundayReview.week10_12122021;

public class Employee {
	
	private String name, jobTitle;
	private double salary;
	private int age;
	private final char gender; // can be st only one time with constructor
	
	public Employee(String name, String jobTitle, double salary, int age, char gender) {
		this.name = name;
		this.jobTitle = jobTitle;
		setSalary(salary);
		setAge(age);
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary<=0) System.err.println("Salary can not be under 0");
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		if(age<=0) {
			System.err.println("Age can not be negative number");
			return; // if age <0 get out from method!
		}
		if(age<=18) {
			System.err.println("Employee must be over 18");
			return; // if age <18 get out from method!
		}
	}

	public char getGender() {
		return gender;
	}

	public void work() {
		System.out.println(name+" is working");
	}
	
	

}
