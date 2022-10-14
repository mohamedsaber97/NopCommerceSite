package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.RegisterPage;

import java.io.IOException;

public class RegisterSteps extends TestBase {

    public RegisterSteps() throws IOException {
    }

    RegisterPage registerPage;

    @When("user fill register data")
    public void userFillFirstNameData() throws IOException {
        registerPage = new RegisterPage();
        registerPage.fillData();
        System.out.println("all data are filled");
    }

    @And("click on register button")
    public void clickOnRegisterButton() throws IOException {
        registerPage = new RegisterPage();
        registerPage.sendData();
        System.out.println("all data are sent");
    }
}
