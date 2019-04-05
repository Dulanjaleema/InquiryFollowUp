package uom.dpit.test;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uom.dpit.basic.BasicTest;
import uom.dpit.pages.Menulist;

import java.util.ArrayList;

public class Navigatorpath extends TestBase {
    @Test
    public static void NavigatoCampaignCode() throws InterruptedException {

        BasicTest basic = new BasicTest();
        basic.LoginToErp();
        Menulist menulist= PageFactory.initElements(driver,Menulist.class);
        menulist.ClickInquiryFollowUp();
        test.log(LogStatus.INFO,"Navigate to Inquiry FollowUp");
        Thread.sleep(3000);
        ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(1));

        menulist.ClickReference();
        test.log(LogStatus.INFO,"Navigate to Reference");
        menulist.clickcampaignref();
        test.log(LogStatus.INFO,"Navigate to Campaign Details");
    }

    @Test
    public static void NavigatoInquiryDetails() throws InterruptedException {

        BasicTest basic = new BasicTest();
        basic.LoginToErp();
        Menulist menulist= PageFactory.initElements(driver,Menulist.class);
        menulist.ClickInquiryFollowUp();
        test.log(LogStatus.INFO,"Navigate to Inquiry FollowUp");
        Thread.sleep(3000);
        ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(1));

        test.log(LogStatus.INFO,"Navigate to Process ");
        menulist.clickProcess();
        test.log(LogStatus.INFO,"Navigate to Inquiry Details ");
        menulist.clickInquiryDetails();
    }
}

















