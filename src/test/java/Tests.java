import Components.TestActions;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tests extends TestActions {
    @Test
    public void Functionality()throws Exception{
        LoginPage loginPage = new LoginPage(Driver);
        DashBoardPage dashBoardPage = loginPage.sigIn().id("hey@abc.com").password("Testing@123").signInBtn();
        CheckOutPage checkOutPage = dashBoardPage.Button_t().hover_image();
        SummaryPage summaryPage=checkOutPage.iconokz().btn();
        summaryPage.fetch_price();
        PaymentPage paymentPage=summaryPage.checkOut();
        paymentPage.tax();
        PaymentConfirmationPage paymentConfirmationPage= paymentPage.Terms().btn_proceedToCheckout();
        ConfirmationPage confirmationPage = paymentConfirmationPage.payBy().checkOut();
        confirmationPage.msg();
        confirmationPage.t();
        confirmationPage.n();
        confirmationPage.ao();
        confirmationPage.bn();
    }
}
