package Controls;

import org.openqa.selenium.*;

// This is the top navigation bar that appears on every page
public class TopBar {

    //WebElements
    public static WebElement SearchField(WebDriver driver) {
        return driver.findElement(By.id("search-term"));
    }

    public static WebElement SearchButton(WebDriver driver) {
        return driver.findElement(By.xpath("//form[@id='searchform']/i[@class='icon-search']"));
    }

}
