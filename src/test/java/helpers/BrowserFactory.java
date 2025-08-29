package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {

    public static WebDriver openBrowser(String browserName, String platformName) {
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome") && platformName.equalsIgnoreCase("windows")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Lenovo\\Documents\\Chrome\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Running in Chrome on Windows");
        }

        if (browserName.equalsIgnoreCase("edge") && platformName.equalsIgnoreCase("windows")) {
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\Lenovo\\Documents\\Edge\\msedgedriver.exe");
            driver = new EdgeDriver();
            System.out.println("Running in Edge on Windows");
        }

        if (driver == null) {
            throw new IllegalArgumentException("Unsupported browser/platform combination");
        }

        return driver;
    }
}
