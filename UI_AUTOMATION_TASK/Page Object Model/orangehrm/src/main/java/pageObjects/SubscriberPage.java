package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriberPage {

    public SubscriberPage(WebDriver driver) {
        this.driver = driver;
    }
    private final WebDriver driver;
    //Using By as a location to identify the login fields
    private final By SubscriberName = By.id("subscriber_name");

    private final By SubscriberEmail = By.id("subscriber_email");

    private final By subscribeButton = By.id("btnSubscribe");

    private final By DashboardPage = By.linkText("Dashboard");

    private final By welcome = By.id("welcome");

    private final By logoutButton = By.linkText("Logout");

    public void enterName(String sName) {
        //Find the username element and enter the username
        driver.findElement(SubscriberName).sendKeys(sName);
    }

    public void enterEmail (String spwd) {
        //Find the username element and enter the username
        driver.findElement(SubscriberEmail).sendKeys(spwd);
    }

    public void clickSubscriberButton() {
        //find the username element and username
        driver.findElement(subscribeButton).click();
    }

    public DashboardPage clickDashboardMenu(){
        driver.findElement (DashboardPage).click();
        return new DashboardPage(driver);
    }

    public void clickWelcome(){
        //find the welcome element and click on the welcome button
        driver.findElement(welcome).click();
    }
    public LoginPage clicklogout(){
        //find the logout element and click on thr logout button
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }

}
