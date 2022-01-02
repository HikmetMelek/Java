package sundayReview.week12_02012022_interfaceDemo;

public interface WebDriver {

    void get(String url);// public abstract
    void findElement(String locator);
    void quit();
    String getTitle();


}
