package org.ait.herokuapp.tests.simple;

import org.ait.herokuapp.pages.simple.DisappearingElementsPage;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisElementsPageTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDisappearingElementsPage();

    }

    @Test
    public void test(){
        new DisappearingElementsPage(driver)
                .isTitlePresentDisElement("Disappearing Elements")
                .clickOnButtonHome();
    }
}
