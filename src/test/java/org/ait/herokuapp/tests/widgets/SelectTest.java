package org.ait.herokuapp.tests.widgets;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.widgets.DropdownListPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdownListPage();
    }

    @Test
    public void selectOnDropdownListTest(){
        new DropdownListPage(driver).standardMultiSelect(0);
    }
    @Test
    public void multiSelectTest1(){
        new DropdownListPage(driver).multiSelect(new String[]{"Option 1","Option 2"});
    }
}
