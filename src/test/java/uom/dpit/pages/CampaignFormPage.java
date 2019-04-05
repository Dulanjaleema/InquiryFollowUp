package uom.dpit.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uom.dpit.test.TestBase;



public class CampaignFormPage extends TestBase {
    @FindBy(id = "btn_01139_Add")
    WebElement ClickAdd;

    @FindBy(id = "strCamDesc_INFRefCampDetails")
    WebElement Description;

    @FindBy(id = "strPremisesCode_INFRefCampingDetails")
    WebElement Premisescode;

    @FindBy(id = "strCampingPlace_INFRefCampingDetails")
    WebElement venue;

    @FindBy(id = "intExpectedinquiries_INFRefCampingDetails")
    WebElement ExpectedInquires;

    @FindBy(id = "str2WProductLine_INFRefCampingDetails")
    WebElement twow;

    @FindBy(id = "str3WProductLine_INFRefCampingDetails")
    WebElement threew;

    @FindBy(id = "str4WProductLine_INFRefCampingDetails")
    WebElement fourw;

    @FindBy(id = "dtmInqFromdate_INFRefCampingDetails")
    WebElement FromDate;

    @FindBy(id = "dtmInqTodate_INFRefCampingDetails")
    WebElement ToDate;

    @FindBy(id = "rdbActive_INFCampaignDetails")
    WebElement StatusActive;

    @FindBy(id = "rdbInactive_INFCampaignDetails")
    WebElement StatusInactive;

    @FindBy(id = "strReviewRemark_INFRefCampingDetails")
    WebElement txtRemark;

    @FindBy(id = "btn_01139_Save")
    WebElement btnSave;

    @FindBy(id = "btn_01139_Clear")
    WebElement btnClear;

    @FindBy(id = "btn_01139_Return")
    WebElement btnReturn;

    @FindBy(id = "btn_01139_Inquiry")
    WebElement btnInquiry;

    @FindBy(id = "btn_01139_Modify")
    WebElement btnModify;

    @FindBy(id = "strCamCode_INFRefCamDetails")
    WebElement txtcampaigncode;

    @FindBy(id = "ModalDescriptionText")
    WebElement lblrequired;

    @FindBy(id = "ModalDescriptionText")
    WebElement SaveVerifymsg;

    @FindBy(id = "dtmInqTodate_INFRefCampingDetailserp-invalid")
    WebElement DateValidationToDate;

    @FindBy(id = "dtmInqFromdate_INFRefCampingDetailserp-invalid")
    WebElement DateValidationFromDate;

    @FindBy(id = "strPremisesCode_INFRefCampingDetailserp-invalid")
    WebElement lblPremises;
    @FindBy(id = "strCampingPlace_INFRefCampingDetailserp-invalid")
    WebElement lblvenue;
    @FindBy(id = "intExpectedinquiries_INFRefCampingDetailserp-invalid")
    WebElement lblExpectedInquires;
    @FindBy(id = "dtmInqFromdate_INFRefCampingDetailserp-invalid")
    WebElement lblFromDate;
    @FindBy(id = "dtmInqTodate_INFRefCampingDetailserp-invalid")
    WebElement lblToDate;
    @FindBy(id = "strCamDesc_INFRefCampDetailserp-invalid")
    WebElement lblDescription;
    @FindBy(id = "ModalDescriptionText")
    WebElement msgAlreadyAdded;


