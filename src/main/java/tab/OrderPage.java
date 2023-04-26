package tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    // Поле "Имя"
    private By inputName = By.xpath(".//input[@placeholder='* Имя']");
    // Поле "Фамилия"
    private By inputSurName = By.xpath(".//input[@placeholder='* Фамилия']");
    // Поле "Адрес"
    private By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Поле "Станция метро"
    private By inputMetro = By.className("select-search__input");
    // Поле "Телефон"
    private By inputTelephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Кнопка "Далее"
    private By nextButton = By.xpath("//div[contains(@class,'Order_NextButton')]//button[text()='Далее']");
    // Поле "Когда привезти самокат"
    private By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Локатор поля "Срок аренды"
    private final By rentalPeriod = By.className("Dropdown-placeholder");
    //Локатор элемента выпадающего списка поля "Срок аренды"
    private final By rentalPeriodChoice = By.xpath(".//div[@class = 'Dropdown-menu']/div[@class = 'Dropdown-option']");
    // Селектор выбора цвета
    private By selectColor = By.className("Checkbox_Input__14A2w");
    // Поле "Комментарий для курьера"
    private By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Кнопка "Заказать"
    private By orderButton = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Заказать']");
    // Кнопка "Да"
    private By yesButton = By.xpath("//div[contains(@class,'Order_Overlay__3KW-T')]//button[text()='Да']");




    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void InputName(String name){
        driver.findElement(inputName).sendKeys(name);
    }
    public void InputSurName(String surName){
        driver.findElement(inputSurName).sendKeys(surName);
    }
    public void inputAddress(String address){
        driver.findElement(inputAddress).sendKeys(address);
    }
    public void inputMetro(){
        driver.findElement(inputMetro).sendKeys("Площадь революции");
    }
    public void inputTelephone(String telephone){
        driver.findElement(inputTelephone).sendKeys(telephone);
    }
    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }
    public void inputComment(String commentary){
        driver.findElement(inputComment).sendKeys(commentary);
    }
    public void clickColor(){
        driver.findElement(selectColor).click();
    }
    public void clickYes(){
        driver.findElement(yesButton).click();
    }
    public void clickPeriod()
    {
        driver.findElement(rentalPeriod).click();

        driver.findElement(rentalPeriodChoice).click();
    }
    public void clickOrder()
    {
        driver.findElement(orderButton).click();
    }
    public void inputDate(String date)
    {
        driver.findElement(inputDate).sendKeys(date);
    }
}
