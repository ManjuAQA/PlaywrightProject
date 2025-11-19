package pageObject;

import com.microsoft.playwright.Page;

public class ProductPage extends BasePage {
    private final String addToCartButton= "#btn-add-to-cart";
    private final String increaseQunatityBytton= "#btn-increase-quantity";


    public ProductPage(Page page) {
        super(page);
    }
     public void clickAddToCartButton(){
        click(addToCartButton);

     }
     public void clickIncreateQuantityButton(){
        click(increaseQunatityBytton);
     }


}
