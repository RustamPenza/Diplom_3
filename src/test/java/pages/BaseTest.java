package pages;


import browser.BrowserFactory;
import org.junit.Before;

public class BaseTest {

    @Before
    public void browserSetup() {
        /*
        для выбора класса укажите значение yandex или chrome
         */
        new BrowserFactory("yandex");

    }

}
