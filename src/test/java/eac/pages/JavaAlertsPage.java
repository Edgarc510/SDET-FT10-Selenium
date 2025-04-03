package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaAlertsPage {

    public JavaAlertsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement jsPrompt;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    public WebElement jsConfirm;

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    public WebElement jsAlert;

    @FindBy(id = "result")
    public WebElement result;
}
