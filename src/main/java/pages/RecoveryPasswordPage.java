package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;

public class RecoveryPasswordPage extends BasePage {

    //Локатор для заголовка Восстановление пароля
    @FindBy(how = How.XPATH, using = ".//h2[text()='Восстановление пароля']")
    private SelenideElement headerRecovery;

    //Локатор для поля ввода Email
    @FindBy(how = How.XPATH, using = ".//fieldset[1]//input")
    private SelenideElement inputEmail;

    //Локатор для кнопки Восстановить
    @FindBy(how = How.XPATH, using = ".//button[text()='Восстановить']")
    private SelenideElement buttonRecovery;

    //Локатор для ссылки Войти
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    private SelenideElement linkEnter;

    @Step("Нажатие ссылки Войти на странице восстановления пароля")
    public void clickEnterLink() {
        linkEnter.shouldBe(visible);
        linkEnter.click();
    }


}
