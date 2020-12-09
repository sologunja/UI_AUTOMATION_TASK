package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver-1");
        driver=new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //sleep for 5 seconds

        //maximize the window
        driver.manage().window().maximize();
        System.out.println (driver.getTitle());


        driver.findElement(By.id("username")).sendKeys("sologunja");
        driver.findElement(By.id("password")).sendKeys("Cecigi,1234");
        driver.findElement(By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div/div/div/div/div/div/div/form/button")).click();
        driver.quit();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

}
