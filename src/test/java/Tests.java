import org.testng.annotations.Test;
        import pages.MainPage;

public class Tests extends BaseTest {




    @Test
    public void checkAllFilds () throws InterruptedException {
        MainPage mainPage = new MainPage();
        mainPage.clickAccountButton().clickRegisterLink().isLastNamePrecent();

        Thread.sleep(3000);
    }
}
