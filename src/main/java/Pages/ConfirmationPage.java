package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ConfirmationPage extends BaseActions{
    WebDriver Driver;
    static String totals;
    static String name;
    static String accountowner;
    static String bankname;
    public ConfirmationPage(WebDriver Driver) {
        super(Driver);
        this.Driver=Driver;
    }
    public void msg()throws Exception{
        isDisplayed("ConfirmationPage.confirmationMsg");
    }
    public String t(){
        return getText("ConfirmationPage.total");
    }
    public String n(){
        return getText("ConfirmationPage.name");

    }
    public String ao(){
        return getText("ConfirmationPage.accountOwner");
    }
    public String bn(){
        return getText("ConfirmationPage.bankName");
    }
}
