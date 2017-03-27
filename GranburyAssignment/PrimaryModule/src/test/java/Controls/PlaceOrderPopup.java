package Controls;

import org.openqa.selenium.*;

// This is the popup that appears after you've placed an order asking you to finalize it.
public class PlaceOrderPopup {

    //WebElements
    public static WebElement PlaceFinalOrderButton(WebDriver driver)
    {
        return driver.findElement(By.id("form_place_final_order"));
    }
}
