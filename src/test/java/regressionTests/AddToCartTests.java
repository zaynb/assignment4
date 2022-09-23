package regressionTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.NavigationBarPage;
import pages.ProductPage;

public class AddToCartTests extends BaseTests_Parent {


@Test
public void testAddToCartFunctionality (){
    NavigationBarPage navigationBarPage = new NavigationBarPage(driver);
    ProductPage productsPage = navigationBarPage.clickOnProductBtn();
    productsPage.addFirstProductToCart();
    productsPage = productsPage.clickContinueShoppingBtn() ;
    productsPage.addSecondProductToCart();
    CartPage cartPage = productsPage.clickViewCartButton ();
    Assert.assertEquals(cartPage.getSizeOfAddedProducts(), 2, "The added products should be 2");
    Assert.assertEquals(cartPage.getFirstProductPrice(), "Rs. 500", "The price should be Rs. 500");
}




}
