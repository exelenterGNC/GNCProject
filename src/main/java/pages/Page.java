package pages;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Page {

    // In this page I will declare all methods to be used in POM pages

    void findElementAndClickFunction(String element);

    void findElementAndSendKeyFunction(String element, String text);

    void selectFromDropDown(String element);

    void hoverOverTheElement(String element);

    public void initMap();

    public void initListMap();

    public void scrollToElement(String element);

    public void randomClickOnElementInsideListOfWebElement(String ListOfWebElement);

    public void handleDropDownBeforeAddToCart(String ListOfWebElement);

}
