package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement textUsername;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement textPassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    public void setTextUsername(String username){
        textUsername.sendKeys(username);
    }
    public void setTextPassword(String password){
        textPassword.sendKeys(password);
    }
    public void setLoginButton(){
        loginButton.click();
    }
}
