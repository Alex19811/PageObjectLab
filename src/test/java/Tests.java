import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

class main page(){
    private By login buth= By.xpath ("");
       }
public main page (){
    assert )title="main");

        }
        public loginPage goto loginPage();
driver.find Elem (loginButh).clic();
return new loginPage


//public class LoginPage {
//    By usernameLocator = By.id("username");
//    By passwordLocator = By.id("passwd");
//    By loginButtonLocator = By.id("login");
//
//    private final WebDriver driver;
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//
//        if (!"Login".equals(driver.getTitle())) {
//            throw new IllegalStateException("This is not the login page");
//        }
//    }
//
//    public LoginPage typeUsername(String username) {
//        driver.findElement(usernameLocator).sendKeys(username);
//        return this;
//    }
//
//    public LoginPage typePassword(String password) {
//        driver.findElement(passwordLocator).sendKeys(password);
//        return this;
//    }
//
//    public HomePage submitLogin() {
//        driver.findElement(loginButtonLocator).submit();
//        return new HomePage(driver);
//    }
//
//    public LoginPage submitLoginExpectingFailure() {
//        driver.findElement(loginButtonLocator).submit();
//        return new LoginPage(driver);
//    }
//
//    public HomePage loginAs(String username, String password) {
//        typeUsername(username);
//        typePassword(password);
//        return submitLogin();
//    }
//}