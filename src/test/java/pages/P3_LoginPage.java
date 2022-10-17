package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class P3_LoginPage extends TestBase {
    public P3_LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;

    @FindBy(xpath = "//*[contains(@class , 'login-button')]")
    WebElement loginBtn;

    @FindBy(linkText = "Forgot password?")
    WebElement forgotPassword;

    @FindBy(linkText = "Electronics")
    WebElement categoryName;

    public void fillData() {
        email.sendKeys("msaber9765@gmail.com");
        password.sendKeys("123456");
    }

    public void sendData() {
        loginBtn.click();
    }

    public P5_HomePage checkHomePageDisplayed() throws IOException {
        boolean display = categoryName.isDisplayed();
        System.out.println("-----electronics category name in home is displayed as :  " + display + "-----");
        return new P5_HomePage();
    }

    public P4_ForgetPasswordPage navigateToForgetPage() throws IOException {
        forgotPassword.click();
        return new P4_ForgetPasswordPage();
    }
}
