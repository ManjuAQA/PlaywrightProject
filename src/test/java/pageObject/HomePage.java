package pageObject;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class HomePage extends BasePage {
    private final String url = "https://practicesoftwaretesting.com/";
    private final String searchBar = "Search";
    private final String searchButton = "button[type='submit']";
    private final String displayedCard = ".card-title";
    private final String searchText = "Sheet Sander";

    public HomePage(Page page) {
        super(page);
    }
     public void navigateTo(){
        page.navigate(url);
     }
    public void searchTheProduct(){
       page.getByPlaceholder(searchBar).fill(searchText);
    }

     public void clickSearchButton(){
         page.locator(searchButton).click();

     }


     public void productIsDisplayed(){
        page.waitForTimeout(5000);
         Assert.assertTrue(page.isVisible(displayedCard));
     }
     public void clickTheProductCard(){
        click(displayedCard);
        page.waitForTimeout(5000);
     }
}
