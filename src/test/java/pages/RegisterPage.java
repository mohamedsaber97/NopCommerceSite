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
        firstName.sendKeys("mohamed");
        lastName.sendKeys("saber");
        selectDate();
        email.sendKeys("msaber9765@gmail.com");
        company.sendKeys("Awamer");
        password.sendKeys("123456");
        confirmPassword.sendKeys("123456");
    }

    public void sendData() {
        registerBtn.click();
    }
}
