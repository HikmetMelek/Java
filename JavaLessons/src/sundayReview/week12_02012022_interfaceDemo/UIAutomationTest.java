package sundayReview.week12_02012022_interfaceDemo;

public class UIAutomationTest {
    public static void main(String[] args) {
     //   WebDriver driver= new ChromeDriver();// polymorphic way

        ChromeDriver driver1= new ChromeDriver();

        FrieFoxDriver driver2= new FrieFoxDriver();

        driver1.get("http://practice.cybertekschool.com/");
        driver1.findElement("//input[@att='value']");
        System.out.println(driver1.getTitle());
        driver1.quit();

        System.out.println("====================================");
        driver2.get("http://practice.cybertekschool.com/");
        driver2.findElement("//input[@att='value']");
        System.out.println(driver2.getTitle());
        driver2.quit();





    }
}
