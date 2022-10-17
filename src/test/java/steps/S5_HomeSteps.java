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

    @And("user can hover on main category and select sub category")
    public void userCanHoverOnMainCategoryAndSelectSubCategory() throws IOException, InterruptedException {
        p5_homePage = new P5_HomePage();
        p5_homePage.selectCategory();
    }

    @And("user can select color to filter products")
    public void userCanSelectColorToFilterProducts() throws IOException {
        p5_homePage = new P5_HomePage();
        p5_homePage.filterWithColor();
    }

    @And("user can select digital tag")
    public void userCanSelectDigitalTag() throws IOException {
        p5_homePage = new P5_HomePage();
        p5_homePage.selectDigitalTag();
    }

    @And("user can open product and add it to cart")
    public void userCanOpenProductAndAddItToCart() throws IOException, InterruptedException {
        p5_homePage = new P5_HomePage();
        p5_homePage.addProductToCart();
    }

    @And("user can open product and add it to wishList")
    public void userCanOpenProductAndAddItToWishList() throws IOException, InterruptedException {
        p5_homePage = new P5_HomePage();
        p5_homePage.addProductToWishList();
    }

    @And("user can open product and add it to compareList")
    public void userCanOpenProductAndAddItToCompareList() throws IOException, InterruptedException {
        p5_homePage = new P5_HomePage();
        p5_homePage.addProductToCompareList();
    }
}
