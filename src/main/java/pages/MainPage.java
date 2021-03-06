package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class MainPage extends BasePage implements Page {

    private HashMap<String, WebElement> map = new HashMap<>();
    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        initMap();
    }

    @FindBy(xpath = "//li[@class='lvl1-department']")
    private WebElement DepartmentsButton;

    @FindBy(css = "[title='User: Account']")
    private WebElement AccountButton;

    @FindBy(css = "[title='User: Welcome, test!']")
    private WebElement AccountUserButton;

    @FindBy(xpath = "//li[@class='lvl1-brands']")
    private WebElement BrandsButton;



    @Override
    public void initMap() {

        map.put("DepartmentsButton", DepartmentsButton);
        map.put("AccountButton", AccountButton);
        map.put("AccountUserButton", AccountUserButton );
        map.put("BrandsButton", BrandsButton);
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
