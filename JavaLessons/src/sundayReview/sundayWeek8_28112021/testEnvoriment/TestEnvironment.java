package sundayReview.sundayWeek8_28112021.testEnvoriment;

public class TestEnvironment {
	 
	Browser browser;
	OS os;

	public String toString() {
		return browser.getBrowserType()+ " / "+ os.getOs();
	}
	
	

}
