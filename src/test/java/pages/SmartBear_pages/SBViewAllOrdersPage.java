package pages.SmartBear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SBViewAllOrdersPage {
    //new class under smartbear_pages package
    public SBViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersLink;


}