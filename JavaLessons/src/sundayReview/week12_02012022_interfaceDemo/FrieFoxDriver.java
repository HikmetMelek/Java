package sundayReview.week12_02012022_interfaceDemo;

import sundayReview.week12_02012022_interfaceDemo.WebDriver;

public class FrieFoxDriver implements WebDriver {
    public FrieFoxDriver() {
        System.out.println("launching firefox browser");
    }

    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver navigate to "+ url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver locating element by "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver ending or killing all the opened sessions");
    }

    @Override
    public String getTitle() {
        return "EU7 is making test";
    }
}
