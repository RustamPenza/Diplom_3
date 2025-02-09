package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RecoveryPasswordPage extends BasePage {

    //Локатор для заголовка Восстановление пароля
    @FindBy(how = How.XPATH, using = ".//h2[text()='Восстановление пароля']")
    private SelenideElement buttonRecovery;


    public RecoveryPasswordPage(WebDriver driver) {
        super(driver);
    }
}
