package Pages;

import Components.BaseActions;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseActions {
    WebDriver Driver;
    public LoginPage(WebDriver Driver){
        super(Driver);
        this.Driver = Driver;
    }
    public LoginPage sigIn() throws Exception{
        ClickIt("LoginPage.btn_signIn");
        return this;
    }
    public LoginPage id(String name)throws Exception{
        typeTextInto("LoginPage.tbx_id",name);
        return this;
    }
    public LoginPage password(String pass)throws Exception{
        typeTextInto("LoginPage.tbx_password",pass);
        return this;
    }
    public DashBoardPage signInBtn()throws Exception{
        ClickIt("LoginPage.btn_Submit");
        return new DashBoardPage(Driver);
    }
}
