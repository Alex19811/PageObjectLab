package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BasePage {
    public MainPage() {
        Assert.assertEquals(driver.findElement(newSelerText).getText(), "NEW PRODUCTS");

    }

    private By newSelerText = By.xpath("//h2[@class='subtitle']");
    private By accountButton = By.xpath("//div[@class='skip-links']//a//span[text()='Account']");
    private By registerLink = By.linkText("Register");

    public MainPage clickAccountButton() {
        driver.findElement(accountButton).click();
        return this;
    }
    public RegisterPage clickRegisterLink () {
        driver.findElement(registerLink).click();
        return new RegisterPage();


    }
}
