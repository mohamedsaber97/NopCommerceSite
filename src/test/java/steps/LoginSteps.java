package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;

import java.io.IOException;

public class LoginSteps extends TestBase {
    public LoginSteps() throws IOException {
    }

    LoginPage loginPage;

    @When("user fill login data")
    public void userFillLoginData() throws IOException {
        loginPage = new LoginPage();
        loginPage.fillData();
        System.out.println("all login data are filled");
    }

    @And("click on login button")
    public void clickOnLoginButton() throws IOException {
        loginPage = new LoginPage();
        loginPage.sendData();
        System.out.println("all login data are sent");
    }

}
