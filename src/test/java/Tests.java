import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage;

public class Tests extends BaseTest {


    @Test
    public void checkAllFilds() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccountButton().clickRegisterLink().clickBackButtonInput();

        Thread.sleep(3000);

        RegisterPage registerPage = new RegisterPage();
        Assert.assertTrue(registerPage.isUserNamePresent());
        Assert.assertTrue(registerPage.isLastNamePresent());
        Assert.assertTrue(registerPage.isAddessMailAddPresent());
        Assert.assertTrue(registerPage.isPassworPresent());
        Assert.assertTrue(registerPage.isConfirmPasswordPresent());

    }


    @Test
    public void clickBackButton() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccountButton().clickRegisterLink().clickBackButtonInput();
        Thread.sleep(5000);

        RegisterPage registerPage = new RegisterPage();
        Assert.assertEquals(registerPage.isNewSelerTextLogin(),"LOGIN OR CREATE AN ACCOUNT");


//    Assert.assertTrue(registerPage.isLoginMailPresent());
    }


    @Test
    public void clickRegisterButton() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccountButton().clickRegisterLink().ClickRegisterButton();

        RegisterPage registerPage = new RegisterPage();
        Assert.assertEquals(registerPage.AdviceRequiredEntryFirstname(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRequiredEntryLastname(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRequiredEntryEmailAddress(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRequiredEntryPasswordAddress(), "This is a required field.");
        Assert.assertEquals(registerPage.AdviceRrequiredEntryConfirmation(), "This is a required field.");


    }
    @Test
    public  void sendKeys()throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccountButton().clickRegisterLink();

        RegisterPage registerPage = new RegisterPage();
        registerPage.SendKeys();
    }
}