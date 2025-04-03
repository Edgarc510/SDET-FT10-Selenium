package eac.tests;

import eac.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium4TestMinimize {

    @Test
    public void minimizeTest() {
        WebDriver driver = new ChromeDriver();

        BrowserUtils.sleep(3);

        driver.manage().window().maximize();

        BrowserUtils.sleep(3);

        driver.manage().window().minimize();

    }

    @Test
    public void changingTabsTest(){

        WebDriver driver = new ChromeDriver();
// driver-manage() window() maximize();
        driver.get("https://www.google.com");
        BrowserUtils.sleep(3);
        driver.get ("https://wwm.etsy.com");
        BrowserUtils.sleep(3);
        driver.switchTo().newWindow(WindowType.WINDOW);
        BrowserUtils.sleep(3);
        driver.get ("https://www.tesla.com");
        BrowserUtils.sleep(3);
        driver.switchTo().newWindow(WindowType.TAB);
        BrowserUtils.sleep(3);
        driver.get("https://www.amazon.com");
    }


}
