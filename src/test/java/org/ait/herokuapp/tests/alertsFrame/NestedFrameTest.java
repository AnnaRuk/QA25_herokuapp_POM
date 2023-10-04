package org.ait.herokuapp.tests.alertsFrame;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.alertsFrameWindows.NestedFramePage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFrameTest extends TestBase {

    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getNestedFramePage();

    }
    @Test
    public void handleNestedFramesTest(){
        new NestedFramePage(driver).clickOnNestedFramesButton()
                .handleNestedFrames()
                .assertOnLeftFrame();
    }


}
