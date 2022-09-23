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
    By homePageLink = By.xpath("(//i[@class=\"fa fa-home\"])");
    By productlink =By.xpath("//a[@href='/products']");
    private By productBtn = By.xpath("//a[@href=\"/products\"]");

    // operations

    public HomePage clickOnHomeFromNavBar ()
    {
        clickElement(homePageLink);
        return new HomePage(driver);
    }

    public ProductPage clickOnProductFromNavBar ()
    {
        clickElement(productlink);
        return new ProductPage(driver);
    }
    public ProductPage clickOnProductBtn ()
    {
        clickElement(productBtn);
        return new ProductPage(driver) ;
    }

}
