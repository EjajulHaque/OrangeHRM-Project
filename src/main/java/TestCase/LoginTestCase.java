package TestCase;

import PageObject.LoginPage;
import TestBase.BaseClass;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass {
    @Test
    public void loginAccount(){
        LoginPage lp=new LoginPage(driver);
        lp.setTextUsername("Admin");
        lp.setTextPassword("admin123");
        lp.setLoginButton();
    }
}
