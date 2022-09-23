package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
// selelnium action dropdown, alerts, tabs, hovring
public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public WebElement locateElement (By elementLocator)
    {
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
            wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            return driver.findElement(elementLocator);
    }
    public void clickElement (By elementLocator)
    {
        locateElement(elementLocator).click();
    }
    public void typeOnInputField (By elementLocator, String text)
    {
        locateElement(elementLocator).sendKeys(text);
    }
    public boolean isElementDisplayedOnPage(By elementLocator)
    {
       return locateElement(elementLocator).isDisplayed();
    }
    public String getTextOfWebElement(By elementLocator)
    {
        return locateElement(elementLocator).getText();
    }

    public void acceptAlert ()
    {
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

}
