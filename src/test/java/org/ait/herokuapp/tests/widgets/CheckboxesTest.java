package org.ait.herokuapp.tests.widgets;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.widgets.CheckboxesPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getCheckboxesPage();
    }

    @Test
    public void checkboxesTest(){
        new CheckboxesPage(driver).checkCheckboxes();
    }



}
