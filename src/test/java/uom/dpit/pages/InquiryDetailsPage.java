package uom.dpit.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uom.dpit.test.TestBase;

import java.util.ArrayList;
import java.util.List;

public class InquiryDetailsPage extends TestBase {
    @FindBy(id = "btn_01138_Add")
    WebElement ClickAdd;

    @FindBy(id = "strName_INFInqDetails")
    WebElement txtFirstName;

    @FindBy(id = "strLName_INFInqDetails")
    WebElement txtLastName;

    @FindBy(id = "strID_INFInqDetails")
    WebElement txtNIC;

    @FindBy(id = "strEmail_INFInqDetails")
    WebElement txtEmail;

    @FindBy(id = "strAddr1_INFInqDetails")
    WebElement txtAddress1;

    @FindBy(id = "strAddr2_INFInqDetails")
    WebElement txtAddress2;

    @FindBy(id = "strSkype_INFInqDetails")
    WebElement txtSkype;

    @FindBy(id = "strTwitter_INFInqDetails")
    WebElement txtTwitter;

    @FindBy(id = "strLinkedIn_INFInqDetails")
    WebElement txtLinkdin;

    @FindBy(id = "strCusTelephoneNo_INFInqDetails")
    WebElement txtContactNum;

    @FindBy(id = "btn_01138_Save")
    WebElement btnSave;

    @FindBy(xpath = "//div[@class='bootstrap-switch-container']/span[text()='Personal']")
    WebElement SwitchPersonal;

    @FindBy(xpath = "//div[@class='bootstrap-switch-container']/span[text()='Company']")
    WebElement SwitchCompany;

    @FindBy(id = "lblName")
    WebElement lblCompanyName;

    @FindBy(id = "lblLastNameOrContact")
    WebElement lblContactPerson;

    @FindBy(id = "lblID_INFInqDetails")
    WebElement lblRegNum;


    @FindBy(id = "lblName")
    WebElement lblFirstName;

    @FindBy(id = "lblLastNameOrContact")
    WebElement lblLastName;

    @FindBy(id = "lblID_INFInqDetails")
    WebElement lblNIC;

    @FindBy(id = "btn_01138_CloseExistingDataPopUp")
    WebElement btnPendingInqContinue;

    @FindBy(id = "btn_01138_AddCusTelephoneNo")
    WebElement btncontactGridAdd;

    @FindBy(xpath = "//button[@class='btn btn-warning fa fa-edit row-edit-btn default-input']")
    WebElement BtnEdit;

    @FindBy(xpath = "//button[@class='btn btn-danger fa fa-remove row-remove-btn default-input']")
    WebElement BtnDelete;

    @FindBy(id = "ModalDescriptionText")
    WebElement AlreadycontactValidationMsg;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement tblEnptydata;

    @FindBy(xpath = "//button[@class='btn btn-secondary sw-btn-next']")
    WebElement btnNext;

    @FindBy(id = "strName_INFInqDetailserp-invalid")
    WebElement RequiredMsgfname;

    @FindBy(id = "strCusTelephoneNo_INFInqDetailserp-invalid")
    WebElement RequiredMsgContact;

    @FindBy(xpath = "//legend[@class='custom-border' and (text()='SELECT A PRODUCT LINE')]")
    WebElement getTitleName;

