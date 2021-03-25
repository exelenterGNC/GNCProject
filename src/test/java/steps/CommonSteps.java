package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import utils.BaseClass;

import java.util.List;

public class CommonSteps extends BaseClass {

    // Here I will create the steps which are common for the feature files.
    @And("Hover over in {string}")
    public void hoverOverIn(String page, DataTable dataTable ) {

        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

        getPage(page).hoverOverTheElement(AllElementsInTheList.get(i));

        }

    }

    @And("User clicks in {string}")
    public void userClicksIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            getPage(page).findElementAndClickFunction(AllElementsInTheList.get(i));

        }
    }

    @And("User selects random element from dropdown in {string}")
    public void userSelectsRandomElementFromDropdownIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {
            getPage(page).selectFromDropDown(AllElementsInTheList.get(i));

        }
    }

    @And("User scrolls down in {string}")
    public void userScrollsDownIn(String page, DataTable dataTable ) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);

        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            getPage(page).scrollToElement(AllElementsInTheList.get(i));

        }
    }

    @And("User randomly click on products in {string}")
    public void userRandomlyClickOnProductsIn(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);
        for (int i = 0; i < AllElementsInTheList.size(); i++) {
            getPage(page).randomClickOnElementInsideListOfWebElement(AllElementsInTheList.get(i));
        }

    }

    @And("User select randomly size or flavor in {string}")
    public void userSelectRandomlySizeFlavorIn(String page, DataTable dataTable) {
        List<String> AllElementsInTheList = dataTable.asList(String.class);
        for (int i = 0; i < AllElementsInTheList.size(); i++) {

            getPage(page).handleDropDownBeforeAddToCart(AllElementsInTheList.get(i));
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
            getPage(page).findElementAndSendKeyFunction(AllElementsInTheList.get(i).get(0), AllElementsInTheList.get(i).get(1));
        }

    }

    @And("User handles the alert for {string} seconds")
    public void userHandlesTheAlertForSeconds(String seconds) {
        BasePage basepage = new BasePage();
        basepage.handleAllert(seconds);
    }

}
