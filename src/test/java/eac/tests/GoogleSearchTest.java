package eac.tests;

import eac.pages.GoogleSearchPage;
import eac.utilities.ConfigurationReader;
import eac.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleSearchTest {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Test
    public void searchForGoogle() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        googleSearchPage.searchBox.sendKeys("Apple" + Keys.ENTER);
//        Assert.assertEquals(Driver.getDriver().getTitle(),"apple - Google Search");
    }

    @Test
    public void softAssertionsTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        googleSearchPage.searchBox.sendKeys("Apple" + Keys.ENTER);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Driver.getDriver().getTitle(),"apple - Google Search");
        softAssert.assertAll();
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Driver.closeDriver();
    }


}
