import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tab.*;

import static junit.framework.TestCase.assertEquals;

public class CheckOrderScooter
{
    ChromeOptions options = new ChromeOptions();

    WebDriver driver = new ChromeDriver(options);
    HomePage homePage = new HomePage(driver);
    String url = "https://qa-scooter.praktikum-services.ru/";
    OrderPage orderPage = new OrderPage(driver);

    @Before
    public void testPreparing()
    {
        driver.get(url);
        homePage.clickCloseCookie();
        new WebDriverWait(driver,3);
    }

    @Test
    public void checkOrderScooterTopButton()
    {
        homePage.clickOrderTopButton();
        orderPage.InputName("Вася");
        orderPage.InputSurName("Пупкин");
        orderPage.inputAddress("Москва, Колотушкина 16");
        orderPage.inputTelephone("+79999999998");
        orderPage.inputMetro();
        driver.findElement(By.xpath(".//button[@value='58']")).click();
        orderPage.clickNextButton();
        orderPage.inputComment("Позвоните в скорую");
        orderPage.clickColor();
        orderPage.clickPeriod();
        orderPage.inputDate("21.04.2023");
        orderPage.clickOrder();
        orderPage.clickYes();

        String answer =   driver.findElement(By.className("Order_ModalHeader__3FDaJ")).getText();
        assertEquals("Заказ оформлен", answer);
    }

    @Test
    public void checkOrderScooterMiddleButton()
    {
        homePage.clickOrderMiddleButton();
        orderPage.InputName("Артем");
        orderPage.InputSurName("Лебидеф");
        orderPage.inputAddress("Студия палок и овса");
        orderPage.inputTelephone("+79422223222");
        orderPage.inputMetro();
        driver.findElement(By.xpath(".//button[@value='58']")).click();
        orderPage.clickNextButton();
        orderPage.inputComment("J999!@#%^*()_';{}}][ ");
        orderPage.clickColor();
        orderPage.clickPeriod();
        orderPage.inputDate("23.04.1874");
        orderPage.clickOrder();
        orderPage.clickYes();

        String answer =   driver.findElement(By.className("Order_ModalHeader__3FDaJ")).getText();

        assertEquals("Заказ оформлен", answer);
    }

    @After
    public void teardown() {
        driver.quit();
    }
}