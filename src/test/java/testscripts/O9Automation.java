package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Config.ConfigReader;

import helpers.BrowserFactory;

public class O9Automation {

    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    @Parameters({"browserName", "platformName"}) //
    public void setUp(@Optional("chrome")String browserName, @Optional("windows")String platformName) {
        // ✅ call BrowserFactory
        driver = BrowserFactory.openBrowser(browserName, platformName);
    }

    @Test(description = "Verify Facebook login page", priority = 1, enabled = true, groups ={"smoke"})
    public void testFacebook1() {
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        driver.findElement(By.id("email"))
                .sendKeys(ConfigReader.getProperty("phoneNumber"));

        driver.findElement(By.id("pass"))
                .sendKeys(ConfigReader.getProperty("name"));

        driver.findElement(By.name("login")).click();


    }


    @Test(description = "Verify Facebook login by enter number and name", priority = 2, enabled = true)
    public void testFacebook2() {
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        driver.findElement(By.id("email"))
                .sendKeys(ConfigReader.getProperty("phoneNumber"));




    }

    @Test(description = "Verify Facebook login by enter number and name", priority = 3, enabled = true)
    public void testFacebook3() {
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        driver.findElement(By.id("email"))
                .sendKeys(ConfigReader.getProperty("phoneNumber"));

        driver.findElement(By.id("pass"))
                .sendKeys(ConfigReader.getProperty("name"));




    }



    @AfterTest(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
