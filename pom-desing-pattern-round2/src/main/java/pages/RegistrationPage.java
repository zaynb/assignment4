package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By firstnameField = By.id("FirstName");
    By lastnameField = By.id("LastName");
    By emailFiled = By.name("Email_2");
    By passwordField = By.name("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");

    public SuccessfulRegistrationPage registerNewUserWithValidData
            (String fName, String lName, String email, String password, String confrimPass) {
        typeOnInputField(firstnameField, fName);
        typeOnInputField(lastnameField, lName);
        typeOnInputField(emailFiled, email);
        typeOnInputField(passwordField, password);
        typeOnInputField(confirmPasswordField, confrimPass);
        clickElement(registerBtn);

        return new SuccessfulRegistrationPage(driver);
    }
}
