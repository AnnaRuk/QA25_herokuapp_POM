package org.ait.herokuapp.tests.alertsFrame;

import org.ait.herokuapp.pages.alertsFrameWindows.AlertPage;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

@BeforeMethod
    public void preconditions(){
    new HomePage(driver).getAlerts();
}

@Test
    public void acceptAlert(){
    new AlertPage(driver).clickOnAlertButton()
            .acceptAlert()
            .verifyResult("You successfully clicked an alert");
}

    @Test
    public void confirmAlertTest(){
        new AlertPage(driver).clickOnConfirmButton()
                .selectConfirm("cancel")
                .verifyResult("cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        //click on the button Click for JS Prompt
        //enter 'Hello World!!!'
        //click on OK
        //assert text result 'Hello World!!!'
        new AlertPage(driver).clickOnPromptButton()
                .enterMessageToAlert("Hello World!!!")
                .acceptAlert()
                .verifyResult("Hello World!!!");
    }

}
