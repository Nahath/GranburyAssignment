package Pages;

import Utilities.SeleniumShortcuts;
import Utilities.TestUser;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

// This is the page that comes up when a guest user is checking out. It asks them to fill out address details before moving to the actual checkout page
public class AddressEntry {

    //WebElements
    public static WebElement BillingCountry(WebDriver driver) {
        return driver.findElement(By.id("form_bill_country"));
    }

    public static WebElement BillingFirstname(WebDriver driver) {
        return driver.findElement(By.id("form_bill_name_first"));
    }

    public static WebElement BillingLastName(WebDriver driver) {
        return driver.findElement(By.id("form_bill_name_last"));
    }

    public static WebElement BillingAddress(WebDriver driver) {
        return driver.findElement(By.id("form_bill_street_0"));
    }

    public static WebElement BillingCity(WebDriver driver) {
        return driver.findElement(By.id("form_bill_city"));
    }

    public static WebElement BillingState(WebDriver driver) {
        return driver.findElement(By.id("form_bill_state"));
    }

    public static WebElement BillingZipCode(WebDriver driver) {
        return driver.findElement(By.id("form_bill_zip"));
    }

    public static WebElement BillingTelephone(WebDriver driver) {
        return driver.findElement(By.id("form_bill_phone"));
    }

    public static WebElement BillingEmail(WebDriver driver) {
        return driver.findElement(By.id("form_billing_email"));
    }

    public static WebElement ShippingSameAsBillingCheck(WebDriver driver) {
        return driver.findElement(By.id("copy_billing"));
    }

    public static WebElement GoToCheckoutButton(WebDriver driver) {
        return driver.findElement(By.xpath("//div[@id='content']//button[contains(@class, 'address-continue')]"));
    }

    //Actions
    public static void EnterUsersAddress(WebDriver driver, TestUser user) {
        SeleniumShortcuts.SelectDropdownItemByValue(BillingCountry(driver), user.getCountry());
        BillingFirstname(driver).sendKeys(user.getFirstName());
        BillingLastName(driver).sendKeys(user.getLastName());
        BillingAddress(driver).sendKeys(user.getStreetAddress());
        BillingCity(driver).sendKeys(user.getCity());
        SeleniumShortcuts.SelectDropdownItemByValue(BillingState(driver), user.getState());
        BillingZipCode(driver).sendKeys(user.getZipCode());
        BillingTelephone(driver).sendKeys(user.getPhone());
        BillingEmail(driver).sendKeys(user.getEmail());
    }
}
