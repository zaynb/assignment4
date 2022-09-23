package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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
    public List<WebElement> locateListOfElement (By elementsLocator)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementsLocator));
        wait.until(ExpectedConditions.elementToBeClickable(elementsLocator));
        return driver.findElements(elementsLocator);
    }

    public void clickElement (By elementLocator)
    {
        locateElement(elementLocator).click();
    }

    public void typeOnInputField (By elementLocator, String text)
    {
        locateElement(elementLocator).sendKeys(text);
    }

    public String getTextOfElement (By elementLocator)
    {
        return locateElement(elementLocator).getText();
    }


    public String getAttributeOfElement (By elementLocator, String attributeKey)
    {
        return locateElement(elementLocator).getAttribute(attributeKey);
    }

    public void hoverOverElement (By elementLocator)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(locateElement(elementLocator));
        actions.perform();
    }
    public void hoverThenClick (By firstLocator, By secondLocator)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(locateElement(firstLocator)).click(locateElement(secondLocator)).perform();
    }
    public void scrollToElement (By elementLocator)
    {
        Actions actions = new Actions(driver);
        actions.scrollToElement(locateElement(elementLocator)).perform();
    }
    public void scrollVertically (int deltaY)
    {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, deltaY).perform();

    }
    public void forceClickOnElement (By elmentLocator)
    {
        WebElement elementToClick = locateElement(elmentLocator);
        JavascriptExecutor js = (JavascriptExecutor)driver ;
        js.executeScript("arguments[0].click()" , elementToClick) ;
    }

    // select from drop by visibleb text

    // accespt alert

    // dismiss alert

    // hover

    // context click

    // ...................

}
