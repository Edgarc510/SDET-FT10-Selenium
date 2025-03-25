package eac.tests;

import eac.pages.CheckBoxPage;
import eac.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CheckBoxTest {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    //TC #1:checkboxes
//1. Go to http://practice.cydeo.com/checkboxes
    @Test
    public void checkBoxTest() {
        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");
        //3. Confirm checkbox #2 is SELECTED by default.
        Assert.assertTrue(checkBoxPage.box2.isSelected());
        System.out.println("is selected? : " + checkBoxPage.box2.isSelected());
        //4. Click checkbox #1 to select it.
        checkBoxPage.box1.click();
        //5. Click checkbox #2 to deselect it.
        checkBoxPage.box2.click();
        //6. Confirm checkbox #1 is SELECTED.
        Assert.assertTrue(checkBoxPage.box1.isSelected());
        //7. Confirm checkbox #2 is NOT selected.
        Assert.assertFalse(checkBoxPage.box2.isSelected());


    }

    //2. Confirm checkbox #1 is NOT selected by default

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }
}
