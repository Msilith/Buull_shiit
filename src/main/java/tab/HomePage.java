package tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    // локатор для кнопки «Заказать» в хедере
    private By orderTopButton = By.xpath("//div[contains(@class,'Header')]//button[text()='Заказать']");
    // локатор для кнопки «Заказать» в конце
    private By orderMiddleButton = By.xpath("//div[contains(@class,'Home_FinishButton')]//button[text()='Заказать']");
    // локатор для кнопки «Закрыть» куки в футере
    private By closeCookie = By.xpath(".//button[text()='да все привыкли']");
    // локаторы для кнопок «Вопросы о важном»
    private By accordionButton1 = By.xpath("//*[@id='accordion__heading-0']");
    private By accordionButton2 = By.xpath("//*[@id='accordion__heading-1']");
    private By accordionButton3 = By.xpath("//*[@id='accordion__heading-2']");
    private By accordionButton4 = By.xpath("//*[@id='accordion__heading-3']");
    private By accordionButton5 = By.xpath("//*[@id='accordion__heading-4']");
    private By accordionButton6 = By.xpath("//*[@id='accordion__heading-5']");
    private By accordionButton7 = By.xpath("//*[@id='accordion__heading-6']");
    private By accordionButton8 = By.xpath("//*[@id='accordion__heading-7']");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }


    public void clickOrderTopButton(){
        driver.findElement(orderTopButton).click();
    }

    public void openAccordionButton1(){
        driver.findElement(accordionButton1).click();
    }
    public void openAccordionButton2(){
        driver.findElement(accordionButton2).click();
    }
    public void openAccordionButton3(){
        driver.findElement(accordionButton3).click();
    }
    public void openAccordionButton4(){
        driver.findElement(accordionButton4).click();
    }
    public void openAccordionButton5(){
        driver.findElement(accordionButton5).click();
    }
    public void openAccordionButton6(){
        driver.findElement(accordionButton6).click();
    }
    public void openAccordionButton7(){
        driver.findElement(accordionButton7).click();
    }
    public void openAccordionButton8(){
        driver.findElement(accordionButton8).click();
    }
    public void clickOrderMiddleButton(){
        driver.findElement(orderMiddleButton).click();
    }
    public void clickCloseCookie(){
        driver.findElement(closeCookie).click();
    }

    private By textOfAccordionButton1 = By.id("accordion__panel-0");

    private By textOfAccordionButton2 = By.id("accordion__panel-1");

    private By textOfAccordionButton3 = By.id("accordion__panel-2");

    private By textOfAccordionButton4 = By.id("accordion__panel-3");

    private By textOfAccordionButton5 = By.id("accordion__panel-4");

    private By textOfAccordionButton6 = By.id("accordion__panel-5");

    private By textOfAccordionButton7 = By.id("accordion__panel-6");

    private By textOfAccordionButton8 = By.id("accordion__panel-7");

    public void visabilityOfAccordionButton1(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton1));
    }

    public void visabilityOfAccordionButton2(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton2));
    }

    public void visabilityOfAccordionButton3(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton3));
    }

    public void visabilityOfAccordionButton4(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton4));
    }

    public void visabilityOfAccordionButton5(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton5));
    }

    public void visabilityOfAccordionButton6(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton6));
    }

    public void visabilityOfAccordionButton7(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton7));
    }

    public void visabilityOfAccordionButton8(){
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(textOfAccordionButton8));
    }
}

