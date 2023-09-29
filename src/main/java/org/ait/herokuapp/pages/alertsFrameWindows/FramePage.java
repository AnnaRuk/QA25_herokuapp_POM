package org.ait.herokuapp.pages.alertsFrameWindows;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage {


    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement iframes2;

    public FramePage clickIframeButton(){
        click(iframes2);
        return this;
    }


    @FindBy(tagName = "iframe")
    List<WebElement> iframes;
    public FramePage returnListOfFrames() {
        System.out.println("Total numbers iframes is" + iframes.size());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOgIframes = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("The total numbers of iframes: " + numberOgIframes);
        return this;
    }

    @FindBy(id = "mce_0_ifr")
    WebElement iFrame;

    public FramePage switchToIframeById() {
        driver.switchTo().frame(iFrame);
        System.out.println("Text of the iframe: " + iFrame.getText());


        return this;
    }
    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    WebElement iFrameOne;

    @FindBy(tagName = "p")
    WebElement text;

    public FramePage switchToIframeByIndex(int index) {
       driver.switchTo().frame(index);
       isTextPresent(text, "Your content goes here.");
        return this;
    }
}
