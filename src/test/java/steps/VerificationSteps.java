package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.BasePage;
import pages.ProductOrderPage;
import utils.DriverWrapper;

public class VerificationSteps {
    private WebDriver driver;
    ProductOrderPage productOrderPage;

    public VerificationSteps(DriverWrapper driver) {
        this.driver =  driver.getDriver();
        productOrderPage = new ProductOrderPage(this.driver);
    }



    @Then("User verifies the product has been added to the cart")
    public void userVerifiesTheProductHasBeenAddedToTheCart() {

        String[] itemID = productOrderPage.ItemID.getText().split("#");
        productOrderPage.cartIcon.click();
        String itemIDInTheCart = productOrderPage.ItemIDInTheCart.getText();
        Assert.assertEquals(itemID[1],itemIDInTheCart);

    }


    @Then("User verifies the URL is {string}")
    public void userVerifiesTheURLIs(String URL) {
        BasePage basepage = new BasePage(driver);
                basepage.verifyURL(URL);

    }
}
