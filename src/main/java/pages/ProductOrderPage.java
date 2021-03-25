package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class ProductOrderPage extends BasePage implements Page{
    private HashMap<String, WebElement> map = new HashMap<>();
    private HashMap<String, List<WebElement>> listmap = new HashMap<>();

    public ProductOrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        initMap();
        initListMap();
    }

    @FindBy(xpath = "//select[@class=\"form-control variation-select\"]")
    private List<WebElement> flaworDropdown;

    @FindBy (id = "Quantity")
    private WebElement Quantity;

    @FindBy (id = "add-to-cart")
    private WebElement AddToCartButton;

    @FindBy (xpath = "//div[@class=\"pdp__top-bar__item-code d-none-md d-block\"]")
    public WebElement ItemID;

    @FindBy (xpath = "//div[@class=\"mini-cart-total\"]")
    public WebElement cartIcon;

    @FindBy (xpath = "//div[@class=\"sku\"]/span[@class=\"value\"]")
    public WebElement ItemIDInTheCart;

    @Override
    public void findElementAndClickFunction(String element) {
        clickFunction(getWebElement(map, element));
    }

    @Override
    public void findElementAndSendKeyFunction(String element, String text) {
    }

    @Override
    public void selectFromDropDown(String element) {
    selectDropDown(getWebElement(map, element));
    }

    @Override
    public void hoverOverTheElement(String element) {

    }

    @Override
    public void initMap() {
        map.put("Quantity", Quantity);
        map.put("AddToCartButton", AddToCartButton);

    }

    @Override
    public void initListMap() {
        listmap.put("flaworDropdown", flaworDropdown);
    }

    @Override
    public void scrollToElement(String element) {

    }

    @Override
    public void randomClickOnElementInsideListOfWebElement(String ListOfWebElement) {

    }

    @Override
    public void handleDropDownBeforeAddToCart(String ListOfWebElement) {
        handleDropDownBeforeAddToCart(getListOfWebElement(listmap, ListOfWebElement));
    }
}
