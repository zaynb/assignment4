package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // locators
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.cssSelector(".login-button");

    By errorMsg = By.cssSelector(".message-error");
    // operations
    public HomePage loginToApp (String email, String password)
    {
        typeOnInputField(emailField, email);
        typeOnInputField(passwordField, password);
        clickElement(loginBtn);
        // onew step
        return new HomePage(driver);
    }
    public LoginPage loginWithInvalideCredentials (String email, String password)
    {
        typeOnInputField(emailField, email);
        typeOnInputField(passwordField, password);
        clickElement(loginBtn);
        // onew step
        return new LoginPage(driver);
    }

    public String getErrorMsg  ()
    {
        return getTextOfWebElement(errorMsg);
    }

}
