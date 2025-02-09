package pages;

import api.UserHttp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pojo.User;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {
    private User user;
    private UserHttp userHttp;
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        user = new User("Ivaaan", "fafa@mail.ru", "123456");
        WebDriverManager.chromedriver().driverVersion("131.0.6778.70").setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        if (user.getName() != null) {
            userHttp.loginUser(user);
            userHttp.deleteUser(user);
        }
    }

    @Test
    public void registrationUser() {
        driver.get("https://stellarburgers.nomoreparties.site/");  //Открываем главную страницу
        MainPage mainPage = new MainPage(driver);
        mainPage.clickEnterInAccountButton(); // нажимаем кнопки "Войти в аккаунт"

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickRegistrationLink();  // нажимаем ссылку "Зарегистрироваться"

        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.registrationUser(user); // заполняем поля и нажимаем "Зарегистрироваться"

        mainPage.checkTextOnCreateOrderButton(); //проверяем, что на главной странице отображается кнопки с текстом "Оформить заказ"
    }
}