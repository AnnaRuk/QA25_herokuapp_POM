package org.ait.herokuapp.pages.simple;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AbTestingPage extends BasePage {
    public AbTestingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h3")
    WebElement brokenImages;

    public AbTestingPage isTitlePresent(String titleOfPage) {
        Assert.assertTrue(isTextPresent(brokenImages,titleOfPage));
        return this;
    }
}
