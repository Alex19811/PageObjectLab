import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;
import pages.RegisterPage;


public class TestClass1 extends BasePage {


    @Test
    public void checkAllFilds() throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccountButton().clickRegisterLink();

        Thread.sleep(3000);

        RegisterPage registerPage = new RegisterPage();
        Assert.assertTrue(registerPage.isUserNamePresent());
        Assert.assertTrue(registerPage.isLastNamePresent());
        Assert.assertTrue(registerPage.isAddessMailAddPresent());
        Assert.assertTrue(registerPage.isPassworPresent());
        Assert.assertTrue(registerPage.isConfirmPasswordPresent());
    }
}
