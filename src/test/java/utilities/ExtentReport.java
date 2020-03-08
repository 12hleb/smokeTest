package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

    private static ExtentHtmlReporter configs;
    private static ExtentReports reports;
    private static ExtentTest extentTest;

    static {
       configs = new ExtentHtmlReporter("./extentReport/report.html");
       configs.config().setDocumentTitle("Extent Report");
       reports = new ExtentReports();
       reports.attachReporter(configs);
       reports.setSystemInfo("username:","user");
       reports.setSystemInfo("envarament" , Config.getProperty("browser"));
    }

    public static void startTest(String testName){
        extentTest = reports.createTest(testName);
    }

    public static void pass(){
        extentTest.pass("PASS");
    }

    public static void fail(MediaEntityModelProvider file){
        extentTest.fail("FAILED");
//        extentTest.fail("Screanshot",file);

    }

    public static void endReport(){
        reports.flush();
    }
}
