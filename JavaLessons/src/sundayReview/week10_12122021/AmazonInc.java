package lessons_EU7.sundayReview.week10_12122021;

public class AmazonInc {

	public static void main(String[] args) {
		
		Tester tester= new Tester("Mary", "SDET", 2000, 27, 'F');
		
		tester.setJobTitle("Quality Engineer");
		tester.setAge(25);
		tester.findBugs();
		
		Developer developer= new Developer("Enes", "Front End Dev", 150_000, 40, 'M');
		
		developer.fixBugs();
		developer.setSalary(0);
		System.out.println(developer.getSalary());
		developer.work();
		
		SupportPersonal support= new SupportPersonal("canan", "DD", 1500, 25, 'F');
		support.work();
		
	}

}
