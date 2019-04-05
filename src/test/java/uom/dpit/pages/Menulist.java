package uom.dpit.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uom.dpit.test.TestBase;

    public class Menulist extends TestBase {
        @FindBy(xpath = "//span[text()='Inquiry Follow Up']")
        WebElement clickInquiryFollowUp;

        @FindBy(xpath = "//div[@class='metro-tile-body tile-type-menu' ]/div[@class='metro-content-hide' and text()='Reference']")
        WebElement ClickReference;

        @FindBy(xpath = "//div[@class='metro-tile-body ' ]/div[@class='metro-content-hide' and text()='Campaign Details']")
        WebElement ClickCampaign;

        @FindBy(xpath = "//div[text()='Process']")
        WebElement clickProcessTile;

        @FindBy(xpath = "//div[text()='Inquiry Details']")
        WebElement clickInquiryDetails;

        public  void ClickInquiryFollowUp() {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", clickInquiryFollowUp);
        }
        public  void ClickReference() {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", ClickReference);

        }
        public void clickcampaignref(){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", ClickCampaign);
        }
        public void clickProcess(){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", clickProcessTile);
        }
        public void clickInquiryDetails(){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", clickInquiryDetails);
        }




    }

