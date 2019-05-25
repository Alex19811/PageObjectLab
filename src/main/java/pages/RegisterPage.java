package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPage<userNameInput> extends BasePage {
    public RegisterPage() {
        Assert.assertTrue(driver.findElement(userNameInput).isDisplayed());

    }

    private By userNameInput = By.id("firstname");
    private By lastNameInput = By.id("lastname");
    private By addressMailAddInput = By.id("email_address");
    private By passwordInput = By.id("password");
    private By confirmPasswordInput = By.id("confirmation");



    private By backButtonInput = By.xpath("//html[@id='top']//form[@id='form-validate']//a[@href='http://magento.mainacad.com/english/customer/account/login/']");

    private By newSelerTextLogin = By.xpath("//html[@id='top']/body/div[@class='wrapper']/div[@class='page']//h1[.='                Login or Create an Account            ']");

    private By clickRegisrerButtonInput = By.xpath("//html[@id='top']//form[@id='form-validate']//button/span/span[.='Register']");

    private By adviceRequiredEntryFirstname = By.id("advice-required-entry-firstname");
    private By adviceКRequiredEntryLastname = By.id("advice-required-entry-lastname");
    private By adviceRequiredEentryEemailAddress = By.id("advice-required-entry-email_address");
    private By adviceRequiredEentryPasswordAddress = By.id("advice-required-entry-password");
    private By adviceRequiredEntryConfirmation = By.id("advice-required-entry-confirmation");


    private By singUpForNewsletterInput = By.id("is_subscribed");

    private By registerInputt = By.xpath("//html[@id='top']//form[@id='form-validate']//button/span/span[.='Register']");


    public boolean isUserNamePresent() {
        return driver.findElement(userNameInput).isDisplayed();
    }

    public boolean isLastNamePresent() {
        return driver.findElement(lastNameInput).isDisplayed();
    }

    public boolean isAddessMailAddPresent() {
        return driver.findElement(addressMailAddInput).isDisplayed();
    }

    public boolean isPassworPresent() {
        return driver.findElement(passwordInput).isDisplayed();
    }

    public boolean isConfirmPasswordPresent() {
        return driver.findElement(confirmPasswordInput).isDisplayed();
    }


    //2
    public LoginPage clickBackButtonInput() {
        driver.findElement(backButtonInput).click();
        return new LoginPage();
    }

    public String isNewSelerTextLogin() {
        return driver.findElement(newSelerTextLogin).getText();
    }


    //3
    public RegisterPage ClickRegisterButton() {

        driver.findElement(clickRegisrerButtonInput).click();
        return this;
    }

    public String AdviceRequiredEntryFirstname() {
        return driver.findElement(adviceRequiredEntryFirstname).getText();

    }

    public String AdviceRequiredEntryLastname() {
        return driver.findElement(adviceКRequiredEntryLastname).getText();
    }

    public String AdviceRequiredEntryEmailAddress() {
        return driver.findElement(adviceRequiredEentryEemailAddress).getText();
    }

    public String AdviceRequiredEntryPasswordAddress() {
        return driver.findElement(adviceRequiredEentryPasswordAddress).getText();
    }

    public String AdviceRrequiredEntryConfirmation() {
        return driver.findElement(adviceRequiredEntryConfirmation).getText();
    }


    public void SendKeys() {
        WebElement elementUserName = driver.findElement(userNameInput);
        elementUserName.sendKeys("Aleksandr");

        WebElement elementLastName = driver.findElement(lastNameInput);
        elementLastName.sendKeys("Burlutskyi");

        WebElement elementAddressmailAdd = driver.findElement(addressMailAddInput);
        elementAddressmailAdd.sendKeys("Aleksandrburlutskiy@gmail.com");

        WebElement elementPassword = driver.findElement(passwordInput);
        elementPassword.sendKeys("Aleks123456");

        WebElement elementConfirmPassword = driver.findElement(confirmPasswordInput);
        elementConfirmPassword.sendKeys("Aleks123456");

        WebElement elementSingUpForNewsletterInput = driver.findElement(singUpForNewsletterInput);
        elementSingUpForNewsletterInput.click();
    }

    public RegisterPage clickRegisterInput() {
        driver.findElement(registerInputt).click();
        return new RegisterPage();

    }
}

//    public RegisterPage singUpForNewsletterInput() {
//        driver.findElement(singUpForNewsletterInput).click();
//        return this;
//
//    }
//    public void sendKeys() {
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
//    }



