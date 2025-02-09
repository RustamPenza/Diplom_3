package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePage {

    // локатор поля кнопки Конструктор
    @FindBy(how = How.XPATH,using = ".//p[text()='Конструктор']]")
    protected SelenideElement buttonConstructor;

    // локатор для кнопки Личный кабинет
    @FindBy(how = How.XPATH,using = ".//p[text()='Личный кабинет']")
    protected SelenideElement buttonPersonalAccount;

    // локатор для логотипа сайта
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    protected SelenideElement buttonLogo;

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConstructorButton() {
        buttonConstructor.click();
    }

    public void clickPersonalAccountButton() {
        buttonPersonalAccount.click();
    }

    public void clickLogoButton() {
        buttonLogo.click();
    }
}
