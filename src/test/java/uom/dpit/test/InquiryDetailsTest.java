package uom.dpit.test;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import uom.dpit.pages.HelpPage;
import uom.dpit.pages.InquiryDetailsPage;

public class InquiryDetailsTest extends TestBase {
    @Test(priority = 1)

    public void InquirySwitchToCompanyThenDataClear() throws InterruptedException {
        test = reports.startTest("InquireDetails-Inquiry switch to company  then data clear ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter First Name");
        Thread.sleep(8000);
        detailsPage.EnterFirstName("Test1");
        test.log(LogStatus.INFO, "Enter Last Name");
        detailsPage.EnterLastName("Test2");
        test.log(LogStatus.INFO, "Enter NIC Number");
        detailsPage.EnterNIC("916885471V");
        test.log(LogStatus.INFO, "switch change to Company");
        Thread.sleep(8000);
        detailsPage.ClickswitchPersonal();
        test.log(LogStatus.INFO, "verify clear  Fields");
        detailsPage.FieldscheckNull();
        test.log(LogStatus.INFO, "verify When Switch changing fields names too change");
        detailsPage.FieldNamechange();

    }

    @Test(priority = 2)
    public void InquirySwitchToPersonThenDataClear() throws InterruptedException {
        test = reports.startTest("InquireDetails- Inquiry switch to person then data clear  ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "switch change to Company");
        Thread.sleep(8000);
        detailsPage.ClickswitchPersonal();
        test.log(LogStatus.INFO, "Enter Company Name");
        Thread.sleep(8000);
        detailsPage.EnterFirstName("Test1");
        test.log(LogStatus.INFO, "Enter Contact Name");
        detailsPage.EnterLastName("Test2");
        test.log(LogStatus.INFO, "Enter Reg Number");
        detailsPage.EnterNIC("916885471V");
        test.log(LogStatus.INFO, "switch change to Person");
        Thread.sleep(8000);
        detailsPage.ClickswitchCompany();
        test.log(LogStatus.INFO, "verify clear  Fields");
        detailsPage.FieldscheckNull();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "verify When Switch changing fields names too change");
        detailsPage.FieldNamechangetoPerson();
        Thread.sleep(8000);

    }

    @Test(priority = 3)
    public void checkNICFieldValidation() throws InterruptedException {
        test = reports.startTest("check NIC Field Validation ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter Invalid NIC");
        detailsPage.EnterNIC("123");
        test.log(LogStatus.INFO, "Click Save");
        detailsPage.ClickSave();
        test.log(LogStatus.INFO, "Verify NIC Validation Message");
        detailsPage.verifyInvalidNIC();

    }

    @Test(priority = 4)
    public void CheckAlreadyIncludedNICinCustomerMaster() throws InterruptedException {
        test = reports.startTest("check already Included NIC in Customer Master ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter already Included NIC in Customer Master");
        detailsPage.EnterNIC("861760952V");
        Thread.sleep(8000);
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        helpPage.SelectRow();
        Thread.sleep(8000);
        detailsPage.PendingInqContinueBtn();
        Thread.sleep(30000);
        test.log(LogStatus.INFO, "verify relevant data loaded");
        detailsPage.VerifyNICWithCustomerMaster();

    }

    @Test(priority = 5)
    public void checkNICwithPendingInquires() throws InterruptedException {
        test = reports.startTest("check  NIC with Pending Inquires  ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter NIC with Pending Inquires");
        detailsPage.EnterNIC("861760952V");
        Thread.sleep(8000);
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        helpPage.SelectRow();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Verify with Pending Inquiries Form");
        detailsPage.PendingInqContinueBtn();
    }

    @Test(priority = 6)
    public void checkEmailAddressValidation() throws InterruptedException {
        test = reports.startTest("check Email Address Validation ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter Invalid Email");
        detailsPage.EnterEmail("dptec");
        test.log(LogStatus.INFO, "verify with Validation Message");
        detailsPage.VerifyInvalidEmail();

    }

