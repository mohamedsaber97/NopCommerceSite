package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class P6_CheckoutPage extends TestBase {
    public P6_CheckoutPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@class , 'cart-label')]")
    WebElement openCart;

    @FindBy(id = "termsofservice")
    WebElement terms;

    @FindBy(id = "checkout")
    WebElement checkout;

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryDropDown;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateDropDown;

    @FindBy(id = "BillingNewAddress_City")
    WebElement cityTxt;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1Txt;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeTxt;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneTxt;

    @FindBy(name = "save")
    WebElement saveData;

    @FindBy(xpath = "//*[contains(@class , 'shipping-method')]")
    WebElement shippingMethodSave;

    @FindBy(xpath = "//*[contains(@class , 'payment-method')]")
    WebElement paymentMethodSave;

    @FindBy(xpath = "//*[contains(@class , 'payment-info')]")
    WebElement paymentInfoSave;

    @FindBy(xpath = "//*[contains(@class , 'confirm-order')]")
    WebElement confirmOrder;

    @FindBy(xpath = "//*[contains(@class , 'order-completed')]")
    WebElement orderCompleted;
    @FindBy(linkText = "Click here for order details.")
    WebElement orderDetails;


    public void openCart() {
        openCart.click();
        System.out.println("-----cart is opened-----");
    }

    public void clickOnCheckout() {
        terms.click();
        checkout.click();
        System.out.println("-----terms have accepted and checkout is clicked-----");
    }

    public void fillAndSaveBillingData() throws InterruptedException {
        Select country = new Select(countryDropDown);
        country.selectByIndex(1);
        Thread.sleep(2000);
        Select state = new Select(stateDropDown);
        state.selectByIndex(1);
        cityTxt.sendKeys("mansoura");
        address1Txt.sendKeys("talk address 1");
        postalCodeTxt.sendKeys("5681");
        phoneTxt.sendKeys("0100000000");
        saveData.click();
        System.out.println("-----billing data is filled and saved-----");
    }

    public void confirmAllOrderSteps() {
        shippingMethodSave.click();
        paymentMethodSave.click();
        paymentInfoSave.click();
        confirmOrder.click();
        orderCompleted.click();
        System.out.println("-----new order is completed and created-----");
    }

    public void openOrderDetails() {
        orderDetails.click();
        System.out.println("-----order details is opened-----");
    }

}
