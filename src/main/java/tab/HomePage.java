package tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}