package lessons_EU7.sundayReview.week08_28112021.testEnvoriment;

public class TestEnvironment {
	 
	Browser browser;
	OS os;

	public String toString() {
		return browser.getBrowserType()+ " / "+ os.getOs();
	}
	
	

}
