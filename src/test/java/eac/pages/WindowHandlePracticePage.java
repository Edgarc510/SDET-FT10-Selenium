package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePracticePage {

    public WindowHandlePracticePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //windows/new"
    @FindBy(linkText = "Click Here")
    public WebElement windowsNewLink;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;
}
