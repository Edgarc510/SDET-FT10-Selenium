package eac.tests;

import eac.pages.WindowHandlePracticePage;
import eac.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlePracticeTest extends TestBase{

    WindowHandlePracticePage windowHandlePracticePage = new WindowHandlePracticePage();

    @Test
    public void windowHandleTest() {
    String currentWindow = Driver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        //1. Go to website: http://practice.cydeo.com/windows
//2. Assert: Title is "Windows"
        Assert.assertEquals(Driver.getDriver().getTitle(),"Windows");
//3. Click to: "Click Here" Link
        windowHandlePracticePage.windowsNewLink.click();

//4. Click to: "Cydeo" link
        windowHandlePracticePage.cydeoLink.click();
//5. Switch to Cydeo page
        //we have to store window handles in a Set
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindowHandle : allWindowHandles) {
            Driver.getDriver().switchTo().window(eachWindowHandle);
            System.out.println("eachWindowHandle = " + eachWindowHandle);
            System.out.println("Title = " + Driver.getDriver().getTitle());

            //if I want to move to a certain tab
            if(Driver.getDriver().getTitle().equals("Cydeo")){
                break;
            }
        }

//6. Assert: Title is "Cydeo" of the current window
        Assert.assertEquals(Driver.getDriver().getTitle(),"Cydeo");
//7.Switch back to main handle
        Driver.getDriver().switchTo().window(currentWindow);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Windows");

    }
}
