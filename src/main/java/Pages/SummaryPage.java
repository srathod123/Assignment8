package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SummaryPage extends BaseActions {
    WebDriver Driver;
    public SummaryPage(WebDriver Driver) {
        super(Driver);
        this.Driver = Driver;
    }
    public void fetch_price()throws NumberFormatException {
       String h = getText("SummaryPage.get_total").substring(1);
       float m = Float.valueOf(h);
       Assert.assertFalse(m>20.00,"Price exceed 20$");
        System.out.println("Price of T-shirt is "+m+"$");
    }
    public PaymentPage checkOut()throws Exception{
        ClickIt("SummaryPage.click_checkOut");
        return new PaymentPage(Driver);
    }

}
