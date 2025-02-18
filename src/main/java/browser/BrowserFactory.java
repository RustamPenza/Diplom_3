package browser;

public class BrowserFactory {

    private final String wayToDriver = "src/main/resources/webdriver/%sdriver.exe"; //путь до драйвера

    public void setBrowser(String nameDriver) {
        if (nameDriver.equals("yandex") || nameDriver.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", String.format(wayToDriver, nameDriver));
        } else {
            System.out.println("Введите корректное имя драйвера: yandex или chrome");
        }

    }

}
