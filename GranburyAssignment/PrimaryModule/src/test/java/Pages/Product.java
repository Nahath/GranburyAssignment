package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

// This is the page that gives details on an individual product
public class Product {

    //WebElements
    public static WebElement SkuSelector(WebDriver driver)
    {
        return driver.findElement(By.id("sku"));
    }

    public static WebElement QuantitySelector(WebDriver driver)
    {
        return driver.findElement(By.id("quantity"));
    }

    public static WebElement BuyButton(WebDriver driver)
    {
        return driver.findElement(By.id("submitcart"));
    }


    //Actions
    public static void SelectSkuByValue(WebDriver driver, String value)
    {
        Select select = new Select(SkuSelector(driver));
        select.selectByValue(value);
    }

    public static void AddItemToCard(WebDriver driver, String skuValue, int quantity)
    {
        SelectSkuByValue(driver, skuValue);
        QuantitySelector(driver).clear();
        QuantitySelector(driver).sendKeys(Integer.toString(quantity));
        BuyButton(driver).click();
    }
}
