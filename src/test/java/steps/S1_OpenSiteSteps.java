package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.P1_OpenSitePage;
import pages.P2_RegisterPage;

import java.io.IOException;

public class S1_OpenSiteSteps extends TestBase {

    public S1_OpenSiteSteps() throws IOException {
    }

    P1_OpenSitePage p1OpenSitePage;
    P2_RegisterPage p2Register;

    @Given("user open browser")
    public void userOpenBrowser() {
        initialization(prop.getProperty("browser"));
    }

    @And("user navigate to register page")
    public void userNavigateToRegisterPage() throws IOException {
        p1OpenSitePage = new P1_OpenSitePage();
        p2Register = p1OpenSitePage.navigateToRegisterPage();
        System.out.println("we navigate to register page");
    }


}
