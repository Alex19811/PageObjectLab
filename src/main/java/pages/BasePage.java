package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;


    public static void setDriver(WebDriver webDriver) {
        driver=webDriver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
