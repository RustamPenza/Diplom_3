package browser;

public class BrowserFactory {
    private String nameBrowser; //для ввода можно значения: yandex и chrome

    public BrowserFactory(String nameBrowser) {
        if (nameBrowser.equals("yandex")) {
            System.out.println("Для выполнения тестов выбран Yandex browser");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/webdriver/yandexdriver.exe");
        } else if (nameBrowser.equals("chrome")) {
            System.out.println("Для выполнения тестов выбран Google Chrome browser");
        }
    }

}
