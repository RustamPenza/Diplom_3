package pages;

import api.URL;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ConstructorTest {

//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/yandexdriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        /* Поэтому лучше передавать путь через переменную maven
//         * mvn clean test -DyandexDriverPath=src/main/resources/webdriver/yandexdriver.exe
//         * mvn clean test -DyandexDriverPath=C:\Users\User\AppData\Local\Yandex\YandexBrowser\Application\browser.exe*/
//        options.setBinary(System.getProperty("yandexDriverPath"));
//    }

    @After
    public void tearDown() throws Exception {
        getWebDriver().quit();
    }


    @Test
    @DisplayName("Проверка перехода к разделу Булки")
    public void selectSectionBuns() throws InterruptedException {
        MainPage mainPage = open(URL.BASE_URL, MainPage.class); //открываем главную страницу
        mainPage.clickSectionSauces(); // Сначала выбираем раздел Соусы, что бы булки были скрыты
        mainPage.clickSectionBuns(); // Выбираем раздел Булки и проверяем, что в таблице появляется заголовок Булки
        Assert.assertEquals("Булки", mainPage.getNameSelectedSection());//Проверяем название выбранного раздела
    }

    @Test
    @DisplayName("Проверка перехода к разделу Соусы")
    public void selectSectionSauces() throws InterruptedException {
        MainPage mainPage = open(URL.BASE_URL, MainPage.class); //открываем главную страницу
        mainPage.clickSectionSauces(); // Выбираем раздел Соусы
        Assert.assertEquals("Соусы", mainPage.getNameSelectedSection());  //Проверяем название выбранного раздела
    }

    @Test
    @DisplayName("Проверка перехода к разделу Начинки")
    public void selectSectionToppings() throws InterruptedException {
        MainPage mainPage = open(URL.BASE_URL, MainPage.class); //открываем главную страницу
        mainPage.clickSectionToppings(); // Выбираем раздел Начинки
        Assert.assertEquals("Начинки", mainPage.getNameSelectedSection()); //Проверяем название выбранного раздела
    }

}
