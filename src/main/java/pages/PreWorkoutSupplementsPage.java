package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class PreWorkoutSupplementsPage extends BasePage implements Page {
    private HashMap<String, WebElement> map = new HashMap<>();
    public PreWorkoutSupplementsPage(WebDriver webdriver) {
        super(webdriver);
        PageFactory.initElements(driver, this);
        initMap();
    }

    @FindBy(xpath = "//span[contains(text(),'UNBREAKABLE PERFORMANCE')]")
    private WebElement unbreakablePerformanceProduct;
//    @FindBy(xpath = "//a[@data-cgid='pre-workout-supplements-2']")
//    private WebElement preWorkoutSupplementsLink;


    @Override
    public void initMap() {
        map.put("unbreakablePerformanceProduct", unbreakablePerformanceProduct);
    }

    @Override
    public void findElementAndClickFunction(String element) {
        clickFunction(getWebElement(map,element));
    }

    @Override
    public void findElementAndSendKeyFunction(String element, String text) {
        sendKeysFunction(getWebElement(map, element), text);
    }

    @Override
    public void selectFromDropDown(String element) {

    }

    @Override
    public void hoverOverTheElement(String element) {
        moveToElementAndClick(getWebElement(map, element));

    }

    @Override
    public void initListMap() {

    }

    @Override
    public void scrollToElement(String element) {

    }

    @Override
    public void randomClickOnElementInsideListOfWebElement(String ListOfWebElement) {

    }

    @Override
    public void handleDropDownBeforeAddToCart(String ListOfWebElement) {

    }
}
