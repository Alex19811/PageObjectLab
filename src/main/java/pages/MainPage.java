package pages;

import org.openqa.selenium.By;

public class MainPage {
    //Открываем тестовую страницу
        driver.get("http://magento.mainacad.com/");
}

    private static By MainPage = By.cssSelector("http://magento.mainacad.com/";
    private static By RegistrationPage = By.cssSelector(".skip-account";
//[title='Register']
    private static By LoginPage = By.cssSelector("//html[@id='top']//div[@id='header-account']//a[@title='Log In']";
    private static By MyDashboardPage = By.cssSelector("//html[@id='top']//div[@id='header-account']//a[@title='Log In']";

//    AbstractPage
//          MainPage
//          RegistrationPage
//          LoginPage
//          MyDashboardPage


//TODO: Выбрать континент из выпадающего списка
         WebElement elementSpisok = driver.findElement(ElementSpisok);
         Select sel = new Select(elementSpisok);
         sel.selectByVisibleText("Register")