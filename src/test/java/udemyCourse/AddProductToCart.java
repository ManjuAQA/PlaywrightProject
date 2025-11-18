package udemyCourse;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCart {
    @Test
    void getTitleOfThePage()  {

        Playwright playwright = Playwright.create();
        Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


         BrowserContext context = browser.newContext(
                 new Browser.NewContextOptions().setViewportSize(null)
         );
         Page page = context.newPage();
         page.navigate( "https://practicesoftwaretesting.com/");
         System.out.println("Title of the page : "+ page.title());
         page.locator("[id=search-query]").fill("slip joint");
         page.locator("[type=submit]").click();
         page.waitForTimeout(5000);
         page.locator(".card-title").click();
         page.waitForTimeout(5000);
         page.locator("// button[@data-test=\"add-to-cart\"]").click();
         page.waitForTimeout(5000);
         System.out.println("Title of the page : "+ page.title());
         Assertions.assertTrue( page.locator("//div[@aria-label='Product added to shopping cart.']").isVisible());
         System.out.println("The product is added to cart");
         browser.close();
         playwright.close();
    }

}