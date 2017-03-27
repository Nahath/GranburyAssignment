package Controls;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

// This is the popup tha tells you a transaction has been rejected (for example, because you put in an invalid credit card).
public class TransactionRejectedPopup {

    //Checks
    public static boolean PopupPresent(WebDriver driver) {
        try {
            WebElement TransactionRejectedPopup = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Transaction was declined by processor']")));
            return true;
        }
        catch (Exception ex) {
            return false;
        }

    }
}
