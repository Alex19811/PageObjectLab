package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterPage extends BasePage {
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

    public RegisterPage() {
        Assert.assertTrue(getDriver().findElement(userNameInput).isDisplayed());
    }
     public boolean isUserNamePresent() {
        return getDriver().findElement(userNameInput).isDisplayed();
    }

    public boolean isLastNamePresent() {
        return getDriver().findElement(lastNameInput).isDisplayed();
    }

    public boolean isAddessMailAddPresent() {
        return getDriver().findElement(addressMailAddInput).isDisplayed();
    }

    public boolean isPassworPresent() {
        return getDriver().findElement(passwordInput).isDisplayed();
    }

    public boolean isConfirmPasswordPresent() {
        return getDriver().findElement(confirmPasswordInput).isDisplayed();
    }


    //2
    public LoginPage clickBackButtonInput() {
        getDriver().findElement(backButtonInput).click();
        return new LoginPage();
    }

    public String isNewSelerTextLogin() {
        return getDriver().findElement(newSelerTextLogin).getText();
    }


    //3
    public RegisterPage ClickRegisterButton() {

        getDriver().findElement(clickRegisrerButtonInput).click();
        return this;
    }

    public String AdviceRequiredEntryFirstname() {
        return getDriver().findElement(adviceRequiredEntryFirstname).getText();

    }

    public String AdviceRequiredEntryLastname() {
        return getDriver().findElement(adviceКRequiredEntryLastname).getText();
    }

    public String AdviceRequiredEntryEmailAddress() {
        return getDriver().findElement(adviceRequiredEentryEemailAddress).getText();
    }

    public String AdviceRequiredEntryPasswordAddress() {
        return getDriver().findElement(adviceRequiredEentryPasswordAddress).getText();
    }

    public String AdviceRrequiredEntryConfirmation() {
        return getDriver().findElement(adviceRequiredEntryConfirmation).getText();
    }


    public void SendKeys() {
        WebElement elementUserName = getDriver().findElement(userNameInput);
        elementUserName.sendKeys("Aleksandr");

        WebElement elementLastName = getDriver().findElement(lastNameInput);
        elementLastName.sendKeys("Burlutskyi");

        WebElement elementAddressmailAdd = getDriver().findElement(addressMailAddInput);
        elementAddressmailAdd.sendKeys("Aleksandrburlutskiy@gmail.com");

        WebElement elementPassword = getDriver().findElement(passwordInput);
        elementPassword.sendKeys("Aleks123456");

        WebElement elementConfirmPassword = getDriver().findElement(confirmPasswordInput);
        elementConfirmPassword.sendKeys("Aleks123456");

        WebElement elementSingUpForNewsletterInput = getDriver().findElement(singUpForNewsletterInput);
        elementSingUpForNewsletterInput.click();
    }

    public RegisterPage clickRegisterInput() {
        getDriver().findElement(registerInputt).click();
        return new RegisterPage();

    }
}





