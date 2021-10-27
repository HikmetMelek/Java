package lessons_EU7.day22_stringManupilation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		
		String userName="";
		String passWord="";
		
		if (userName.isEmpty()) System.out.println("Username field can not be empty");
		else System.out.println("Username in not empty");
		
		if(userName.isEmpty() || passWord.isEmpty()) System.out.println("Username and password can not be empty");
		else System.out.println("Username and password in not empty");

		
	}

}
