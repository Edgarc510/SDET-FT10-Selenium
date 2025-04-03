package eac.tests;

import eac.pages.ExplicitWaitPracticePage;
import eac.utilities.BrowserUtils;
import eac.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitPracticeTest {

    ExplicitWaitPracticePage explicitWaitPracticePage = new ExplicitWaitPracticePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @Test
    public void explicitWaitPracticeExample1() {
        //TC#1
//1. Go to http://practice.cydeo.com/dynamic loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading");
        explicitWaitPracticePage.dynamicLink.click();
//2. Click to start
        explicitWaitPracticePage.startButton.click();
//3. Wait until loading bar disappears

        wait.until(ExpectedConditions.visibilityOf(explicitWaitPracticePage.username));
//4. Assert username inputbox is displayed
        Assert.assertTrue(explicitWaitPracticePage.username.isDisplayed());
//5. Enter username: tomsmith
        explicitWaitPracticePage.username.sendKeys("Tomsmith");
//6. Enter password: incorrectpassword
        explicitWaitPracticePage.password.sendKeys("incorrectpassword");
//7. Click to Submit button
        explicitWaitPracticePage.submitButton.click();
//8. Assert "Your password is invalid!" text is displayed.
        Assert.assertTrue(explicitWaitPracticePage.resultText.isDisplayed());
        //div[normalize-space(text())='Your username is invalid!']


    }

    @Test
    public void dynamicLoadExample7() {
        //TC#2
//1. Go to http://practice.cydeo.com/dynamic loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
//2. Wait until title is "Dynamic title"
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        wait.until(ExpectedConditions.visibilityOf(explicitWaitPracticePage.image));
//3. Assert : Message "Done" is displayed.
        Assert.assertTrue(explicitWaitPracticePage.doneMessage.isDisplayed());
//4. Assert : Image is displayed.
        BrowserUtils.sleep(4);
    }

}
