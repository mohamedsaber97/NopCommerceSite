package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.OpenSitePage;
import pages.RegisterPage;

import java.io.IOException;

public class OpenSiteSteps extends TestBase {

    public OpenSiteSteps() throws IOException {
    }

    OpenSitePage openSitePage;
    RegisterPage registerPage;

    @Given("user open browser")
    public void userOpenBrowser() {
        initialization(prop.getProperty("browser"));
    }

    @And("user navigate to register page")
    public void userNavigateToRegisterPage() throws IOException {
        openSitePage = new OpenSitePage();
        registerPage = openSitePage.navigateToRegisterPage();
        System.out.println("we navigate to register page");
    }


}
