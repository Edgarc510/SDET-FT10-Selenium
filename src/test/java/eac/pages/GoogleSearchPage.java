package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".gLFyf")
    public WebElement searchBox;

}
