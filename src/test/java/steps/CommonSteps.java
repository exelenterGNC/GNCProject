package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import utils.DriverWrapper;
import utils.BaseClass;

import java.util.List;

public class CommonSteps {
    private WebDriver driver;
    private BaseClass baseClass;
    public CommonSteps(DriverWrapper driver) {
        this.driver = driver.getDriver();
        baseClass = new BaseClass(this.driver);
    }


    //This should be inside MainPage
    @Given("user is on {string} and clicks on")
    public void user_is_on_and_clicks_on(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            baseClass.getPage(page).hoverOverTheElement(AllElementsInTheList.get(i));

        }

    }

    //This should be inside PreWorkoutSupplementsPage
    @Given("user selects a product from the list in {string}")
    public void user_selects_a_product_from_the_list_in(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            baseClass.getPage(page).findElementAndClickFunction(AllElementsInTheList.get(i));

        }
    }

    // Scroll to WebElement method
    protected void scrollToElement(WebElement elementToScroll){
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("arguments[0].scrollIntoView();", elementToScroll);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
    }

    //Hover over and click method
    protected void moveToElementAndClick(WebElement element){
        Actions actions = new Actions(driver);
        scrollToElement(element);
        actions.moveToElement(element).click().perform();
    }

    @Given("user hovers on the {string} over the")
    public void user_hovers_on_the_over_the(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            baseClass.getPage(page).hoverOverTheElement(AllElementsInTheList.get(i));

        }

    }

    @And("Hover over in {string}")
    public void hoverOver(String page, DataTable dataTable ) {

        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

        baseClass.getPage(page).hoverOverTheElement(AllElementsInTheList.get(i));

        }

    }

    @And("User clicks in {string}")
    public void userClicksIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            baseClass.getPage(page).findElementAndClickFunction(AllElementsInTheList.get(i));

        }
    }

    @And("User selects random element from dropdown in {string}")
    public void userSelectsRandomElementFromDropdownIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {
            baseClass.getPage(page).selectFromDropDown(AllElementsInTheList.get(i));

        }
    }

    @And("User scrolls down in {string}")
    public void userScrollsDownIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            baseClass.getPage(page).scrollToElement(AllElementsInTheList.get(i));

        }
    }

    @And("User randomly click on products in {string}")
    public void userRandomlyClickOnProductsIn(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);
        for (int i = 0; i < AllElementsInTheList.size(); i++) {
            baseClass.getPage(page).randomClickOnElementInsideListOfWebElement(AllElementsInTheList.get(i));
        }

    }

    @And("User select randomly size or flavor in {string}")
    public void userSelectRandomlySizeFlavorIn(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);
        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            baseClass.getPage(page).handleDropDownBeforeAddToCart(AllElementsInTheList.get(i));
        }
    }

    @And("User waits for {string} seconds")
    public void userWaitsForSeconds(String seconds) {
    int time = Integer.parseInt(seconds)*1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("User sends text in {string}")
    public void userSendsTextIn(String page, DataTable dataTable) {
        List<List<String>> AllElementsInTheList = dataTable.asLists(String.class);
        for (int i = 0; i < AllElementsInTheList.size(); i++) {
            baseClass.getPage(page).findElementAndSendKeyFunction(AllElementsInTheList.get(i).get(0), AllElementsInTheList.get(i).get(1));
        }

    }

    @And("User handles the alert for {string} seconds")
    public void userHandlesTheAlertForSeconds(String seconds) {
        BasePage basepage = new BasePage(driver);
        basepage.handleAllert(seconds);
    }

}
