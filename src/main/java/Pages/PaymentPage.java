package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PaymentPage extends BaseActions {
    WebDriver Driver;
    public PaymentPage(WebDriver Driver) {
        super(Driver);
        this.Driver = Driver;
    }
    public PaymentPage Terms()throws Exception{
        ClickIt("PaymentPage.click_Terms&Services");
        return this;
    }
    public void tax()throws NumberFormatException{
        float h = Float.valueOf(getText("PaymentPage.ShippingCharge").substring(1));
        Assert.assertFalse(h>5,"Tax exceed");
        System.out.println("Total tax is"+h+"$");
    }
    public PaymentConfirmationPage btn_proceedToCheckout()throws Exception{
        ClickIt("PaymentPage.btn_ProceedToCheckout");
        return new PaymentConfirmationPage(Driver);
    }

}
