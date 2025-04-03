package eac.tests;

import eac.pages.ActionsPracticePage;
import eac.utilities.BrowserUtils;
import eac.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPracticeTest extends TestBase{

    ActionsPracticePage actionsPracticePage = new ActionsPracticePage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void hoversTest() throws InterruptedException {
        //1. Go to http://practice.cydeo.com/hovers
        actionsPracticePage.hoversLink.click();
//2. Hover over to first image

        actions.moveToElement(actionsPracticePage.hoverImage1).perform();
        Thread.sleep(2000);
//3. Assert: "name: user1" is displayed
        Assert.assertTrue(actionsPracticePage.imageText1.isDisplayed(), "Text1 is not displayed");
//4. Hover over to second image
        actions.moveToElement(actionsPracticePage.hoverImage2).perform();
        Thread.sleep(2000);
//5. Assert: "name: user2" is displayed
        Assert.assertTrue(actionsPracticePage.imageText2.isDisplayed(), "Text2 is not displayed");
//6. Hover over to third image
        actions.moveToElement(actionsPracticePage.hoverImage3).perform();
        Thread.sleep(2000);
//7. Assert: "name: user3" is displayed
        Assert.assertTrue(actionsPracticePage.imageText3.isDisplayed(), "Text3 is not displayed");




    }
//TC#2
    @Test
    public void rightClick() throws InterruptedException {
        //1. Go to https://practice.cydeo.com/
//2. Right click on A/B Testing Link
//        actions.contextClick(actionsPracticePage.abTestingLink).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        actions.contextClick(actionsPracticePage.abTestingLink)
                .sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN)
                //2. Right click on A/B Testing Link, we are doing right click and pressind down two times on link to open tab in new window
                .perform();
        Thread.sleep(2000);
        //3. Open link in new window
//4. Verify title is "No A/B Test"
        Assert.assertEquals(Driver.getDriver().getTitle(),"No A/B Test");
    }


    @Test
    public void scrollingTest(){
//TC#3
//1. Go to https://practice.cydeo.com/
//2. Scroll down to "Cydeo" link
        // to reach from WebDriver interface to JavascriptExecutor interface we have to do downcasting to have access to JS methods
        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());
//3. Scroll up to "Home" Link
        js.executeScript("arguments[0].scrollIntoView(true)",actionsPracticePage.cydeoLink, actionsPracticePage.homeLink);
        BrowserUtils.sleep(3);
        js.executeScript("arguments[1].scrollIntoView(true)",actionsPracticePage.cydeoLink, actionsPracticePage.homeLink);
    }

}



