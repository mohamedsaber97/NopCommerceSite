package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OpenSitePage extends TestBase {

    public OpenSitePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    WebElement registerBtn;

    public RegisterPage navigateToRegisterPage() throws IOException {
        registerBtn.click();
        return new RegisterPage();
    }
}
