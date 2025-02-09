package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;

public class MainPage extends BasePage {

    //Локатор для кнопки войти
    @FindBy(how = How.XPATH, using = ".//button[text()='Войти в аккаунт']")
    private SelenideElement buttonEnterInAccount;

    //Локатор для раздела Булки
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    private SelenideElement sectionBuns;

    //Локатор для раздела Соусы
    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    private SelenideElement sectionSauces;

    //Локатор для раздела Начинки
    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    private SelenideElement sectionToppings;

    //Локатор заголовка Соберите бургер
    @FindBy(how = How.XPATH, using = ".//h1[text()='Соберите бургер']")
    private SelenideElement headerConstructBurger;

    //Локатор для кнопки Оформить заказ
    @FindBy(how = How.XPATH, using = ".//button[text()='Оформить заказ']")
    private SelenideElement buttonCreateOrder;




    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие кнопки \"Войти в аккаунт\" на главной странице")
    public void clickEnterInAccountButton() {
        buttonEnterInAccount.click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.checkHeader();
    }

    @Step("Проверка, что после авторизации на кнопке отображается текст \"Оформить заказ\"")
    public void checkTextOnCreateOrderButton() {
        buttonCreateOrder.shouldBe(exactText("Оформить заказ"));
    }


}
