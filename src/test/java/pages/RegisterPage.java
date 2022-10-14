package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class RegisterPage extends TestBase {

    public RegisterPage() throws IOException {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "gender-male")
    WebElement gender;
    @FindBy(id = "FirstName")
    WebElement firstName;
    @FindBy(id = "LastName")
    WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    WebElement day;
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Company")
    WebElement company;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(id = "register-button")
    WebElement registerBtn;

    @FindBy(className = "result")
    WebElement resultMsg;

    @FindBy(linkText = "Log out")
    WebElement logOutBtn;

    @FindBy(linkText = "Log in")
    WebElement loginBtn;


    public void selectDate() {
        Select dayDropdown = new Select(day);
        dayDropdown.selectByIndex(1);
        Select monthDropdown = new Select(month);
        monthDropdown.selectByIndex(4);
        Select yearDropdown = new Select(year);
        yearDropdown.selectByIndex(2);
    }

    public void fillData() {
        gender.click();
        firstName.sendKeys("test");
        lastName.sendKeys("user600");
        selectDate();
        email.sendKeys("test600@gmail.com");
        company.sendKeys("Awamer600");
        password.sendKeys("123456");
        confirmPassword.sendKeys("123456");
    }

    public void sendData() {
        registerBtn.click();
    }

    public void checkResultMsg() {
        boolean display = resultMsg.isDisplayed();
        System.out.println("display result msg is :  " + display);
    }

    public void logOut() {
        logOutBtn.click();
    }

    public LoginPage navigateToLoginPage() throws IOException {
        loginBtn.click();
        return new LoginPage();
    }
}
