package org.ait.herokuapp.pages.widgets;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }




    @FindBy(tagName = "input")
    WebElement sliderContainer;
    public SliderPage moveSliderInHorizontalDirection() {
        new Actions(driver).dragAndDropBy(sliderContainer,75, 0).perform();
        return this;
    }

    //TODO
    @FindBy(id = "range")
    WebElement range;
    public SliderPage assertSliderValue(String number) {
        String expected = number;
        String actual = range.getText();
        Assert.assertEquals(expected,actual);
        return this;
    }

}
