package testCases;

import org.testng.annotations.Test;
import pageObject.LoginPage;
import test.BaseTest;

public class Login extends BaseTest {


    @Test
    public void successfulLogin(){
        LoginPage loginPage = new LoginPage(page);
        loginPage.navigateToLoginPage();
        loginPage.validLogin();

    }
}
