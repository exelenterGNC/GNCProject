package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class BrandPage extends BasePage implements Page{

    private HashMap<String, WebElement> map = new HashMap<>();
    private HashMap<String,List<WebElement>> listMap=new HashMap<>();

    public BrandPage(WebDriver webdriver) {
        super(webdriver);
        PageFactory.initElements(driver, this);
        initMap();
        initListMap();
    }


    @FindBy(xpath = "//div[@class=\"featured-wrap\"]//a/img")
    public List<WebElement> ListOfImages;

    @FindBy(xpath = "//div[@class=\"featured-wrap\"]//a")
    public List<WebElement> ListOfLinks;

    @FindBy(xpath= "//a[text()='View All Brands']")
    private WebElement ViewAllBrandsButton;


    @Override
    public void findElementAndClickFunction(String element) {
     clickFunction(getWebElement(map,element));
    }

    @Override
    public void findElementAndSendKeyFunction(String element, String text) {

    }

    @Override
    public void selectFromDropDown(String element) {

    }

    @Override
    public void hoverOverTheElement(String element) {

    }

    @Override
    public void initMap() {

        map.put("ViewAllBrandsButton",ViewAllBrandsButton);
    }

    @Override
    public void initListMap() {

        listMap.put("ListOfImages",ListOfImages);
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
