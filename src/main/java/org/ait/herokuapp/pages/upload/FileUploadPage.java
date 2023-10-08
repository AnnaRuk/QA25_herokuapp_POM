package org.ait.herokuapp.pages.upload;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement fileUpload;

    @FindBy(id = "file-submit")
    WebElement fileSubmit;

    public FileUploadPage uploadFile(String file) {
      fileUpload.sendKeys(file);
      click(fileSubmit);
        return this;
    }

    @FindBy(id = "uploaded-files")
    WebElement uploadedFilesInput;

    @FindBy(xpath = "//h3[contains(text(),'File Uploaded!')]")
    WebElement fileUploaded;

    public FileUploadPage assertUploadFile() {
        Assert.assertTrue(isTextPresent(fileUploaded,"File Uploaded!"));
        return this;
    }


    public FileUploadPage assertCorrectFileName(String fileName) {
        Assert.assertEquals(uploadedFilesInput.getText(),fileName);
        return this;
    }
}
