package testLogin;

import org.testng.annotations.Test;
import PageObject.DashboardPage;
import SetUp.SetUpTests;

public class LoginTests extends SetUpTests {
    //TestNG annotation
    @Test
    public void testLogin() throws InterruptedException{
        String username = "sologunja";
        loginPage.enterUsername(username);
        loginPage.enterUserpassword("Cecigi,1234");

        DashboardPage dashboardPage = loginPage.ClickLoginButton();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }

}