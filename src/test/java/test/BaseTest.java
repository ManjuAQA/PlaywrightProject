package test;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

import java.util.Arrays;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeSuite
    public void setUpSuite() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false)
                        .setArgs(Arrays.asList("--no-sandbox", "--disable-extension", "--disable-gpu"))
        );
    }

    @BeforeMethod
    public void newBrowserSession() {
        context = browser.newContext(new Browser.NewContextOptions()
                .setViewportSize(1920, 1080)
        );
        page = context.newPage();     // NOW page is not null
    }

    @AfterMethod
    public void tearDownTest() {
        if (context != null) context.close();   // Close only context per test
    }

    @AfterSuite
    public void tearDownSuite() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
