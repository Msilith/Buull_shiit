import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tab.*;

import static junit.framework.TestCase.assertEquals;


public class CheckFAQ {
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    HomePage homePage = new HomePage(driver);
    String url = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void testPreparing(){
        driver.get(url);
        homePage.clickCloseCookie();

        new WebDriverWait(driver,3);
    }

    @Test
    public void checkAccordionButton1() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton1();
        homePage.visabilityOfAccordionButton1();
        String actual = driver.findElement(By.id("accordion__panel-0")).getText();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actual);
    }
    @Test
    public void checkAccordionButton2() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton2();
        homePage.visabilityOfAccordionButton2();
        String actual =  driver.findElement(By.id("accordion__panel-1")).getText();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actual);
    }
    @Test
    public void checkAccordionButton3() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton3();
        homePage.visabilityOfAccordionButton3();
        String actual =  driver.findElement(By.id("accordion__panel-2")).getText();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actual);
    }
    @Test
    public void checkAccordionButton4() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton4();
        homePage.visabilityOfAccordionButton4();
        String actual =  driver.findElement(By.id("accordion__panel-3")).getText();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actual);
    }
    @Test
    public void checkAccordionButton5() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton5();
        homePage.visabilityOfAccordionButton5();
        String actual =  driver.findElement(By.id("accordion__panel-4")).getText();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actual);
    }
    @Test
    public void checkAccordionButton6() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton6();
        homePage.visabilityOfAccordionButton6();
        String actual =  driver.findElement(By.id("accordion__panel-5")).getText();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actual);
    }
    @Test
    public void checkAccordionButton7() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton7();
        homePage.visabilityOfAccordionButton7();
        String actual =  driver.findElement(By.id("accordion__panel-6")).getText();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actual);
    }
    @Test
    public void checkAccordionButton8() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        homePage.openAccordionButton8();
        homePage.visabilityOfAccordionButton8();
        String actual = driver.findElement(By.id("accordion__panel-7")).getText();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", actual);
    }


    @After
    public void quit() {
        driver.quit();
    }
}

