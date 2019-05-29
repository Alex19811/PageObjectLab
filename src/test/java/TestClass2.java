import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

public class TestClass2 extends BaseTest {

        @Test
        public void clickBackButton() throws InterruptedException {
            MainPage mainPage = new MainPage();
            mainPage.clickAccountButton().clickRegisterLink().clickBackButtonInput();
            Thread.sleep(5000);

            RegisterPage registerPage = new RegisterPage();
            Assert.assertEquals(registerPage.isNewSelerTextLogin(), "LOGIN OR CREATE AN ACCOUNT");
        }
    }
