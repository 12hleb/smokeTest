package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.Driver;
import utilities.TempStorage;

import java.util.HashMap;

public class compareHeaders_stepDef {

    public HashMap<String, String> headers;



    @Given("user go the {string}")
    public void user_go_the(String url) {
        Driver.getDriver().get(url);

    }

    @When("user write down firs header")
    public void user_write_down_firs_header() {
       String s =Driver.getDriver().findElement(By.xpath("//h1")).getText();
        TempStorage.addData("test",s);
    }


    @When("user write down second header")
    public void user_write_down_second_header() {
        String s2 =Driver.getDriver().findElement(By.xpath("//h1")).getText();
        TempStorage.addData("test2",s2);
    }

    @Then("compere the headers")
    public void compere_the_headers() {
        Assert.assertEquals(TempStorage.getData("test"), TempStorage.getData("test2"));
    }

}