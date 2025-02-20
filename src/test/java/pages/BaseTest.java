package pages;

import org.junit.Before;

public class BaseTest {

    @Before
    public void browserSetup() {

        /*
        Теперь запустить тесты в яндекс браузере можно командой mvn clean test -Dbrowser=yandex
        Без команды -Dbrowser=yandex тесты будут прогоняться в хроме
         */

        String browser = System.getProperty("browser", "chrome").toLowerCase();

        if ("yandex".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/yandexdriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/chromedriver.exe");
        }


    }
}
