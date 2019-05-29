package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.logging.LogType.DRIVER;

public class BasePage {
    //protected static WebDriver driver;
    private final static ThreadLocal <WebDriver>DRIVER=new ThreadLocal<>();



   public static WebDriver getDriver() {

        return DRIVER.get();
    }

    public static void setDriver(WebDriver webDriver) {
        DRIVER.set(webDriver);
    }


    public static void closeDriver() {
        if (getDriver() != null)
            getDriver().close();
    }
}
