package primitives;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseElement {
    protected static WebDriver driver;
    protected By selector;
    protected String description;

    private static WebElement highlitedElem;

    public BaseElement(By selector, String description){
        this.selector=selector;
        this.description=description;
    }

    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-form/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver(){
        return  driver;
    }

    public static void setDriver(WebDriver driver) {
    }

    public WebElement get() throws InterruptedException {
        Thread.sleep(2000);
        WebElement elem=driver.findElement(selector);
        highlightElement(elem);
        return elem;
    }


    private static void highlightElement(WebElement element) throws InterruptedException {
        unhighlightElement();
        highlitedElem=element;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
    }

    private static void unhighlightElement() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", highlitedElem, "");
        } catch (Exception e) {
        }
    }
}
