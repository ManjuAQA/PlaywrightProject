package testCases;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.ProductPage;
import test.BaseTest;

public class AddProductToCartTest extends BaseTest {


    @Test
    public void addProductTocart(){
        HomePage homePage = new HomePage(page);
        ProductPage productPage = new ProductPage(page);
        homePage.navigateTo();
        homePage.searchTheProduct();
        homePage.clickSearchButton();
        homePage.productIsDisplayed();
        homePage.clickTheProductCard();
        productPage.clickIncreateQuantityButton();
        productPage.clickAddToCartButton();
        page.waitForTimeout(5000);
    }

}
