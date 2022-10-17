package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import pages.P5_HomePage;

import java.io.IOException;

public class S5_HomeSteps extends TestBase {
    public S5_HomeSteps() throws IOException {
    }

    P5_HomePage p5_homePage;

    @And("user can fill search data and click search")
    public void userCanFillSearchDataAndClickSearch() throws IOException {
        p5_homePage = new P5_HomePage();
        p5_homePage.sendData();
        p5_homePage.checkProductDisplayed();
    }

    @And("user can can change currency to US-Euro")
    public void userCanCanChangeCurrencyToUSEuro() throws IOException {
        p5_homePage = new P5_HomePage();
        p5_homePage.changeCurrency();
    }
}
