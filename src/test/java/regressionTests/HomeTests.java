package regressionTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationBarPage;

public class HomeTests extends BaseTests_Parent{

    @Test(priority = 1)
    public void testHomePageFeatuedProductsAreDisplayed () {
        HomePage homePage = new HomePage(driver);
        // Verify that home page is visible successfully
        Assert.assertEquals(homePage.getTextFeaturedItems(), "FEATURES ITEMS",
                "The home page is not displayed");
    }

    @Test (priority = 2)
    public void testHomePageIsVisibleSuccessfully()
    {

        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnHomeFromNavBar();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://automationexercise.com/" );

    }


}
