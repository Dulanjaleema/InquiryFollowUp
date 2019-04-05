package uom.dpit.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uom.dpit.test.TestBase;

public class HelpPage extends TestBase {
    @FindBy(id = "strColName01036")
    WebElement StrColumnName;
    @FindBy(id = "strSearchText01036")
    WebElement StrSearch;
    @FindBy(id = "btnSearch01036")
    WebElement btnSearch;
    @FindBy(xpath = "//tr[@data-rowid='0']")
    WebElement rowSelect;

    public void SelectColumnName() {
        Select ColumnName = new Select(StrColumnName);
        ColumnName.selectByIndex(1);
    }

    public void SearchValue(String keysToSend) {
        StrSearch.sendKeys(keysToSend);
    }

    public void ClickSearchButton() {
        btnSearch.click();
    }

    public void SelectRow() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", rowSelect);
       //rowSelect.sendKeys(Keys.ENTER);
    }
}
