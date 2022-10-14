package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;

import java.io.IOException;

public class RegisterSteps extends TestBase {

    public RegisterSteps() throws IOException {
    }

    RegisterPage registerPage;
    LoginPage loginPage;

    @When("user fill register data")
    public void userFillFirstNameData() throws IOException {
        registerPage = new RegisterPage();
        registerPage.fillData();
        System.out.println("all register data are filled");
    }

    @And("click on register button")
    public void clickOnRegisterButton() throws IOException {
        registerPage = new RegisterPage();
        registerPage.sendData();
        System.out.println("all register data are sent");
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() throws IOException {
        registerPage = new RegisterPage();
        registerPage.checkResultMsg();
    }

    @And("user log out from system")
    public void userLogOutFromSystem() throws IOException {
        registerPage = new RegisterPage();
        registerPage.logOut();
    }

    @And("user navigate to login page")
    public void userNavigateToLoginPage() throws IOException {
        registerPage = new RegisterPage();
        loginPage = registerPage.navigateToLoginPage();
        System.out.println("we navigate to login page");
    }


}
