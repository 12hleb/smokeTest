package pages.google_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleLandingPage {

    public GoogleLandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1 - locate the input box
    @FindBy(name = "q")
    public WebElement SearchBox;
    //2- locate the search button
    @FindBy(name = "btnK")
    public WebElement searchButton;
}
