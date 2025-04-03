package eac.tests;

import eac.pages.UploadFilePage;
import eac.utilities.BrowserUtils;
import eac.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest {

    UploadFilePage uploadFilePage = new UploadFilePage();
    @Test
    public void uploadFileTest(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        uploadFilePage.chooseFile.sendKeys("C:\\Users\\ceale\\Downloads\\some-file.txt");
        uploadFilePage.fileSubmit.click();
        Assert.assertEquals(uploadFilePage.fileUploadText.getText(), "File Uploaded!");
        BrowserUtils.sleep(6);


    }
}
