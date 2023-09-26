package org.ait.herokuapp.tests.brockenImg;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.brockenImg.BrokenImagesPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImageTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBrokenPageImagePage();
    }

    @Test
    public void checkBrokenImages(){
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}