    @Test(priority = 8)
    public void checkTelephoneNumFieldValidation() throws InterruptedException {
        test = reports.startTest("check Telephone Num field Validation ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter Characters to Telephone number field ");
        detailsPage.EnterContactNum("cvcvcv");
        test.log(LogStatus.INFO, "verify cannot enter Characters");
        detailsPage.verifyCharactersEnterContactfield();
        Thread.sleep(8000);

        test.log(LogStatus.INFO, "verify  not enough length to contact");
        detailsPage.EnterContactNum("123");
        detailsPage.ClickcontactGridAdd();
        detailsPage.verifyInvalidcontact();
        Thread.sleep(8000);
        detailsPage.ClearContactNum();

        test.log(LogStatus.INFO, "verify length exceed to contact");
        detailsPage.EnterContactNum("01126343612");
        detailsPage.ClickcontactGridAdd();
        detailsPage.verifyexceedcontact();

    }
    @Test(priority = 9)
    public void checkContactNumberwithPendingInquires() throws InterruptedException {
        test = reports.startTest("check  Contact Number with Pending Inquires ");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter Contact number with pending Inquiries");
        detailsPage.EnterContactNum("0776175612");
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        helpPage.SelectRow();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Verify with Pending Inquiries Form");
        detailsPage.PendingInqContinueBtn();
        Thread.sleep(8000);


    }

    @Test(priority = 10)
    public void CheckalreadyEnteredContactnuminCustomerMaster() throws InterruptedException {
        test = reports.startTest("check already Entered Contact num in Customer Master");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Check already Entered Contact num in Customer Master");
        detailsPage.EnterContactNum("0776175612");
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        helpPage.SelectRow();
        Thread.sleep(8000);
        detailsPage.PendingInqContinueBtn();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "verify relevant data loaded");
        detailsPage.VerifyNICWithCustomerMaster();

    }
    @Test(priority = 11)
    public void checkTelephoneNumGridEditbutton  () throws InterruptedException {
        test = reports.startTest("Check Telephone Num Grid Edit button");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter valid Telephone number");
        detailsPage.EnterContactNum("0712634361");
        detailsPage.ClickEditBtnGrid();
        test.log(LogStatus.INFO, "Verify with Pending Contact Number in field");
        detailsPage.verifyEditContactnum();
    }

    @Test(priority = 12)
    public void checkAlreadyaddedcontactnumagainadded() throws InterruptedException {
        test = reports.startTest("check Already added contact num again added to the contact Details Grid");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter valid Telephone number");
        detailsPage.EnterContactNum("0712634361");
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Again Enter that Tel num");
        detailsPage.EnterContactNum("0712634361");
        test.log(LogStatus.INFO, "VerifyWith Validation Message");
        Thread.sleep(8000);
        detailsPage.verifyalreadyaddedContactnum();

    }
    @Test(priority = 13)
    public void checkTelephoneNumGridDeletebutton() throws InterruptedException {
        test = reports.startTest("check Telephone Num Grid Delete button");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Enter valid Telephone number");
        detailsPage.EnterContactNum("0712634361");
        test.log(LogStatus.INFO, "delete contact number in the grid");
        detailsPage.ClickDeleteBtnGrid();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "verify data deleted in grid");


    }

    @Test(priority = 14)
    public void checkNextbuttonfunction() throws InterruptedException {
        test = reports.startTest("check Next button function");
        Navigatorpath navi = new Navigatorpath();
        navi.NavigatoInquiryDetails();
        Thread.sleep(8000);
        test.log(LogStatus.INFO, "Click Add Mode");
        InquiryDetailsPage detailsPage = PageFactory.initElements(driver, InquiryDetailsPage.class);
        detailsPage.ClickAdd();
        test.log(LogStatus.INFO, "Click Next Button");
        detailsPage.ClickNextbtn();
        test.log(LogStatus.INFO, "verify with required message in FirstName");
        detailsPage.verifywithRequiredFname();
        test.log(LogStatus.INFO, "Enter First Name");
        detailsPage.EnterFirstName("test");
        test.log(LogStatus.INFO, "Click Next Button");
        detailsPage.ClickNextbtn();
        test.log(LogStatus.INFO, "verify with required message in Contact Details");
        detailsPage.verifywithRequiredContact();
        test.log(LogStatus.INFO, "Enter valid Telephone number");
        detailsPage.EnterContactNum("0712634361");
        test.log(LogStatus.INFO, "Click Next Button");
        detailsPage.ClickNextbtn();
        test.log(LogStatus.INFO, "Verify With Next form");
        detailsPage.GetTitle();

    }

}
