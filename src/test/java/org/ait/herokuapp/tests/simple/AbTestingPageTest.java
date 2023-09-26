package org.ait.herokuapp.tests.simple;

import org.ait.herokuapp.pages.simple.AbTestingPage;
import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AbTestingPageTest extends TestBase {


    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAbTestingPage();

    }

    @Test
    public void test(){
        new AbTestingPage(driver).isTitlePresent("Broken Images");

    }
}
