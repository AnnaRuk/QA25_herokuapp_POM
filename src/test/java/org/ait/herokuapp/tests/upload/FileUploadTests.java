package org.ait.herokuapp.tests.upload;

import org.ait.herokuapp.data.UserData;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.upload.FileUploadPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getFileUploadPage();
    }

    @Test
    public void uploadFileTest(){
        new FileUploadPage(driver).uploadFile(UserData.FILE)
                .assertUploadFile();
    }

    @Test
    public void uploadFileAndCheckNameTest(){
        new FileUploadPage(driver).uploadFile(UserData.FILE)
                .assertCorrectFileName(UserData.FILE_NAME);
    }

}
