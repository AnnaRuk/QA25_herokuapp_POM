package org.ait.herokuapp.tests.newTab;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.newTab.WindowPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase {

//click on Multyple Windows link

    //click on Click here link and switch to new tab
    //assert New tab

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getMultipleWindows();

    }

    @Test
    public void switchToNewTabTest(){
        new WindowPage(driver).switchToNewTab(1)
                .verifyNewTitle("New Window");
    }
}
