package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
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



    @And("Hover over in {string}")
    public void hoverOverIn(String page, DataTable dataTable ) {

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
