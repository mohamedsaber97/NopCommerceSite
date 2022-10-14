package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends TestBase {
    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;

    @FindBy(className = "button-1 login-button")
    WebElement loginBtn;

    public void fillData() {
        email.sendKeys("test600@gmail.com");
        password.sendKeys("123456");
    }

    public void sendData() {
        loginBtn.click();
    }
}
