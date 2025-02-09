package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pojo.User;

public class RegistrationPage extends BasePage {

    //Локатор для заголовка Регистрация
    @FindBy(how = How.XPATH, using = ".//h2[text()='Регистрация']")
    private SelenideElement headerRegistration;

    //Локатор для вода Имени
    @FindBy(how = How.XPATH, using = ".//fieldset[1]//input")
    private SelenideElement inputName;

    //Локатор для поля ввода Email
    @FindBy(how = How.XPATH, using = ".//fieldset[2]//input")
    private SelenideElement inputEmail;

    //Локатор для поля ввода Пароль
    @FindBy(how = How.XPATH, using = ".//fieldset[3]//input")
    private SelenideElement inputPassword;

    //Локатор для кнопки Зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//button[text()='Зарегистрироваться']")
    private SelenideElement buttonRegistration;

    //Локатор для ссылки Войти
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement linkEnter;




    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Регистрация пользователя")
    public void registrationUser(User user) {
        inputName.sendKeys(user.getName());
        inputEmail.sendKeys(user.getEmail());
        inputPassword.sendKeys(user.getPassword());
        buttonRegistration.click();
    }

    @Step("Нажатие ссылки Вход на странице регистрации пользователя")
    public void clickEnterLink() {
        linkEnter.click();
    }
}
