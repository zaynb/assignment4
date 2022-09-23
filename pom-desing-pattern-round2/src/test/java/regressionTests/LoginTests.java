package regressionTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationBarPage;

public class LoginTests extends BaseTests_Parent{

    @Test(priority = 1)
    public void testLoginNavigation() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        LoginPage loginPage = navigationBarPage.clickOnLoginFromNavBar();
        // login to app
        HomePage homePage = loginPage.loginToApp("dsadas@email.com", "1234567");
        // check success msg
        Assert.assertEquals(homePage.getWelcomeMsg(), "Welcome to our store");
    }

    @Test(priority = 2)
    public void loginWithInvalidCrdentials ()
    {
        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        LoginPage loginPage = navigationBarPage.clickOnLoginFromNavBar();
        // login to app
        loginPage = loginPage.loginWithInvalideCredentials("first.fwef@email.com", "1234567");
        // check success msg
        Assert.assertEquals(loginPage.getErrorMsg(),
                "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }
}