    public void ClickAdd() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ClickAdd);
    }

    public void EnterFirstName(String keysToSend) {
        txtFirstName.sendKeys(keysToSend);
        txtFirstName.sendKeys(Keys.ENTER);
    }

    public void EnterLastName(String keysToSend) {
        txtLastName.sendKeys(keysToSend);
        txtLastName.sendKeys(Keys.ENTER);
    }

    public void EnterNIC(String keysToSend) throws InterruptedException {
        txtNIC.sendKeys(keysToSend);
        Thread.sleep(3000);
        txtNIC.sendKeys(Keys.ENTER);

    }

    public void EnterContactNum(String keysToSend) {
        txtContactNum.sendKeys(keysToSend);
        txtContactNum.sendKeys(Keys.ENTER);
    }

    public void EnterEmail(String keysToSend) throws InterruptedException {
        txtEmail.sendKeys(keysToSend);
        Thread.sleep(1000);
        txtEmail.sendKeys(Keys.ENTER);
    }

    public void ClickSave() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnSave);
    }

    public void ClickswitchPersonal() {
        SwitchPersonal.click();
    }

    public void ClickswitchCompany() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", SwitchCompany);
    }

    public void FieldscheckNull() {
        String ActualFname = txtFirstName.getText();
        String ExpectFname = "";
        String ActualLname = txtLastName.getText();
        String ExpectLname = "";
        String ActualNIC = txtNIC.getText();
        String ExpectNIC = "";
        String ActualEmail = txtEmail.getText();
        String ExpectedEmail = "";
        String ActualAdd1 = txtAddress1.getText();
        String ExpectedAdd1 = "";
        String ActualAdd2 = txtAddress2.getText();
        String ExpectedAdd2 = "";
        String ActualSkype = txtSkype.getText();
        String ExpectedSkype = "";
        String ActualTwitter = txtTwitter.getText();
        String ExpectedTwitter = "";
        String ActualLinkdin = txtLinkdin.getText();
        String ExpectedLinkdin = "";

        Assert.assertEquals(ActualFname, ExpectFname);
        Assert.assertEquals(ActualLname, ExpectLname);
        Assert.assertEquals(ActualNIC, ExpectNIC);
        Assert.assertEquals(ActualEmail, ExpectedEmail);
        Assert.assertEquals(ActualAdd1, ExpectedAdd1);
        Assert.assertEquals(ActualAdd2, ExpectedAdd2);
        Assert.assertEquals(ActualSkype, ExpectedSkype);
        Assert.assertEquals(ActualTwitter, ExpectedTwitter);
        Assert.assertEquals(ActualLinkdin, ExpectedLinkdin);
    }

    public void FieldNamechange() {
        String ActualComname = lblCompanyName.getText();
        String ExpectComname = "Company Name";
        String ActualContactname = lblContactPerson.getText();
        String Expectcontactname = "Contact Person";
        String ActualReg = lblRegNum.getText();
        String ExpectReg = "Business Registration No.";

        Assert.assertEquals(ActualComname, ExpectComname);
        Assert.assertEquals(ActualContactname, Expectcontactname);
        Assert.assertEquals(ActualReg, ExpectReg);
    }

    public void FieldNamechangetoPerson() {
        String Actual1stName = lblFirstName.getText();
        String Expect1stName = "First Name";
        String ActualLastname = lblLastName.getText();
        String ExpectLastname = "Last Name";
        String ActualNic = lblNIC.getText();
        String ExpectNIC = "NIC";

        Assert.assertEquals(Actual1stName, Expect1stName);
        Assert.assertEquals(ActualLastname, ExpectLastname);
        Assert.assertEquals(ActualNic, ExpectNIC);
    }

    @FindBy(id = "strID_INFInqDetailserp-invalid")
    WebElement LblInvalidNIC;

    public void verifyInvalidNIC() {
        String ActualNIC = LblInvalidNIC.getText();
        String ExpectedNIC = "Invalid NIC";

        Assert.assertEquals(ActualNIC, ExpectedNIC);
    }

    public void PendingInqContinueBtn() {
        btnPendingInqContinue.click();
    }

    @FindBy(xpath = "//*[@id=\"grid_01138_CusTelephoneNo\"]/tbody/tr/td[3]")
    WebElement GridContactNum;

    public void VerifyNICWithCustomerMaster() {

        String ActualFName = txtFirstName.getAttribute("value");
        String ExpectFName = "THUWAN RASMI";

        String ActualLName = txtLastName.getAttribute("value");
        String ExpectedLName = "ALAN";

        String ActualAdd1 = txtAddress1.getAttribute("value");
        String ExpectAdd1 = "NO 60/5 JAIL STREET";

        String ActualAdd2 = txtAddress2.getAttribute("value");
        String ExpectAdd2 = "HAMBANTOTA";

        String Actualcontact = GridContactNum.getText();
        String Expectcontact = "0776175612";


        Assert.assertEquals(ActualFName, ExpectFName);
        Assert.assertEquals(ActualLName, ExpectedLName);
        Assert.assertEquals(ActualAdd1, ExpectAdd1);
        Assert.assertEquals(ActualAdd2, ExpectAdd2);
        Assert.assertEquals(Actualcontact, Expectcontact);

    }

    @FindBy(id = "strEmail_INFInqDetailserp-invalid")
    WebElement lblvalidationEmail;

    public void VerifyInvalidEmail() {
        String ActualEmail = lblvalidationEmail.getText();
        String ExpectedEmail = "Invalid Email";

        Assert.assertEquals(ActualEmail, ExpectedEmail);
    }

    public void verifyCharactersEnterContactfield() {
        String ActualContactNum = txtContactNum.getAttribute("value");
        String ExpectedContact = "";

        Assert.assertEquals(ActualContactNum, ExpectedContact);
    }

    public void ClickcontactGridAdd() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btncontactGridAdd);
    }

    @FindBy(id = "strCusTelephoneNo_INFInqDetailserp-invalid")
    WebElement lblvalidationContact;


    public void verifyInvalidcontact() {
        String ActualContactNum = lblvalidationContact.getText();
        String ExpectedContact = "Invalid number";

        Assert.assertEquals(ActualContactNum, ExpectedContact);
    }

    @FindBy(xpath = "//*[@id=\"grid_01138_CusTelephoneNo\"]/tbody/tr/td[3]")
    WebElement getGridContactNum;

    public void verifyexceedcontact() {
        String ActualContactNum = getGridContactNum.getText();
        String ExpectedContact = "0112634361";

        Assert.assertEquals(ActualContactNum,ExpectedContact);
    }

    public void ClearContactNum(){
        txtContactNum.clear();
    }
    public void ClickEditBtnGrid() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", BtnEdit);
    }
    public void ClickDeleteBtnGrid() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", BtnDelete);
    }

    public void verifyEditContactnum() {
        String ActualContactNum = txtContactNum.getAttribute("value");
        String ExpectedContact = "0712634361";

        Assert.assertEquals(ActualContactNum,ExpectedContact);
    }


    public void verifyalreadyaddedContactnum() {
        String ActualContactNum = AlreadycontactValidationMsg.getText();
        String ExpectedContact = "Contact number already added.";

        Assert.assertEquals(ActualContactNum,ExpectedContact);
    }

    public void verifytabledatadeleted() {
        //String ActualContactNum = tblEnptydata.getText();
        //String ExpectedContact = " ";
        //Assert.assertEquals(ActualContactNum,ExpectedContact);






    }




    public void ClickNextbtn() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnNext);
    }
    public void verifywithRequiredFname(){
        String ActualFnameRequired = RequiredMsgfname.getText();
        String ExpectedFnameRequired = "Required";

        Assert.assertEquals(ActualFnameRequired,ExpectedFnameRequired);
    }

    public void verifywithRequiredContact(){
        String ActualcontactRequired = RequiredMsgContact.getText();
        String ExpectedcontactRequired = "Required";

        Assert.assertEquals(ActualcontactRequired,ExpectedcontactRequired);
    }

    public String GetTitle(){
       return  getTitleName.getText();
    }
}
