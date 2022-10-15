package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.P4_ForgetPasswordPage;

import java.io.IOException;

public class S4_ForgetPasswordSteps extends TestBase {
    public S4_ForgetPasswordSteps() throws IOException {
    }

    P4_ForgetPasswordPage p4_forgetPasswordPage;

    @When("user fill forget data")
    public void userFillForgetData() throws IOException {
        p4_forgetPasswordPage = new P4_ForgetPasswordPage();
        p4_forgetPasswordPage.fillData();
        System.out.println("-----all forget data are filled-----");
    }

    @And("click on recover button")
    public void clickOnRecoverButton() throws IOException {
        p4_forgetPasswordPage = new P4_ForgetPasswordPage();
        p4_forgetPasswordPage.sendData();
        System.out.println("-----all forget data are sent-----");
        p4_forgetPasswordPage.checkMessage();
    }
}
