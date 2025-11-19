package pageObject;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {
    private final String usernameInput = "#email";
    private final String passwordInput = "#password";
    private final String loginButton = ".btnSubmit";
    private final String errorMsg = "#error";

    public LoginPage(Page page) {
        super(page);

    }

    public LoginPage enterUsername(String username) {
        type(usernameInput, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        type(passwordInput, password);
        return this;
    }

    public void  clickLoginButton (String loginButton){
        click(loginButton);
    }

    public String getErrorMessage() {
        return getText(errorMsg);
    }

    public void validLogin(){
        enterUsername("kiludira@forexzig.com");
        enterPassword("142434@Test");
        page.waitForTimeout(5000);
        clickLoginButton(loginButton);
        page.waitForTimeout(5000);

    }
    public void navigateToLoginPage(){
        page.navigate("https://practicesoftwaretesting.com/auth/login");

    }
}
