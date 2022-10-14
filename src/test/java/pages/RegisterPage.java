package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegisterPage extends TestBase {

    public RegisterPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "FirstName")
    WebElement firstNameTxt;

    public void sendData() {
        firstNameTxt.sendKeys("saber");
    }


}
