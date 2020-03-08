package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.SmartBear_pages.SBLandingPage;
import pages.SmartBear_pages.SBLoginPage;
import pages.SmartBear_pages.SBOrderPage;
import pages.SmartBear_pages.SBViewAllOrdersPage;
import utilities.Driver;

public class Smartbear_Order_stepDef {
    SBLoginPage sb_login_page = new SBLoginPage();
    SBLandingPage sb_landing_page = new SBLandingPage();
    SBOrderPage sbOrderPage = new SBOrderPage();
    SBViewAllOrdersPage sbViewAllOrdersPage = new SBViewAllOrdersPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_SmartBear_Tester_account_and_on_Order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //new SB_Login_Page()       // can also call the class like this if we need to use it once for example but we created object up top so its better
        sb_login_page.usernameInput.sendKeys("Tester");
        sb_login_page.passwordInput.sendKeys("test");
        sb_login_page.loginButton.click();
        sb_landing_page.orderLink.click();
    }

    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String dropDownValue) {
        Select productDropDown = new Select(sbOrderPage.productDropdown);       //Select because this is selcet in the inspect that is the name it used
        productDropDown.selectByVisibleText(dropDownValue);      //
    }

    @Given("User enters {string} to quantity input box")
    public void user_enters_to_quantity_input_box(String givenQuantity) {
        sbOrderPage.quantity.sendKeys(Keys.BACK_SPACE + givenQuantity);
    }

    @Given("User enters {string}to costumer name input box")
    public void user_enters_to_costumer_name_input_box(String customerName) {
        sbOrderPage.customerName.sendKeys(customerName);
    }

    @Given("User enters {string} to street input box")
    public void user_enters_to_street_input_box(String givenstreet) {
        sbOrderPage.street.sendKeys(givenstreet);
    }

    @Given("User enters {string}to city input box")
    public void user_enters_to_city_input_box(String givenCity) {
        sbOrderPage.city.sendKeys(givenCity);
    }

    @Given("User enters {string} to state input box")
    public void user_enters_to_state_input_box(String givenState) {
        sbOrderPage.state.sendKeys(givenState);
    }

    @Given("User enters {string} to zip input box")
    public void user_enters_to_zip_input_box(String givenZip) {
        sbOrderPage.zip.sendKeys(givenZip);
    }

    @Given("User selects {string} as card type from radio buttons")
    public void user_selects_as_card_type_from_radio_buttons(String givenType) {
        if (givenType.equalsIgnoreCase("Visa")) {
            sbOrderPage.visaCardType.click();
        } else if (givenType.equalsIgnoreCase("MasterCard")) {
            sbOrderPage.masterCardType.click();
        } else if (givenType.equalsIgnoreCase("American Express")) {
            sbOrderPage.americanExpressCardType.click();
        } else {
            Assert.assertTrue( " Invalid Card Type!" ,false);   //this is to stop the execution is nothing matches
        }
    }

    @Given("User enters {string} to card number input box")
    public void user_enters_to_card_number_input_box(String giveCardNumber) {
        sbOrderPage.creditCardNumberInput.sendKeys(giveCardNumber);
    }

    @Given("User enters {string} to expiration date input box")
    public void user_enters_to_expiration_date_input_box(String givenExpirationDate) {
        sbOrderPage.expirationDateInput.sendKeys(givenExpirationDate);
    }

    @Given("User clicks process button")
    public void user_clicks_process_button() {
        sbOrderPage.processButton.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String givernName) throws InterruptedException {
        sbViewAllOrdersPage.viewAllOrdersLink.click();
        Thread.sleep(3000);
        String actualName = sbViewAllOrdersPage.viewAllOrdersLink.getText();
        Assert.assertTrue("Names are not matching", actualName.equals(givernName));
    }
}