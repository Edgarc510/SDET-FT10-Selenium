package eac.tests;

import eac.pages.RadioButtonPage;
import eac.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.TreeMap;

public class RadioButtonTest{

    RadioButtonPage radioButtonPage = new RadioButtonPage();
    @Test
    public void radioButtonTest() throws InterruptedException {
        //TC #1:radio buttons
//1.60 TO: http://practice.cydeo.com/radio buttons
        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons");
//2. Confirm radio button #Blue is selected by default
        Assert.assertTrue(radioButtonPage.blueButton.isSelected(),"Button is not selected");;
//3. Confirm radio button #Football is NOT selected by default
        Assert.assertFalse(radioButtonPage.footballButton.isSelected());
//4. Click radio button #Football to select it.
        Thread.sleep(2000);
        radioButtonPage.footballButton.click();
//5. Verify radio button #Football is selected.
        Assert.assertTrue(radioButtonPage.footballButton.isSelected());
//6. Click radio button #Red to select it.
        Thread.sleep(2000);
        radioButtonPage.redButton.click();
//7. Verify radio button #Red is selected.
//8. Verify radio button #Blue is not selected.
        Thread.sleep(2000);
        Assert.assertFalse(radioButtonPage.blueButton.isSelected());
//9. Verify radio button #Green is not Enabled.
        System.out.println(radioButtonPage.greenButton.isEnabled());
        Assert.assertFalse(radioButtonPage.greenButton.isEnabled());

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        Driver.closeDriver();
    }



}
