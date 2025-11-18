package pageObject;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {
    private String welcomeText = "//h1[contains(text(),'Welcome')]";

    public HomePage(Page page) {
        super(page);
    }

    public String getWelcomeMessage() {
        return getText(welcomeText);
    }
}
