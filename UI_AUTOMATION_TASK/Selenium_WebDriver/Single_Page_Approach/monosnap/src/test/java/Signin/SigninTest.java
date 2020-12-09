package Signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class SigninTest {

    private WebDriver driver;

        @BeforeClass
        public void setUp() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver-1");
            driver=new ChromeDriver();
            driver.get("https://monosnap.com/");
            //sleep for 5 seconds
            Thread.sleep(5000);
            //maximize the window
            driver.manage().window().maximize();
            System.out.println (driver.getTitle());

            //find the signin icon first and click it
            driver.findElement(By.className("headButton")).click();

            //enter the email
            driver.findElement(By.className("w-100")).sendKeys("seyeologunja@shaw.ca");

            //enter the password
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys( "Cecigi,1234");

            //locate button field
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        }

        public static void main(String[] args) throws InterruptedException {
            SigninTest test = new SigninTest();
            test.setUp();
        }

        public void tearDown() {
            driver.quit ();
        }
    }

