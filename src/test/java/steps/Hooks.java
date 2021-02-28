package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks {

    // With hook class I am telling to program to start and to finish

    WebDriver driver;

    @Before
    public void start(){
        driver = BaseClass.setUp();
        driver.get(readProperties("gnc.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @After
    public void quit(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

//        BaseClass.tearDown();
    }

    private String readProperties(String key) {
        Properties prop = new Properties();
        String propValue = "";
        URL resourcePath = Hooks.class.getClassLoader().getResource("config.properties");
        System.out.println("resourcePath = " + resourcePath);

        try(InputStream input = new FileInputStream(resourcePath.getPath())){
            prop.load(input);
            propValue =  prop.getProperty(key);
        }catch(IOException ex){
        }
        return propValue;
    }
}
