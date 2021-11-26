package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class PaymentConfirmationPage extends BaseActions {
    WebDriver Driver;
    public PaymentConfirmationPage(WebDriver Driver){
        super(Driver);
        this.Driver= Driver;
    }
    public PaymentConfirmationPage payBy()throws Exception{
        ClickIt("PaymentConfirmationPage.WireBank");
        return this;
    }
    public ConfirmationPage checkOut()throws Exception{
        ClickIt("PaymentConfirmationPage.click_conf");
        return new ConfirmationPage(Driver);
    }
}
