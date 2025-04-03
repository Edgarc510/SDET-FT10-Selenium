package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPracticePage {

    public ExplicitWaitPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/dynamic_loading/1']")
    public WebElement dynamicLink;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement startButton;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="pwd")
    public WebElement password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id = "flash")
    public WebElement resultText;
    @FindBy(xpath = "//strong[normalize-space(text())='Done!']")
    public WebElement doneMessage;
    @FindBy(xpath = "//img[@src='/img/a-few-moments.jpg']")
    public WebElement image;


    //TC#1
//1. Go to http://practice.cydeo.com/dynamic loading/1
//2. Click to start
//3. Wait until loading bar disappears
//4. Assert username inputbox is displayed
//5. Enter username: tomsmith
//6. Enter password: incorrectpassword
//7. Click to Submit button
//8. Assert "Your password is invalid!" text is displayed.

//TC#2
//1. Go to http://practice.cydeo.com/dynamic loading/7
//2. Wait until title is "Dynamic title"
//3. Assert : Message "Donę" is displayed.
//4. Assert : Image is displayed.
}
