package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class P5_HomePage extends TestBase {
    public P5_HomePage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchTxt;

    @FindBy(xpath = "//*[contains(@class , 'search-box-button')]")
    WebElement searchBtn;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement productName;

    @FindBy(id = "customerCurrency")
    WebElement currencyDropDown;

    @FindBy(linkText = "Apparel")
    WebElement mainCategory;

    @FindBy(linkText = "Shoes")
    WebElement subCategory;

    @FindBy(id = "attribute-option-14")
    WebElement color;


    public void sendData() {
        searchTxt.sendKeys("Apple");
        searchBtn.click();
    }

    public void checkProductDisplayed() {
        boolean display = productName.isDisplayed();
        System.out.println("-----apple product name is displayed in search result as :  " + display + "-----");
    }

    public void changeCurrency() {
        Select dropDown = new Select(currencyDropDown);
        dropDown.selectByIndex(1);
        System.out.println("-----currency is changed to euro-----");
    }

    public void selectCategory() throws InterruptedException {
        action.moveToElement(mainCategory).perform();
        Thread.sleep(2000);
        subCategory.click();
        System.out.println("-----subCategory(shoes) is selected-----");
    }

    public void filterWithColor() {
        color.click();
        System.out.println("-----grey color is selected-----");
    }
}
