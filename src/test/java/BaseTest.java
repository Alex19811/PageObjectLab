import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeMethod
    public void webDriverManager () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        BasePage.setDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("http://magento.mainacad.com/");
    }
    @AfterMethod
            public void closeDriver(){
        BasePage.getDriver().close();
    }

}