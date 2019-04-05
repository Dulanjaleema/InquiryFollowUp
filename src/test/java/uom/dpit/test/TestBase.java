package uom.dpit.test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeTest
    public static void reports() {
        reports = new ExtentReports("extentreport/phoenix.html");

    }

    @BeforeMethod
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       // test.log(LogStatus.INFO,"System URL http://testerp.dpg.lk:206/");
        driver.get("http://testerp.dpg.lk:206/");

    }

    @AfterMethod

    public static void closereport(ITestResult result) {
        if (result.isSuccess())
            test.log(LogStatus.PASS, "test pass");
        else {
            test.log(LogStatus.FAIL, "test fail");
        }
//end test
        reports.endTest(test);
    }

    @AfterTest
    public void close() {
        reports.flush();
  //      driver.quit();
    }


}
