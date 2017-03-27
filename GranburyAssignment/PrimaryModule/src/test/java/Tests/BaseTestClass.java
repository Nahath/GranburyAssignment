package Tests;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

// All test classes should inherit from this one. Standard setup and takedown methods will go here.
public abstract class BaseTestClass {

    protected static WebDriver driver;

    // In a full test application, I would have a configuration file that allows you to set things up to test with any browser.
    // In this assignment, I'm just shortcutting and hard-coding a chrome driver.
    @BeforeClass
    public static void setupTests() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        // old cookies from previous tests can mess with page behavior.
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
