package regressionTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationBarPage;
import pages.ProductPage;

public class ProductTests extends BaseTests_Parent{

    @Test
    public void testProductPageIsVisibleSuccessfully()
    {

        NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnProductFromNavBar();

        ProductPage productPageBj = new ProductPage(driver);
        String searchProduct = "Stylish Dress";
        String stitle = "SEARCHED PRODUCTS";
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://automationexercise.com/products" );
        productPageBj.EnterProductNameInsearchInput(searchProduct);

        Assert.assertEquals(productPageBj.getTextsearchtitle(),stitle);

    }
}
