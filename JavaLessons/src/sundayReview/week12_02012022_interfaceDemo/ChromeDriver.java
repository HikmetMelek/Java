package sundayReview.week12_02012022_interfaceDemo;

public class ChromeDriver implements WebDriver{

    public ChromeDriver(){
        System.out.println("launching chrome browser");
    }

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver navigate to "+ url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver locating element by "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver ending or killing all the opened sessions");
    }

    @Override
    public String getTitle() {
        return "EU7 is the greatest";
    }
}
