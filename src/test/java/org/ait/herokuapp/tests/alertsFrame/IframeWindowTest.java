package org.ait.herokuapp.tests.alertsFrame;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.alertsFrameWindows.IframePage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframeWindowTest extends TestBase {

    @BeforeMethod
    public void preconditions(){

        new HomePage(driver).getFramePage();
    }

    @Test
    public void iframesTest(){
        new IframePage(driver).clickIframeButton()
                .returnListOfFrames().switchToIframeByIndex(0);
    }

  @Test
  public void switchToIframeByIdTest(){
       new IframePage(driver).clickIframeButton()
               .switchToIframeById();
  }





}
