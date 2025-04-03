package eac.tests;

import com.github.javafaker.Faker;
import eac.pages.JavaFakerPage;
import eac.utilities.BrowserUtils;
import eac.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaFakerTest {

    JavaFakerPage javaFakerPage = new JavaFakerPage();
    Faker faker = new Faker();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @Test
    public void javaFakerTest(){

        //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//3- Login
        javaFakerPage.username.sendKeys("Tester");
        javaFakerPage.password.sendKeys("test");
        javaFakerPage.loginBtn.click();
//4. Click on Order

        javaFakerPage.orderLinkBtn.click();
//5. Select familyAlbum from product, set quantity to 5
        Select select = new Select(javaFakerPage.dropdown);
        select.selectByIndex(1);

        javaFakerPage.quantity.sendKeys(Keys.CONTROL + "a");
        javaFakerPage.quantity.sendKeys(Keys.BACK_SPACE);
        javaFakerPage.quantity.sendKeys("5");
//6. Click to "Calculate" button
        javaFakerPage.calculateBtn.click();
//7. Fill address Info with JavaFaker

        javaFakerPage.customerName.sendKeys(faker.name().firstName());
        javaFakerPage.street.sendKeys(faker.address().streetAddress());
        javaFakerPage.city.sendKeys(faker.address().city());
        javaFakerPage.state.sendKeys(faker.address().state());
        javaFakerPage.zip.sendKeys(faker.address().zipCode().substring(0,5));

//8. Click on "visa" radio button
        javaFakerPage.visaBtn.click();
//9. Generate card number using JavaFaker
        javaFakerPage.cardNo.sendKeys(faker.business().creditCardNumber().replace("-",""));
//10Enter expiration date

        javaFakerPage.expDate.sendKeys(faker.business().creditCardExpiry().substring(0,2) + "/"
        + faker.business().creditCardExpiry().substring(0,2));

//11. Click on "Process"
        javaFakerPage.processBtn.click();

//12.Verify success message "New order has been successfully added." is displayed.
        System.out.println("javaFakerPage.resultTeIt = " + javaFakerPage.resultTeIt.getText());
        Assert.assertEquals(javaFakerPage.resultTeIt.getText(),"New order has been successfully added.");
        BrowserUtils.sleep(5);
        Driver.closeDriver();

    }
}
