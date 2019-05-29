package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BasePage {

    private By newSelerText = By.xpath("//h2[@class='subtitle']");
    private By accountButton = By.xpath("//div[@class='skip-links']//a//span[text()='Account']");
    private By registerLink = By.linkText("Register");

    public MainPage() {
        Assert.assertEquals(getDriver().findElement(newSelerText).getText(), "NEW PRODUCTS");
    }

    public MainPage clickAccountButton() {
            getDriver().findElement(accountButton).click();
            return this;
    }
    public RegisterPage clickRegisterLink () {
        getDriver().findElement(registerLink).click();
        return new RegisterPage();

    }
}
