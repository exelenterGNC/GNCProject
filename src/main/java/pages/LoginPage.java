package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class LoginPage extends BasePage implements Page {

    private HashMap<String, WebElement> map = new HashMap<>();

    public LoginPage() {
        PageFactory.initElements(driver, this);
        initMap();
    }

    @FindBy(id = "sso_link")
    private WebElement LoginSignUpButton;

    @FindBy(id = "username-input")
    private WebElement EmailAddressInput;

    @FindBy(css = "[type = 'password']")
    private WebElement PasswordInput;

    @FindBy(xpath = "//button[@class=\"slds-button slds-button_neutral button-primary\"]")
    private WebElement LoginButton;

    @FindBy(css = "[title='Go to: Account']")
    private WebElement AccountButton;

    @FindBy(className = "change-password")
    private WebElement ChangePasswordButton;

    @FindBy(id = "dwfrm_resetpassword_password")
    private WebElement NewPasswordInput;

    @FindBy(id = "dwfrm_resetpassword_passwordconfirm")
    private WebElement ConfirmNewPasswordInput;

    @FindBy(xpath = "//*[@id=\"NewPasswordForm\"]/fieldset/div[3]/button")
    private WebElement CreatePasswordButton;


    @Override
    public void initMap() {
        map.put("LoginSignUpButton",LoginSignUpButton);
        map.put("EmailAddressInput",EmailAddressInput);
        map.put("PasswordInput",PasswordInput);
        map.put("LoginButton",LoginButton);
        map.put("AccountButton", AccountButton);
        map.put("ChangePasswordButton",ChangePasswordButton);
        map.put("NewPasswordInput",NewPasswordInput);
        map.put("ConfirmNewPasswordInput",ConfirmNewPasswordInput);
        map.put("CreatePasswordButton",CreatePasswordButton);

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

    }

    @Override
    public void handleDropDownBeforeAddToCart(String ListOfWebElement) {

    }


}
