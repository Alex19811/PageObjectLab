package pages;


import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BasePage {
    public RegisterPage() {
        Assert.assertTrue(driver.findElement(userNameInput).isDisplayed());
    }

    private By userNameInput = By.id("firstname");
    private By lastNameInput = By.id("lastname");
    private By emailAddressInput = By.id("email_address");
    private By passworInput = By.id("password");
    private By confirmPasswordInput = By.id("confirmation");

    public boolean isUserNamePrecent(){

        return driver.findElement(userNameInput).isDisplayed();

    }
    public boolean isUserNamePrecent(){

        return driver.findElement(userNameInput).isDisplayed();

    }
