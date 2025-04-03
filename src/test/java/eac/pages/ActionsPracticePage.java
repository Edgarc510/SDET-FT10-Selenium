package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionsPracticePage {

    public ActionsPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Hovers")
    public WebElement hoversLink;

    @FindBy(linkText = "A/B Testing")
    public WebElement abTestingLink;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;

    @FindBy(linkText = "Home")
    public WebElement homeLink;

    @FindBy(xpath = "(//img[@alt='User Avatar'])[1]")
    public WebElement hoverImage1;
    @FindBy(xpath = "(//img[@alt='User Avatar'])[2]")
    public WebElement hoverImage2;
    @FindBy(xpath = "(//img[@alt='User Avatar'])[3]")
    public WebElement hoverImage3;

    @FindBy(xpath = "//h5[text()='name: user1']")
    public WebElement imageText1;

    @FindBy(xpath = "//h5[text()='name: user2']")
    public WebElement imageText2;

    @FindBy(xpath = "//h5[text()='name: user3']")
    public WebElement imageText3;
    //TC#1
//1. Go to http://practice.cydeo.com/hovers
//2. Hover over to first image
//3. Assert: "name: user1" is displayed
//4. Hover over to second image
//5. Assert: "name: user2" is displayed
//6. Hover over to third image
//7. Assert: "name: user3" is displayed

//TC#2
//1. Go to https://practice.cydeo.com/
//2. Right click on A/B Testing Link
//3. Open link in new window
//4. Verify title is "No A/B Test"

//TC#3
//1. Go to https://practice.cydeo.com/
//2. Scroll down to "Cydeg" link
//3. Scroll up to "Home" Link

}
