package sundayReview.sundayWeek8_28112021;

public class Credentials {
	
	private String userName="Spartan300";
	private String passWord="hectorTheTroyan";
	
	// i have default constructor.
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		boolean passwordSize;
		boolean uppercase=false;
		boolean lowercase=false;
		boolean special=false;

		passwordSize= (passWord.length()>8)? true: false;
		
		for (char eachLetter: passWord.toCharArray()) {
			if(Character.isUpperCase(eachLetter)) {
				uppercase=true;
			}
			if(Character.isLowerCase(eachLetter)) {
				lowercase=true;
			}
			if(!Character.isLetterOrDigit(eachLetter)) {
				special=true;
			}
		}
		if(passwordSize&& uppercase&& lowercase&& special== true)
			this.passWord=passWord;
		else this.passWord= null;
	}

}
