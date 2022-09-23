package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By welcomeMsg = By.cssSelector(".topic-block-title > h2");
    By featuredItems = By.cssSelector(".features_items > h2");



    public String getTextFeaturedItems ()
    {
        return getTextOfElement(featuredItems) ;
    }
}
