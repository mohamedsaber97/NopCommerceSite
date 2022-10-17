package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P3_LoginPage;
import pages.P4_ForgetPasswordPage;
import pages.P5_HomePage;

import java.io.IOException;

public class S3_LoginSteps extends TestBase {
    public S3_LoginSteps() throws IOException {
    }

    P3_LoginPage p3Login;
    P4_ForgetPasswordPage p4_forgetPasswordPage;
    P5_HomePage p5_homePage;

    @When("user fill login data")
    public void userFillLoginData() throws IOException {
        p3Login = new P3_LoginPage();
        p3Login.fillData();
    }

    @And("click on login button")
    public void clickOnLoginButton() throws IOException {
        p3Login = new P3_LoginPage();
        p3Login.sendData();
    }

    @Then("home page is opened")
    public void homePageIsOpened() throws IOException {
        p3Login = new P3_LoginPage();
        p5_homePage = p3Login.checkHomePageDisplayed();
    }

    @And("user navigate to forget page")
    public void userNavigateToForgetPage() throws IOException {
        p3Login = new P3_LoginPage();
        p4_forgetPasswordPage = p3Login.navigateToForgetPage();
    }


}
