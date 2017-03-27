package Pages;

import Utilities.SeleniumShortcuts;
import org.openqa.selenium.*;

// Page for the user's shopping cart
public class ShoppingCart {

//WebElements
    public static WebElement QuantityFieldByItem(WebDriver driver, String productName)
    {
        return driver.findElement(By.xpath("//table[@id='cart-table']/tbody/tr[td/strong/a/text()='" + productName +
                "']/td/input[contains(@name,'qty')]"));
    }

    public static WebElement SkuPickerByItem(WebDriver driver, String productName)
    {
        return driver.findElement(By.xpath("//table[@id='cart-table']/tbody/tr[td/strong/a/text()='" + productName +
                "']/td/select[contains(@name,'sku')]"));
    }

    public static WebElement ContinueToCheckout(WebDriver driver)
    {
        return driver.findElement(By.xpath("//div[@class='cart-nav clearfix']/a[@href='https://www.thinkgeek.com/brain/checkout/address.cgi']"));
    }

    public static WebElement UpdateCart(WebDriver driver)
    {
        return driver.findElement(By.xpath("//tr[@class='cart-table-footer']//input[@value='Update Cart']"));
    }

}
