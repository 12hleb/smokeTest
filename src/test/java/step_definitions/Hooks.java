package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.Log;
import utilities.TempStorage;

public class Hooks {

    @Before //cucmber Before every Scenario
    public void setup(Scenario scenario){
        //Anything that you want to run before each Scenario
        TempStorage.clear();
        Log.start(scenario.getName());
        ExtentReport.startTest(scenario.getName());

    }

    @After //junit after every Test
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
//            File file = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
//            ExtentReport.fail(file);
        }
        else {
            ExtentReport.pass();
        }
//        System.out.println(scenario.getName());
//        System.out.println(scenario.getStatus());
    }
}
