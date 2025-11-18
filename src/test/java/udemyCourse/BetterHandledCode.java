package udemyCourse;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BetterHandledCode {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext browserContext;
     Page page;

    @BeforeSuite
    public static void setupBrowser(){
      playwright = Playwright.create();
      browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
              .setArgs(Arrays.asList("--no-sandbox", "--disable-extension", "--disable-gpu")));


        browserContext = browser.newContext(
                new Browser.NewContextOptions().setViewportSize( 1920, 1080));
    }

    @BeforeMethod
    public void newSession(){
        page=browserContext.newPage();


    }
    @Test
    void getTitleOfThePage() {

        page.navigate("https://practicesoftwaretesting.com/");
        System.out.println("Title of the page : " + page.title());


    }
    @Test
    public void AddProductToCart(){
        page.navigate("https://practicesoftwaretesting.com/");
        page.locator("[id=search-query]").fill("slip joint");
        page.locator("[type=submit]").click();
        page.waitForTimeout(5000);
        page.locator(".card-title").click();
        page.waitForTimeout(5000);
        page.locator("// button[@data-test=\"add-to-cart\"]").click();
        page.waitForTimeout(5000);
        System.out.println("Title of the page : " + page.title());
        Assertions.assertTrue(page.locator("//div[@aria-label='Product added to shopping cart.']").isVisible());
        System.out.println("The product is added to cart");

    }
    @AfterSuite
    static void tearDown(){
        browser.close();
        playwright.close();
    }

}
