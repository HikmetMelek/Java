package lessons_EU7.day16_classObjects_Part1;

public class Contact {
	
	String name;
	long phoneNumber;
	String email;
	
	public void call() {
		
		System.out.println(" calling " + name + ".....");
	}
	
	public void sendMessage() {
		
		System.out.println(" sending message to"+ phoneNumber + " name:" + name);
	}
	
	public void sendEmail() {
	
	System.out.println(" sending email to"+ email + "......");
	
	}

}
