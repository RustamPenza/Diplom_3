package pages;


import browser.BrowserFactory;
import org.junit.Before;

public class BaseTest {
    private BrowserFactory browser = new BrowserFactory();

    @Before
    public void browserSetup() {
        /*
        для выбора класса укажите значение yandex или chrome
         */
        browser.setBrowser("chrome");

    }

}
