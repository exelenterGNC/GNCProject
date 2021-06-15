package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class SubCategoryPage extends BasePage implements Page {

    private HashMap<String, WebElement> map = new HashMap<>();
    private HashMap<String, List<WebElement>> listmap = new HashMap<>();
    public SubCategoryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        initMap();
        initListMap();
    }

    @FindBy (xpath = "//li[@class='lvl2-best-sellers']")
    private WebElement Bestsellers;

    @FindBy (id = "grid-sort-header")
    private WebElement SortBySelector;

    @FindBy (id ="grid-paging-header")
    private WebElement ItemsPerPageSelector;

    @FindBy (id = "email-alert-signup-https")
    private WebElement ElementToScrollDown;

    @FindBy (xpath = "//div[@class='product-name']")
    private List<WebElement> ProductNameContainer;


    @Override
    public void initMap() {
        map.put("Bestsellers", Bestsellers);
        map.put("SortBySelector", SortBySelector);
        map.put("ItemsPerPageSelector", ItemsPerPageSelector);
        map.put("ElementToScrollDown", ElementToScrollDown);

    }


    public void initListMap() {
        listmap.put("ProductNameContainer", ProductNameContainer);
    }

    @Override
    public void scrollToElement(String element) {
        scrollToElement(getWebElement(map, element));
    }

    @Override
    public void randomClickOnElementInsideListOfWebElement(String ListOfWebElement) {
        clickOnRandomElementInTheList(getListOfWebElement(listmap, ListOfWebElement));
    }

    @Override
    public void findElementAndClickFunction(String element) {
        clickFunction(getWebElement(map, element ));
    }

    @Override
    public void findElementAndSendKeyFunction(String element, String text) {

    }

    @Override
    public void selectFromDropDown(String element) {

    selectDropDown(getWebElement(map, element ));

    }

    @Override
    public void hoverOverTheElement(String element) {
    }

    @Override
    public void handleDropDownBeforeAddToCart(String ListOfWebElement) {

    }
}
