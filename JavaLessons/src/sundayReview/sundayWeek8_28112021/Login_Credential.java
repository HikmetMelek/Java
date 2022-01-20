package sundayReview.sundayWeek8_28112021;

public class Login_Credential {

	public static void main(String[] args) {
		
		Credentials credentials= new Credentials();
		//System.out.println(credentials.userName); // not reachable
		// credentials.passWord("Sparttaaaaa");// not reachable
		
		System.out.println(credentials.getUserName());
		System.out.println(credentials.getPassWord());
		
		credentials.setPassWord("Ne&buchadnezzar324");
		System.out.println("\nafter changing: "+ credentials.getPassWord());
		
		
		

	}

}
