package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.P3_LoginPage;

import java.io.IOException;

public class S3_LoginSteps extends TestBase {
    public S3_LoginSteps() throws IOException {
    }

    P3_LoginPage p3Login;

    @When("user fill login data")
    public void userFillLoginData() throws IOException {
        p3Login = new P3_LoginPage();
        p3Login.fillData();
        System.out.println("all login data are filled");
    }

    @And("click on login button")
    public void clickOnLoginButton() throws IOException {
        p3Login = new P3_LoginPage();
        p3Login.sendData();
        System.out.println("all login data are sent");
    }

}
