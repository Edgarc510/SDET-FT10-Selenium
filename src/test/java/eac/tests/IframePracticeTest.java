package eac.tests;

import eac.pages.IframePracticePage;
import eac.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePracticeTest extends TestBase{

    IframePracticePage iframePracticePage = new IframePracticePage();

    @Test
    public void iFrameTest(){
//1. Go to website: http://practice.cydeo.com/iframe
//2. Assert: "Your content goes here." Text is displayed.
//        Driver.getDriver().switchTo().frame(0); // iframe by index can be also found
        Driver.getDriver().switchTo().frame(iframePracticePage.iFrame);
        String actualText = iframePracticePage.contentTextArea.getText();
        System.out.println("actualText = " + actualText);
        String expectedText = "Your content goes here.";
        Assert.assertEquals(actualText, expectedText);

//3. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor" Text is displayed.
        Driver.getDriver().switchTo().parentFrame(); // getting out of iFrame ... switched back to default frame
        String actualHeadedText = iframePracticePage.header.getText();
        System.out.println("actualHeadedText = " + actualHeadedText);
        String expectedHeadedText = "An iFrame containing the TinyMCE WYSIWYG Editor";
        System.out.println("expectedHeadedText = " + expectedHeadedText);

        Assert.assertEquals(actualHeadedText,expectedHeadedText);
//4. switch back to default frame


    }

}
