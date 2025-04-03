package eac.tests;

import eac.pages.DropdownPage;
import eac.utilities.ConfigurationReader;
import eac.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTest extends TestBase{

    DropdownPage dropdownPage = new DropdownPage();
    Select stateSelect;

    //TC#1
//1. Go to http://practice.cydeo.com/dropdown
    @Test
    public void stateSelection() throws InterruptedException {
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");
    //2. Select Illinois -- > select by visible text
        stateSelect = new Select(dropdownPage.selectState);
        stateSelect.selectByVisibleText("Illinois");
        Thread.sleep(3000);
        String actualState = stateSelect.getFirstSelectedOption().getText();
        System.out.println("actualState = " + actualState);
        String expectedState = "Illinois";
        System.out.println("expectedState = " + expectedState);
        Assert.assertEquals(actualState,expectedState);
        //3. Select Virginia -- > select by value
        stateSelect.selectByValue("VA");
        String actualVAState = stateSelect.getFirstSelectedOption().getText();
        System.out.println("actualVAState = " + actualVAState);
        String expectedVAState = "Virginia";
        System.out.println("expectedVAState = " + expectedVAState);
        Assert.assertEquals(actualState,expectedState);
//4. Select California -- > select by index (Index starts at 1)
        stateSelect.selectByIndex(5);
        Thread.sleep(3000);
        String actualCAState = stateSelect.getFirstSelectedOption().getText();
        System.out.println("actualCAState = " + actualCAState);
        String expectedCAState = "California";
        System.out.println("expectedCAState = " + expectedCAState);
//5. Verify final selected option is California.
        Assert.assertEquals(actualState,expectedState);
    }


//TC#2
    @Test
    public void selectDate() throws InterruptedException {
        //Select "December 1st, 1950g" and verify it is selected.
//1. Go to http://practice.cydeo.com/dropdown
//        Driver.getDriver().get(ConfigurationReader.getProperty("cydeo.url"));
        Select dateSelect = new Select(dropdownPage.yearDropdown);
//2. Select Year -- > by visible text
        dateSelect.selectByVisibleText("1950");
        System.out.println("year = " + dateSelect.getFirstSelectedOption().getText());
        String actual = dateSelect.getFirstSelectedOption().getText();
        String expected = "1950";
        Assert.assertEquals(actual,expected,"Year does not match");
//3. Select Month -- > by value
        Select monthSelect = new Select(dropdownPage.monthDropdown);
        monthSelect.selectByValue("11");
        System.out.println("Month = " + monthSelect.getFirstSelectedOption().getText());
//4. Select Day -- > by index
        Select daySelect = new Select(dropdownPage.dayDropdown);
        daySelect.selectByIndex(23);
        System.out.println("day = " + daySelect.getFirstSelectedOption().getText());
        Thread.sleep(4000);
    }
//TC#3
    @Test
    public void selectLanguage() throws InterruptedException {
//1.Go to http://practice.cydeo.com/dropdown
//2. Select all the options from multiple language select dropdown.
        Select languageSelect = new Select(dropdownPage.languagesDropdown);
        List<WebElement> allLanguages = languageSelect.getOptions();
//3. Print out all selected values and verify each is selected
        for (WebElement allLanguage : allLanguages) {
            System.out.println("language selected = " + allLanguage.getText());
            languageSelect.selectByVisibleText(allLanguage.getText());
            Thread.sleep(3000);
            Assert.assertTrue(allLanguage.isSelected());
        }

        //4.Deselect all values and verify each is deselected.
        languageSelect.deselectAll();
        for (WebElement eachDeselected: languageSelect.getOptions()){// instead of using for each we can use get options method directly
            Assert.assertFalse(eachDeselected.isSelected());
        }




    }

}
