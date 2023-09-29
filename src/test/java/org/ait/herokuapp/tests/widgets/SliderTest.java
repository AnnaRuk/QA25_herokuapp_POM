package org.ait.herokuapp.tests.widgets;

import org.ait.herokuapp.pages.HomePage;
import org.ait.herokuapp.pages.widgets.SliderPage;
import org.ait.herokuapp.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getSliderPage();

    }


    @Test
    public void sliderTest(){
        new SliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderValue("5");
    }


}
