package utils;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.Page;
import pages.ProductOrderPage;
import pages.SubCategoryPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class BaseClass {

    // in this class I am able to create different browser for the parallel testing

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> browserName = new ThreadLocal<>();
    private static List<Page> list = new ArrayList<>(); // here I am creating a list of class objects using interface Page


    // With setUp method I am creating a Web-driver
    public static WebDriver setUp(){
        if(threadDriver.get()==null){
            setWebDriver(DriverFactory.createInstance(browserName.get()));
            initPageList();
        }
        return threadDriver.get();
    }
    public static void setWebDriver(WebDriver driver){
        threadDriver.set(driver);
    }


    // By tearDown method I am Quiting the driver
    public static void tearDown() {

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }

    public static Page getPage(String pageName){
        // in this method, I am getting the Page according to the String parameter out of List<Pages>
        Predicate<Page> predicate = obj -> obj.getClass().toString().toUpperCase(Locale.ROOT).contains(pageName.toUpperCase(Locale.ROOT));
        Page page = list.stream().filter(predicate).findFirst().orElse(null);

        if (page == null) {
            throw new RuntimeException("Page not found " + pageName);
        }
        return page;
    }


    private static void initPageList(){
        list.add(new MainPage());
        list.add(new SubCategoryPage());
        list.add(new ProductOrderPage());
    }


}
