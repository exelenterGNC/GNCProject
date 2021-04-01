package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import pages.BrandPage;
import pages.ProductOrderPage;
import utils.DriverWrapper;

import java.util.List;

public class VerificationSteps {
    private WebDriver driver;
    ProductOrderPage productOrderPage;
    BrandPage brandPage;

    public VerificationSteps(DriverWrapper driver) {
        this.driver =  driver.getDriver();
        productOrderPage = new ProductOrderPage(this.driver);
        brandPage=new BrandPage(this.driver);
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

    @Then("Verify the count of images equals to {int}")
    public void verifyTheCountOfImagesEqualsTo(int num) {
        List<WebElement> listOfImages = brandPage.ListOfImages;
       Assert.assertEquals(listOfImages.size(),num);

    }

    @And("Verify the images are in SVG format")
    public void verifyTheImagesAreInSVGFormat() {
        List<WebElement> listOfImages = brandPage.ListOfImages;
        for (int i = 0; i < listOfImages.size(); i++) {
            String imageLink = listOfImages.get(i).getAttribute("src");
            System.out.println(imageLink);
            Assert.assertTrue(imageLink.contains(".svg"));
        }
    }

    @And("Verify images have the link")
    public void verifyImagesHaveTheLink() {
        List<WebElement> listOfImages = brandPage.ListOfLinks;
        for (int i = 0; i < listOfImages.size(); i++) {
            String href = listOfImages.get(i).getAttribute("href");
            System.out.println(href);
            Assert.assertTrue(href.contains("https://"));
        }
    }
}
