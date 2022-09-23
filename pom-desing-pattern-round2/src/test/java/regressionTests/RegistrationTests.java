package regressionTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationBarPage;

public class RegistrationTests extends BaseTests_Parent{
    @Test
    public void testRegisterNewUser ()
    {

        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        RegistrationPage registrationPage = navigationBarPage.clickOnRegisterFromNavBar();
        SuccessfulRegistrationPage successfulRegistrationPage = registrationPage.registerNewUserWithValidData(
                "first", "last124", "Mike.Jones12f3455cs26@email.com", "1234567", "1234567"
        );
        Assert.assertEquals(successfulRegistrationPage.getRegitrationSuccessMsg(), "Your registration completed",
                "suuccessful message should be 'Your registration completed'");
        Assert.assertTrue(successfulRegistrationPage.isRegitrationSuccessMsgDisplayed());
    }
}
