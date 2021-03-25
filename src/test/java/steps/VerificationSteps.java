package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.BasePage;
import pages.ProductOrderPage;
import utils.BaseClass;

public class VerificationSteps extends BaseClass {
    ProductOrderPage productOrderPage=new ProductOrderPage();

    @Then("User verifies the product has been added to the cart")
    public void userVerifiesTheProductHasBeenAddedToTheCart() {

        String[] itemID = productOrderPage.ItemID.getText().split("#");
        productOrderPage.cartIcon.click();
//        productOrderPage.waitUntilVisible(productOrderPage.ItemIDInTheCart);
        String itemIDInTheCart = productOrderPage.ItemIDInTheCart.getText();
        Assert.assertEquals(itemID[1],itemIDInTheCart);

    }


    @Then("User verifies the URL is {string}")
    public void userVerifiesTheURLIs(String URL) {
        BasePage basepage = new BasePage();
                basepage.verifyURL(URL);

    }
}