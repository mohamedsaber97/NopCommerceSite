package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import pages.RegisterPage;

import java.io.IOException;

public class RegisterSteps extends TestBase {

    public RegisterSteps() throws IOException {
    }

    RegisterPage registerPage;

    @And("user fill firstName data")
    public void userFillFirstNameData() throws IOException {
        registerPage = new RegisterPage();
        registerPage.sendData();
        System.out.println("first name is entered");
    }
}
