package pages;

import base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class P4_ForgetPasswordPage extends TestBase {
    public P4_ForgetPasswordPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(name = "send-email")
    WebElement recoverBtn;

    @FindBy(xpath = "//*[contains(@class , 'content')]")
    WebElement emailMsg;


    public void fillData() {
        email.sendKeys("msaber9765@gmail.com");
        System.out.println("-----all forget data are filled-----");
    }

    public void sendData() {
        recoverBtn.click();
        System.out.println("-----all forget data are sent-----");
    }

    public void checkMessage() {
        String actualResult = emailMsg.getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("-----expectedResult is equal to actualResult-----");
    }
}
