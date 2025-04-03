package eac.pages;

import eac.tests.TestBase;
import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UploadFilePage extends TestBase {

    public UploadFilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="file-upload")
    public WebElement chooseFile;

    @FindBy(id="file-submit")
    public WebElement fileSubmit;

    @FindBy(xpath = "//h3[text()='File Uploaded!']")
    public WebElement fileUploadText;
}
