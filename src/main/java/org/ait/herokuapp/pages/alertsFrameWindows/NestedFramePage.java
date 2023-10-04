package org.ait.herokuapp.pages.alertsFrameWindows;

import org.ait.herokuapp.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class NestedFramePage extends HomePage {
    public NestedFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Nested Frames')]")
    WebElement nestedFrames;
    public NestedFramePage clickOnNestedFramesButton() {
        click(nestedFrames);
        return this;
    }


    @FindBy(tagName = "frameset")
    List<WebElement> frameset;

    @FindBy(tagName = "frame")
    List<WebElement> frame;



    @FindBy(xpath = "//frame[contains(@src, '/frame_left')]")
    WebElement frameLeft;

    @FindBy(xpath = "//frame[contains(@src, '/frame_top')]")
    WebElement frameTop;


    public NestedFramePage handleNestedFrames() {
        System.out.println("The total numbers frames: " + frame.size());
        System.out.println("The frameset: " + frameset.size());
        driver.switchTo().parentFrame().getTitle();
        //[src='/frame_top']
        driver.switchTo().frame(frameTop);
        //[src='/frame_left']
        driver.switchTo().frame(frameLeft);
        return this;
    }
    @FindBy(tagName = "body")
    WebElement body; ///text LEFT
    public NestedFramePage assertOnLeftFrame() {
        System.out.println("TEXT " + body.getText());
        //        isTextPresent(textLeft, "LEFT");
        Assert.assertEquals(body.getText(),"LEFT");
        //exit
        driver.switchTo().parentFrame();
        return this;
    }
}
