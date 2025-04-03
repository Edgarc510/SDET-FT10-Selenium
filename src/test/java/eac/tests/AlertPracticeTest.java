package eac.tests;

import com.beust.ah.A;
import eac.pages.JavaAlertsPage;
import eac.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class AlertPracticeTest extends TestBase{

    JavaAlertsPage javaAlertsPage = new JavaAlertsPage();

    @Test
    public void alertsTesting() throws InterruptedException {
        //1. Go to website: http://practice.cydeo.com/javascript alerts
//2. Click for JS Prompt button for alert to be displayed
        javaAlertsPage.jsPrompt.click();
        Thread.sleep(2000);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        Thread.sleep(2000);
        alert.accept();
        String actualText = javaAlertsPage.result.getText();
        System.out.println("actualText = " + actualText);
//3. Write "hello" in input text
//3. CLick OK button from the alert
//4. Verify "You entered: hello" text is displayed in result
    }


}
