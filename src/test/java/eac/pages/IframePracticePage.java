package eac.pages;

import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePracticePage {

    public IframePracticePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "mce_0_ifr")
    public WebElement iFrame;
    @FindBy(id = "tinymce")
    public WebElement contentTextArea;
    @FindBy(xpath = "//h3[contains(text(), 'An iFrame c')]")
    public WebElement header;
}
