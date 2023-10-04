package org.ait.herokuapp.pages.alertsFrameWindows;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IframePage extends BasePage {


    public IframePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'iFrame')]")
    WebElement iframes2;

    public IframePage clickIframeButton(){
        click(iframes2);
        return this;
    }


    @FindBy(tagName = "iframe")
    List<WebElement> iframes;
    public IframePage returnListOfFrames() {
        //1. == 1
        System.out.println("1. Total numbers iframes is " + iframes.size());
        //2. == 1
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOgIframes = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("2. The total numbers of iframes: " + numberOgIframes);
        return this;
    }

    @FindBy(id = "mce_0_ifr")
    WebElement iFrame;

    @FindBy(tagName = "h3")
    WebElement textDefaultContent;

    public IframePage switchToIframeById() {
        driver.switchTo().frame(iFrame);
        System.out.println("Text: " + text.getText());
        driver.switchTo().defaultContent();
        System.out.println("Text: " + textDefaultContent.getText());
        return this;
    }
    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    WebElement iFrameOne;

    @FindBy(tagName = "p")
    WebElement text;

    public IframePage switchToIframeByIndex(int index) {
       driver.switchTo().frame(index);
        System.out.println("Text: " + text.getText());
       isTextPresent(text, "Your content goes here.");
        return this;
    }



}
