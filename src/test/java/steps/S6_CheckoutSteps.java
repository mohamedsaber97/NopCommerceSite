package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P6_CheckoutPage;

import java.io.IOException;

public class S6_CheckoutSteps extends TestBase {
    public S6_CheckoutSteps() throws IOException {
    }

    P6_CheckoutPage p6_checkoutPage;

    @When("user open cart")
    public void userOpenCart() throws IOException {
        p6_checkoutPage = new P6_CheckoutPage();
        p6_checkoutPage.openCart();
    }

    @And("accept terms and click on checkout")
    public void acceptTermsAndClickOnCheckout() throws IOException {
        p6_checkoutPage = new P6_CheckoutPage();
        p6_checkoutPage.clickOnCheckout();
    }

    @And("fill billing address data and save it")
    public void fillBillingAddressDataAndSaveIt() throws IOException, InterruptedException {
        p6_checkoutPage = new P6_CheckoutPage();
        p6_checkoutPage.fillAndSaveBillingData();
    }

    @And("confirm all order steps")
    public void confirmAllOrderSteps() throws IOException {
        p6_checkoutPage = new P6_CheckoutPage();
        p6_checkoutPage.confirmAllOrderSteps();
    }

    @Then("order is created and open order details")
    public void orderIsCreatedAndOpenOrderDetails() throws IOException {
        p6_checkoutPage = new P6_CheckoutPage();
        p6_checkoutPage.openOrderDetails();
    }
}
