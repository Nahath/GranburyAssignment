package Tests;

import Controls.EmailPopup;
import Controls.PlaceOrderPopup;
import Controls.TopBar;
import Controls.TransactionRejectedPopup;
import Pages.*;
import Utilities.*;
import com.sun.jndi.cosnaming.IiopUrl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by JoshMc on 3/25/2017.
 */
public class Primary extends BaseTestClass {

    @Test
    public void OrderSoloRug()
    {
        driver.get(Constants.THINK_GEEK_URL);
        TestUser purchaser = new TestUser();
        TestProduct toBuy = new TestProduct();

        TopBar.SearchField(driver).sendKeys(toBuy.getName());
        TopBar.SearchButton(driver).click();

        // This block deals with the fact that ThinkGeek often raises a popup after your search, asking you to subscribe to their mailing list.
        // Since it doesn't always come up, I have to have it in a conditional. Also, the popup has a fading animation that I have to wait out
        // or the next command in my test will fail. Regular selenium waits don't work as well here because the elements are both visible and enabled
        // but still unclickable.
        if(EmailPopup.PopupPresent(driver))
        {
            EmailPopup.ClosePopup(driver).click();
            SeleniumShortcuts.Wait(1000);
        }

        Product.AddItemToCard(driver, toBuy.getSkus().get(0), 2);

        ShoppingCart.QuantityFieldByItem(driver, toBuy.getName()).clear();
        ShoppingCart.QuantityFieldByItem(driver, toBuy.getName()).sendKeys(Integer.toString(1));
        SeleniumShortcuts.SelectDropdownItemByValue(ShoppingCart.SkuPickerByItem(driver, toBuy.getName()), toBuy.getSkus().get(1));
        ShoppingCart.UpdateCart(driver).click();
        ShoppingCart.ContinueToCheckout(driver).click();

        AddressEntry.EnterUsersAddress(driver, purchaser);
        AddressEntry.ShippingSameAsBillingCheck(driver).click();
        AddressEntry.GoToCheckoutButton(driver).click();

        Checkout.EnterUserCreditCardInfo(driver, purchaser);
        Checkout.PlaceOrderButton(driver).click();

        PlaceOrderPopup.PlaceFinalOrderButton(driver).click();

        // I only have one assert here. Depending on what exactly we were testing for with this (and what other tests were already present)
        // it is likely that additional asserts would be added in a full product
        Assert.assertTrue(TransactionRejectedPopup.PopupPresent(driver));
    }
}
