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

    public void fillData() {
        email.sendKeys("tt22@gmail.com");
        password.sendKeys("123456");
    }

    public void sendData() {
        loginBtn.click();
    }
}