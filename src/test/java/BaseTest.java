import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import primitives.BaseElement;

public class BaseTest {

    @BeforeMethod
    public void webDriverManager () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        BaseElement.setDriver(driver);
    }
    @AfterMethod
            public void closeDriver(){
        BaseElement.getDriver().close();
    }

}