package regressionTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NavigationBarPage;

public class ProductDetailsTests extends BaseTests_Parent{
    NavigationBarPage navigationBarPage;
    HomePage homePage;
    // preconditon
    @BeforeMethod
    public void loginToApp ()
    {
        navigationBarPage = new NavigationBarPage(driver);
        LoginPage loginPage = navigationBarPage.clickOnLoginFromNavBar();
        // login to app
        homePage= loginPage.loginToApp("dsadas@email.com", "1234567");
    }
    @Test
    public void testProductDetails ()
    {
        String productToSearchFor = "Apple MacBook Pro 13-inch" ;
        ProductDetailsPage productDetailsPage = navigationBarPage.searchProduct(productToSearchFor);
        Assert.assertEquals(productDetailsPage.getProductTitle(), productToSearchFor);
        Assert.assertEquals(productDetailsPage.getPriceOfProduct(), "$1,800.00");
    }
}
