package utils;

import org.openqa.selenium.WebDriver;
import pages.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class BaseClass {

    private WebDriver webdriver;

    private List<Page> list = new ArrayList<>();

    public BaseClass(WebDriver driver) {
        this.webdriver = driver;
        initPageList();

    }

    public Page getPage(String pageName){
        // in this method, I am getting the Page according to the String parameter out of List<Pages>
        Predicate<Page> predicate = obj -> obj.getClass().toString().toUpperCase(Locale.ROOT).contains(pageName.toUpperCase(Locale.ROOT));
        Page page = list.stream().filter(predicate).findFirst().orElse(null);

        if (page == null) {
            throw new RuntimeException("Page not found " + pageName);
        }
        return page;
    }

    public void initPageList(){
        list.add(new MainPage(webdriver));
        list.add(new SubCategoryPage(webdriver));
        list.add(new ProductOrderPage(webdriver));
        list.add(new LoginPage(webdriver));
        list.add(new BrandPage(webdriver));
        list.add(new PreWorkoutSupplementsPage(webdriver));
    }


}
