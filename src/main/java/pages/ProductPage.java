package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private By firstProduct = By.xpath("(//div[@class=\"productinfo text-center\"])[1]");
    private By addToCartBtnOfFirstProduct = By.xpath("(//div[@class=\"productinfo text-center\"]/a)[1]");

    private By secondProduct = By.xpath("(//div[@class=\"productinfo text-center\"])[2]");
    private By addToCartBtnOfSecondProduct = By.xpath("(//div[@class=\"productinfo text-center\"]/a)[2]");

    private By continueShoppingBtn = By.xpath("//button[contains(@class,'close-modal')]");
    private By viewCartBtn = By.xpath("//div[@class=\"modal-body\"]//a");

    By searchTextBox = By.id("search_product");
    By searchIcon = By.id("submit_search");

    By searchtitle = By.xpath("//h2[@class='title text-center']");



    public ProductPage EnterProductNameInsearchInput (String searchText)
    {

        clickElement(searchTextBox);
        typeOnInputField(searchTextBox,searchText);
        clickElement(searchIcon);
        return new ProductPage(driver);
    }
    public String getTextsearchtitle ()
    {
        return getTextOfElement(searchtitle) ;
    }
    public void addFirstProductToCart() {
        scrollVertically(700);
        hoverOverElement(firstProduct);
        forceClickOnElement(addToCartBtnOfFirstProduct);
    }

    public void addSecondProductToCart() {
        hoverOverElement(secondProduct);
        forceClickOnElement(addToCartBtnOfSecondProduct);
    }

    public ProductPage clickContinueShoppingBtn() {
        clickElement(continueShoppingBtn);
        return new ProductPage(driver);
    }

    public CartPage clickViewCartButton() {
        clickElement(viewCartBtn);
        return new CartPage(driver);
    }


}
