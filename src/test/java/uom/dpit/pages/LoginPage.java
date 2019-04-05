package uom.dpit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uom.dpit.test.TestBase;

public class LoginPage extends TestBase {
    @FindBy(id = "strUserName")
    WebElement txtUsername;
    @FindBy(id = "strPassword")
    WebElement txtPassword;
    @FindBy(id = "idSignIn")
    WebElement btnsignin;

    public void Typeusername(String keystosend){
        txtUsername.sendKeys(keystosend);
    }
    public void Typepassword(String keystosend){
        txtPassword.sendKeys(keystosend);

    }
    public void clicksignin(){
        btnsignin.click();

    }

}
