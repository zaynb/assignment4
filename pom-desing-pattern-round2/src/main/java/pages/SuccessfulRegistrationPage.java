package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulRegistrationPage extends BasePage{


    public SuccessfulRegistrationPage(WebDriver driver) {
        super(driver);
    }

    By successRegistrationMsg = By.className("result");

    public String getRegitrationSuccessMsg ()
    {
        return getTextOfWebElement(successRegistrationMsg);
    }
    public boolean isRegitrationSuccessMsgDisplayed ()
    {
        return isElementDisplayedOnPage(successRegistrationMsg);
    }
}
