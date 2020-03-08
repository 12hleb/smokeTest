package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {
    public static void main(String[] args) {
        ExtentHtmlReporter configs = new ExtentHtmlReporter("./extentReport/report.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(configs);

        System.out.println("Start test");
        ExtentTest extentTest = reports.createTest("Google Search");
        extentTest.pass("Pass");
        extentTest.fail("Didn't match. FAIL!");
        reports.flush();
        System.out.println("Completed");
    }
}
