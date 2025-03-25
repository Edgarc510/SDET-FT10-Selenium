package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {


    public CheckBoxPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#box1")
    public WebElement box1;

    @FindBy(css = "#box2")
    public WebElement box2;

}
