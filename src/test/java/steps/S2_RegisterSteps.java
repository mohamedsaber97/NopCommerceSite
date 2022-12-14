package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P2_RegisterPage;

import java.io.IOException;

public class S2_RegisterSteps extends TestBase {

    public S2_RegisterSteps() throws IOException {
    }

    P2_RegisterPage p2Register;

    @When("user fill register data")
    public void userFillFirstNameData() throws IOException {
        p2Register = new P2_RegisterPage();
        p2Register.fillData();
    }

    @And("click on register button")
    public void clickOnRegisterButton() throws IOException {
        p2Register = new P2_RegisterPage();
        p2Register.sendData();
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

}
