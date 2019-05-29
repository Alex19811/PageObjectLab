import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage;

public class Tests extends BaseTest {

    MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void xmsinUnit() {

        mainPage = new MainPage();
    }

//    @BeforeMethod(alwaysRun = true)
//    public void msinUnit() {
//
//        mainPage = new MainPage();
//
//    }

    @Test
    public void checkAllFilds() throws InterruptedException {
        mainPage.clickAccountButton().clickRegisterLink();

        Thread.sleep(3000);

        RegisterPage registerPage = new RegisterPage();
        Assert.assertTrue(registerPage.isUserNamePresent());
        Assert.assertTrue(registerPage.isLastNamePresent());
        Assert.assertTrue(registerPage.isAddessMailAddPresent());
        Assert.assertTrue(registerPage.isPassworPresent());
        Assert.assertTrue(registerPage.isConfirmPasswordPresent());
        // SoftAssert.
    }


    @Test
    public void clickBackButton() throws InterruptedException {
        mainPage.clickAccountButton().clickRegisterLink().clickBackButtonInput();
        Thread.sleep(5000);

        RegisterPage registerPage = new RegisterPage();
        Assert.assertEquals(registerPage.isNewSelerTextLogin(), "LOGIN OR CREATE AN ACCOUNT");


//    Assert.assertTrue(registerPage.isLoginMailPresent());
    }


    @Test
    public void clickRegisterButton() throws InterruptedException {
        mainPage.clickAccountButton().clickRegisterLink().ClickRegisterButton();

        RegisterPage registerPage = new RegisterPage();
        Assert.assertEquals(registerPage.AdviceRequiredEntryFirstname(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRequiredEntryLastname(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRequiredEntryEmailAddress(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRequiredEntryPasswordAddress(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRrequiredEntryConfirmation(), "This is a required field.");
        //SoftAssert.assertTrue(registerPage.AdviceRequiredEntryFirstname(),"not present");

    }

    @Test
    public void sendKeys() throws InterruptedException {
        mainPage.clickAccountButton().clickRegisterLink();

        RegisterPage registerPage = new RegisterPage();
        registerPage.SendKeys();
    }
}