    public void ClickAddButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ClickAdd);
    }

    public void Enterdescription(String keysToSend) {
        Description.sendKeys(keysToSend);
        Description.sendKeys(Keys.ENTER);
    }

    public void EnterPremises(String keysToSend) {
        Premisescode.sendKeys(keysToSend);
        Premisescode.sendKeys(Keys.ENTER);
    }

    public void EnterVenue(String keysToSend) {
        venue.sendKeys(keysToSend);
        venue.sendKeys(Keys.ENTER);
    }

    public void EnterExpectedInquiries(String keysToSend) {
        ExpectedInquires.sendKeys(keysToSend);
        ExpectedInquires.sendKeys(Keys.ENTER);
    }

    public void Select2W() {

        if (twow.isSelected()) {
            //do nothing
        } else {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", twow);
        }


    }

    public void Select3W() {

        if (threew.isSelected()) {
            //do nothing
        } else {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", threew);
        }


    }

    public void Select4W() {

        if (fourw.isSelected()) {
            //do nothing
        } else {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", fourw);
        }
    }

    public void EnterFromDate(String keysToSend) {
        //FromDate.clear();
        FromDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        FromDate.sendKeys(Keys.BACK_SPACE);
        FromDate.sendKeys(keysToSend);
        FromDate.sendKeys(Keys.ENTER);


    }

    public void EnterToDate(String keysToSend) {
        //ToDate.clear();
        ToDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        ToDate.sendKeys(Keys.BACK_SPACE);
        ToDate.sendKeys(keysToSend);
        ToDate.sendKeys(Keys.ENTER);
    }

    public void SelectActive() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", StatusActive);


    }

    public void SelectInactive() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", StatusInactive);

    }

    public void EnterRemark(String keysToSend) {
        txtRemark.sendKeys(keysToSend);
        txtRemark.sendKeys(Keys.ENTER);
    }

    public void ClickSave() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnSave);

    }

    public void ClickClear() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnClear);

    }

    public void ClickReturn() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnReturn);

    }

    public void ClickInquiry() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnInquiry);

    }

    public void ClickModify() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnModify);

    }

    public void EnterCampaignCode(String keysToSend) {
        txtcampaigncode.sendKeys(keysToSend);
        txtcampaigncode.sendKeys(Keys.ENTER);
    }

    public void Requiredmessage() {
        String ActualResult = lblrequired.getText();
        String ExpectedResult = "Please select a campaign type.";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }


    public void UnSelect2W() {

        if (twow.isSelected()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", twow);
        } else {
            //do nothing
        }


    }

    public void UnSelect3W() {

        if (threew.isSelected()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", threew);
        } else {
            //do nothing
        }


    }

    public void UnSelect4W() {

        if (fourw.isSelected()) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", fourw);
        } else {
            //do nothing
        }
    }

    public void savemessageVerify() {
        String ActualResult = SaveVerifymsg.getText();
        String ExpectedResult = "Successfully modified - Campaign Code: PC2019030046";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }

    public void ToDateValidation() {
        String ActualResult = DateValidationToDate.getText();
        String ExpectedResult = "To date Should be greater than Start Date";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }

    public void FromDateValidation() {
        String ActualResult = DateValidationFromDate.getText();
        String ExpectedResult = "From date should be less than End Date";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }
    public void RequiredPremises() {
        String ActualResult = lblPremises.getText();
        String ExpectedResult = "Invalid";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }
    public void RequiredVenue() {
        String ActualResult = lblvenue.getText();
        String ExpectedResult = "Required";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }
    public void lblExpectedInquires() {
        String ActualResult = lblExpectedInquires.getText();
        String ExpectedResult = "Required";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }
    public void lblFromdate() {
        FromDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        FromDate.sendKeys(Keys.BACK_SPACE);

        String ActualResult = lblFromDate.getText();
        String ExpectedResult = "Required";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }
    public void lblTodate() {
        ToDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        ToDate.sendKeys(Keys.BACK_SPACE);
        String ActualResult = lblToDate.getText();
        String ExpectedResult = "Required";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }
    public void lblDescription() {
        String ActualResult = lblDescription.getText();
        String ExpectedResult = "Required";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }

    public void clearFromDate() {
        FromDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        FromDate.sendKeys(Keys.BACK_SPACE);

    }
    public void clearTodate() {
        ToDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        ToDate.sendKeys(Keys.BACK_SPACE);
    }

    public void msgalreadyadded() {
        String ActualResult = msgAlreadyAdded.getText();
        String ExpectedResult = "CAMPAIGN ALREADY EXISTS.";

        Assert.assertEquals(ActualResult, ExpectedResult);

    }



}
