package uom.dpit.test;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uom.dpit.pages.CampaignFormPage;

public class CampaignFormTest extends TestBase {
    @Test (priority = 1)
    public static void RequiredfieldEmptyandSave() throws InterruptedException {
        test = reports.startTest("CampaignRef-Required field Empty and save");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();

        test.log(LogStatus.INFO,"Click Add Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickAddButton();
        test.log(LogStatus.INFO,"Required Fields Empty and Click save");
        formPage.clearFromDate();
        formPage.clearTodate();
        formPage.ClickSave();
        test.log(LogStatus.INFO,"Required message display under Description /Premises code/Venue/Expected/From and To date");
        formPage.lblFromdate();
        formPage.lblTodate();
        formPage.lblDescription();
        formPage.RequiredPremises();
        formPage.RequiredVenue();
        formPage.lblExpectedInquires();


    }
    @Test (priority = 2)
    public static void EnteMaxlengthandsave() throws InterruptedException {
        test = reports.startTest("CampainRef-Enter Max length and save");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Add Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickAddButton();
        test.log(LogStatus.INFO,"Enter Max length description");
        formPage.Enterdescription("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        formPage.EnterPremises("akp");
        test.log(LogStatus.INFO,"Enter Max length Venue");
        formPage.EnterVenue("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        formPage.EnterExpectedInquiries("1213");
        test.log(LogStatus.INFO,"Select 2W");
        formPage.Select2W();
        test.log(LogStatus.INFO,"Enter Max length Remarks");
        formPage.EnterRemark("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
        formPage.ClickSave();
        Thread.sleep(8000);

    }

    @Test (priority = 3)
    public static void SelectAllcampaigncodeandsave () throws InterruptedException {
        test = reports.startTest("CampaignRef-Select All campaign code and save");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Add Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickAddButton();
        test.log(LogStatus.INFO,"Enter description");
        formPage.Enterdescription("TestY");
        formPage.EnterPremises("akp");
        test.log(LogStatus.INFO,"Enter  Venue");
        formPage.EnterVenue("Colombo");
        test.log(LogStatus.INFO,"Enter  Expected Inquiries");
        formPage.EnterExpectedInquiries("1");
        test.log(LogStatus.INFO,"Select All campaign code");
        formPage.Select2W();
        formPage.Select3W();
        formPage.Select4W();
        test.log(LogStatus.INFO,"Click Save");
        formPage.ClickSave();
        Thread.sleep(8000);
    }
    @Test (priority = 4)
    public static void NoCampaignTypeandSave () throws InterruptedException {
        test = reports.startTest("CampaignRef-No Campaign Type and Save");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Inquiry Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickInquiry();
        test.log(LogStatus.INFO,"Enter campaign code PC2019030017");
        formPage.EnterCampaignCode("PC2019030017");
        test.log(LogStatus.INFO,"Click Modify Mode");
        formPage.ClickModify();
        test.log(LogStatus.INFO,"Unselect All campaign Check box");
        formPage.UnSelect2W();
        formPage.UnSelect3W();
        formPage.UnSelect4W();
        test.log(LogStatus.INFO,"Click Save");
        formPage.ClickSave();
        Thread.sleep(5000);
        test.log(LogStatus.INFO,"verify validation message");
        formPage.Requiredmessage();
        Thread.sleep(8000);
    }
    @Test (priority = 5)
    public static void CampaigncodeInactiveandsave () throws InterruptedException {
        test = reports.startTest("CampaignRef-Campaign code Inactive  and save");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Inquiry Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickInquiry();
        test.log(LogStatus.INFO,"Enter campaign code PC2019030046");
        formPage.EnterCampaignCode("PC2019030046");
        test.log(LogStatus.INFO,"Click Modify Mode");
        formPage.ClickModify();
        test.log(LogStatus.INFO,"Select 2W and Unselect 3W and 4W");
        formPage.Select2W();
        formPage.UnSelect3W();
        formPage.UnSelect4W();
        test.log(LogStatus.INFO,"click Inactive");
        formPage.SelectInactive();
        test.log(LogStatus.INFO,"Click Save");
        formPage.ClickSave();
        test.log(LogStatus.INFO,"save Message verify");
        Thread.sleep(5000);
        formPage.savemessageVerify();
        Thread.sleep(8000);
    }
    @Test (priority = 6)
    public static void CampaigncodeActiveandsave () throws InterruptedException {
        test = reports.startTest("CampaignRef-Campaign code Active  and save");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Inquiry Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickInquiry();
        test.log(LogStatus.INFO,"Enter campaign code PC2019030046");
        formPage.EnterCampaignCode("PC2019030046");
        test.log(LogStatus.INFO,"Click Modify Mode");
        formPage.ClickModify();
        test.log(LogStatus.INFO,"Select 2W and Unselect 3W and 4W");
        formPage.Select2W();
        formPage.UnSelect3W();
        formPage.UnSelect4W();
        test.log(LogStatus.INFO,"click Active");
        formPage.SelectActive();
        test.log(LogStatus.INFO,"Click Save");
        formPage.ClickSave();
        test.log(LogStatus.INFO,"save Message verify");
        Thread.sleep(5000);
        formPage.savemessageVerify();
        Thread.sleep(8000);
    }

    @Test (priority = 7)
    public static void Inquiry () throws InterruptedException {
        test = reports.startTest("CampaignRef-Data Inquiry in Inquiry mode");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Inquiry Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickInquiry();
        test.log(LogStatus.INFO,"Enter campaign code PC2019030046");
        formPage.EnterCampaignCode("PC2019030046");
        Thread.sleep(8000);
    }
    @Test (priority = 8)
    public static void DatePeriodcheckTodate () throws InterruptedException {
        test = reports.startTest("CampaignRef-Date Period check To date less Than From date");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Inquiry Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickInquiry();
        Thread.sleep(8000);
        test.log(LogStatus.INFO,"Enter campaign code PC2019030046");
        formPage.EnterCampaignCode("PC2019030046");
        test.log(LogStatus.INFO,"Click Modify Mode");
        formPage.ClickModify();
        Thread.sleep(8000);
        test.log(LogStatus.INFO,"Enter Form Date");
        formPage.EnterFromDate("07/03/2019");
        Thread.sleep(8000);
        test.log(LogStatus.INFO,"Enter To Date less than From date");
        formPage.EnterToDate("06/03/2019");
        Thread.sleep(8000);
        test.log(LogStatus.INFO,"verify To Date validation message ");


    }
    @Test (priority = 9)
    public static void checkEnterAlreadyaddeddescription () throws InterruptedException {
        test = reports.startTest("CampaignRef-Already added description add");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoCampaignCode();
        test.log(LogStatus.INFO,"Click Add Button");
        CampaignFormPage formPage = PageFactory.initElements(driver,CampaignFormPage.class);
        formPage.ClickAddButton();
        test.log(LogStatus.INFO,"Enter description");
        formPage.Enterdescription("Testk");
        formPage.EnterPremises("akp");
        test.log(LogStatus.INFO,"Enter  Venue");
        formPage.EnterVenue("Colombo");
        test.log(LogStatus.INFO,"Enter  Expected Inquiries");
        formPage.EnterExpectedInquiries("1");
        test.log(LogStatus.INFO,"Select All campaign code");
        formPage.Select2W();
        formPage.Select3W();
        formPage.Select4W();
        test.log(LogStatus.INFO,"Click Save");
        formPage.ClickSave();
        test.log(LogStatus.INFO,"Verify with expected result");
        Thread.sleep(8000);
        formPage.msgalreadyadded();
        Thread.sleep(8000);
    }


}
