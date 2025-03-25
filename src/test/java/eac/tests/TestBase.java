package eac.tests;

import eac.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        Driver.closeDriver();
    }
}
