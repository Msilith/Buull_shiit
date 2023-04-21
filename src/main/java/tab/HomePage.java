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
    private By FAQ1 = By.xpath("//*[@id='accordion__heading-0']");
    private By FAQ2 = By.xpath("//*[@id='accordion__heading-1']");
    private By FAQ3 = By.xpath("//*[@id='accordion__heading-2']");
    private By FAQ4 = By.xpath("//*[@id='accordion__heading-3']");
    private By FAQ5 = By.xpath("//*[@id='accordion__heading-4']");
    private By FAQ6 = By.xpath("//*[@id='accordion__heading-5']");
    private By FAQ7 = By.xpath("//*[@id='accordion__heading-6']");
    private By FAQ8 = By.xpath("//*[@id='accordion__heading-7']");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderTopButton(){
        driver.findElement(orderTopButton).click();
    }

    public void openFAQ1(){
        driver.findElement(FAQ1).click();
    }
    public void openFAQ2(){
        driver.findElement(FAQ2).click();
    }
    public void openFAQ3(){
        driver.findElement(FAQ3).click();
    }
    public void openFAQ4(){
        driver.findElement(FAQ4).click();
    }
    public void openFAQ5(){
        driver.findElement(FAQ5).click();
    }
    public void openFAQ6(){
        driver.findElement(FAQ6).click();
    }
    public void openFAQ7(){
        driver.findElement(FAQ7).click();
    }
    public void openFAQ8(){
        driver.findElement(FAQ8).click();
    }

    public void clickOrderMiddleButton(){
        driver.findElement(orderMiddleButton).click();
    }

    public void clickCloseCookie(){
        driver.findElement(closeCookie).click();
    }
}