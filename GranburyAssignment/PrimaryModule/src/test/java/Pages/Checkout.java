package Pages;

import Utilities.TestUser;
import org.openqa.selenium.*;

// This is the checkout page where payment details are provided.
public class Checkout {

    //WebElements
    public static WebElement CreditCardNumber(WebDriver driver)
    {
        return driver.findElement(By.id("form_pay_number"));
    }
    public static WebElement CreditCardExpirationMonth(WebDriver driver)
    {
        return driver.findElement(By.id("form_pay_expiration_month"));
    }
    public static WebElement CreditCardExpirationYear(WebDriver driver)
    {
        return driver.findElement(By.id("form_pay_expiration_year"));
    }
    public static WebElement CreditCardCvc(WebDriver driver)
    {
        return driver.findElement(By.id("form_pay_validation_new"));
    }
    public static WebElement PlaceOrderButton(WebDriver driver)
    {
        return driver.findElement(By.xpath("//div[@id='container_place_cc_order']//a[contains(@class,'confirm_payment')]"));
    }

    //Actions
    public static void EnterUserCreditCardInfo(WebDriver driver, TestUser user)
    {
        CreditCardNumber(driver).clear();
        CreditCardNumber(driver).sendKeys(user.getCreditCardNumber());
        CreditCardCvc(driver).clear();
        CreditCardCvc(driver).sendKeys(user.getCreditCardCvc());
        CreditCardExpirationMonth(driver).sendKeys(Integer.toString(user.getCreditCardExpirationMonth()));
        CreditCardExpirationYear(driver).sendKeys(Integer.toString(user.getCreditCardExpirationYear()));
    }
}
