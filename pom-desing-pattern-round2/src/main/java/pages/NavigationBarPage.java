package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePage{


    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    By loginFromNavbar = By.className("ico-login");
    By registerFromNavBar = By.className("ico-register");
By searchInputField = By.id("small-searchterms");

    // operations
    public LoginPage clickOnLoginFromNavBar ()
    {
        clickElement(loginFromNavbar);
        return new LoginPage(driver);
    }
    public RegistrationPage clickOnRegisterFromNavBar ()
    {
        clickElement(registerFromNavBar);
        return new RegistrationPage(driver);
    }
    public ProductDetailsPage searchProduct (String productName)
    {
        typeOnInputField(searchInputField, productName + Keys.ENTER);
        return new ProductDetailsPage(driver);
    }

}
