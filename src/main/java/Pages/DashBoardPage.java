package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DashBoardPage extends BaseActions {
    WebDriver Driver;
    public DashBoardPage(WebDriver Driver) {
        super(Driver);
        this.Driver = Driver;
    }
    public DashBoardPage Button_t()throws Exception{
        ClickIt("DashBoardPage.btn_T-shirt");
        return this;
    }
    public CheckOutPage hover_image()throws Exception{
        hoverOnTo("DashBoardPage.img");
        ClickIt("DashBoardPage.AddToCart");
        return new CheckOutPage(Driver);
    }

}
