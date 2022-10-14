package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P3_LoginPage;
import pages.P2_RegisterPage;

import java.io.IOException;

public class S2_RegisterSteps extends TestBase {

    public S2_RegisterSteps() throws IOException {
    }

    P2_RegisterPage p2Register;
    P3_LoginPage p3Login;

    @When("user fill register data")
    public void userFillFirstNameData() throws IOException {
        p2Register = new P2_RegisterPage();
        p2Register.fillData();
        System.out.println("all register data are filled");
    }

    @And("click on register button")
    public void clickOnRegisterButton() throws IOException {
        p2Register = new P2_RegisterPage();
        p2Register.sendData();
        System.out.println("all register data are sent");
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() throws IOException {
        p2Register = new P2_RegisterPage();
        p2Register.checkResultMsg();
    }

    @And("user log out from system")
    public void userLogOutFromSystem() throws IOException {
        p2Register = new P2_RegisterPage();
        p2Register.logOut();
    }

    @And("user navigate to login page")
    public void userNavigateToLoginPage() throws IOException {
        p2Register = new P2_RegisterPage();
        p3Login = p2Register.navigateToLoginPage();
        System.out.println("we navigate to login page");
    }


}
