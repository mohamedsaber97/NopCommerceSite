package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class P1_OpenSitePage extends TestBase {

    public P1_OpenSitePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    WebElement registerBtn;

    @FindBy(linkText = "Log in")
    WebElement loginBtn;

    public P2_RegisterPage navigateToRegisterPage() throws IOException {
        registerBtn.click();
        System.out.println("-----we navigate to register page-----");
        return new P2_RegisterPage();
    }

    public P3_LoginPage navigateToLoginPage() throws IOException {
        loginBtn.click();
        System.out.println("-----we navigate to login page-----");
        return new P3_LoginPage();
    }

}
