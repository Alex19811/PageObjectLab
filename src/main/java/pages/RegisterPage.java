package pages;


import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BasePage {
    public RegisterPage() {
        Assert.assertTrue(driver.findElement(userNameInput).isDisplayed());
    }

    private By userNameInput = By.id("firstname");
    private By lastNameInput = By.id("lastname");
    private By addressMailAddInput = By.id("email_address");
    private By passwordInput = By.id("password");
    private By confirmPasswordInput = By.id("confirmation");

    private By singUpForNewsletterInput = By.id("is_subscribed");
    private By backButtonInput = By.id("top");

    public boolean isUserNamePrecent() {
        return driver.findElement(userNameInput).isDisplayed();
    }

    public boolean isLastNamePrecent() {
        return driver.findElement(lastNameInput).isDisplayed();

    }

    public boolean isAddessMailAddPrecent() {
        return driver.findElement(addressMailAddInput).isDisplayed();

    }

    public boolean isPassworPrecent() {
        return driver.findElement(passwordInput).isDisplayed();

    }

    public boolean isConfirmPasswordPrecent() {
        return driver.findElement(confirmPasswordInput).isDisplayed();
    }

    public MainPage isbackButtonInput() {
        driver.findElement(backButtonInput).click();
        return new MainPage ();
    }


    }

//    public void main(String[] args) {
//        WebElement elementUserName = driver.findElement(userNameInput);
//        elementUserName.sendKeys("Alekcandr");
//
//        WebElement elementLastName = driver.findElement(lastNameInput);
//        elementLastName.sendKeys("Burlutskyi");
//
//        WebElement elementAddressmailAdd = driver.findElement(addressMailAddInput);
//        elementAddressmailAdd.sendKeys("Aleksandrburlutskiy@gmail.com");
//
//        WebElement elementPassword = driver.findElement(passwordInput);
//        elementPassword.sendKeys("Aleks123456");
//
//        WebElement elementConfirmPassword = driver.findElement(confirmPasswordInput);
//        elementConfirmPassword.sendKeys("Aleks123456");
//
//        WebElement elementSingUpForNewsletterInput = driver.findElement(singUpForNewsletterInput);
//        elementSingUpForNewsletterInput.click();
//
//
//    }
//
//    public RegisterPage singUpForNewsletterInput() {
//        driver.findElement(singUpForNewsletterInput).click();
//        return this;
//
//    }
//}
