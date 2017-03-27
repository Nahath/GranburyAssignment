package Controls;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

// This is the popup that randomly appears sometimes (but not always) after making a search.
public class EmailPopup {

    // WebElements
    public static WebElement ClosePopup(WebDriver driver)
    {
        return driver.findElement(By.xpath("//div[@id='fancybox-wrap']//a[@id='fancybox-close']"));
    }

    //Checks
    public static boolean PopupPresent(WebDriver driver)
    {
        try {
            WebElement TransactionRejectedPopup = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("fancybox-wrap")));
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
