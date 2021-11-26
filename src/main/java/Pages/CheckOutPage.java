package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckOutPage extends BaseActions {
    WebDriver Driver;
    public CheckOutPage(WebDriver Driver){
        super(Driver);
        this.Driver= Driver;
    }

    public CheckOutPage iconokz()throws Exception{
        isEnabled("CheckoutPage.iconOkk");
        return this;
    }
    public SummaryPage btn()throws Exception{
        ClickIt("CheckOutPage.btn_checkOut");
        return new SummaryPage(Driver);
    }
}
