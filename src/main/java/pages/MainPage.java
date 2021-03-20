package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class MainPage extends BasePage implements Page {

    private HashMap<String, WebElement> map = new HashMap<>();
    public MainPage() {
        PageFactory.initElements(driver, this);
        initMap();
    }

    @FindBy(xpath = "//li[@class='lvl1-department']")
    private WebElement DepartmentsButton;

    @Override
    public void initMap() {
        map.put("DepartmentsButton", DepartmentsButton);
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
    public void findElementAndClickFunction(String element) {

    }

    @Override
    public void findElementAndSendKeyFunction(String element, String text) {

    }

    @Override
    public void selectFromDropDown(String element) {

    }

    @Override
    public void hoverOverTheElement(String element) {
            moveToElementAndClick(getWebElement(map, element));
    }

    @Override
    public void handleDropDownBeforeAddToCart(String ListOfWebElement) {

    }


}
