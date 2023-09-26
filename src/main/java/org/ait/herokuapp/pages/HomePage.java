package org.ait.herokuapp.pages;

import org.ait.herokuapp.pages.alert.AlertPage;
import org.ait.herokuapp.pages.brockenImg.BrokenImagesPage;
import org.ait.herokuapp.pages.newTab.WindowPage;
import org.ait.herokuapp.pages.simple.AbTestingPage;
import org.ait.herokuapp.pages.simple.DisappearingElementsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Broken Images')]")
    WebElement brokenImages;

    public AbTestingPage getAbTestingPage(){
        click(brokenImages);
        return new AbTestingPage(driver);

    }


    @FindBy(xpath = "//a[contains(text(),'Disappearing Elements')]")
    WebElement disappearingElements;

    public DisappearingElementsPage getDisappearingElementsPage(){
        click(disappearingElements);
        return new DisappearingElementsPage(driver);
    }

    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    WebElement alertPage;
    public AlertPage getAlerts() {
        click(alertPage);
       return new AlertPage(driver);
    }


    @FindBy(xpath = "//a[.='Multiple Windows']")
    WebElement windowLink;
    public WindowPage getMultipleWindows() {
        click(windowLink);
        return new WindowPage(driver);
    }

    @FindBy(xpath = "//a[.='Form Authentication']")
    WebElement formLink;
    public JSExecutor getFormAuthentication() {
click(formLink);
        return new JSExecutor(driver);
    }

    @FindBy(xpath = "//a[.='Broken Images']")
    WebElement getBrokenImages;

    public BrokenImagesPage getBrokenPageImagePage() {
        click(getBrokenImages);
        return new BrokenImagesPage(driver);

    }
}
