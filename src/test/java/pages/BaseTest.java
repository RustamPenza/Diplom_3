package pages;


import org.junit.Before;

public class BaseTest {

    @Before
    public void browserSetup() {
        /*
        Класс создан для возможности выполнять прогон тестов в яндекс браузере.
        Для данного выбора необходимо раскомментировать нижнюю строку
         */
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/yandexdriver.exe");
    }

}
