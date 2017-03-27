package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// Utilities to help program in selenium more efficiently.
public class SeleniumShortcuts {

    public static void SelectDropdownItemByValue(WebElement element, String value)
    {
        Select country = new Select(element);
        country.selectByValue(value);
    }

    public static void Wait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        }
        // I am not big on munching exceptions as a general rule. However, dealing with other threads interrupting is way out
        // of the scope of this project, so exception munching will be tolerated here for now.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
