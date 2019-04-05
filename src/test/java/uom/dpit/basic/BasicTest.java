package uom.dpit.basic;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uom.dpit.pages.LoginPage;
import uom.dpit.test.TestBase;

public class BasicTest extends TestBase {
    @Test
    public static void LoginToErp(){

        LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
        loginPage.Typeusername("chathura");
        test.log(LogStatus.INFO,"enter valid Username");
        loginPage.Typepassword("abc123+");
        test.log(LogStatus.INFO,"enter valid password");
        loginPage.clicksignin();
    }
}
