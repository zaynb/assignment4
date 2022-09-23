package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage{


    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    By productName = By.cssSelector(".product-title > a");
    By probuctPrice = By.cssSelector(".prices > span");

    public String getProductTitle ()
    {
        return getTextOfWebElement(productName);
    }
    public String getPriceOfProduct ()
    {
        return getTextOfWebElement(probuctPrice);
    }

}
