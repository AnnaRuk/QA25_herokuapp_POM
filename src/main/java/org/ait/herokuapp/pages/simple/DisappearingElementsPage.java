package org.ait.herokuapp.pages.simple;

import org.ait.herokuapp.pages.BasePage;
import org.ait.herokuapp.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DisappearingElementsPage extends BasePage {
    public DisappearingElementsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(text(),'Disappearing Elements')]")
    WebElement disappearingElements;

    public DisappearingElementsPage isTitlePresentDisElement(String titleOfPage) {
        Assert.assertTrue(shouldHaveTextForAlert(disappearingElements,titleOfPage,10));
        return this;
    }


    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement homeButton;

    public HomePage clickOnButtonHome() {
        click(homeButton);
        return new HomePage(driver);
    }
}
