package org.ait.herokuapp.pages.alert;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertPage extends BasePage {
    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[onclick='jsAlert()']")
    WebElement jsAlert;
    public AlertPage clickOnAlertButton() {
        click(jsAlert);
        return this;
    }


    public AlertPage acceptAlertWithWaiting() {
        try{

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        } catch (NoAlertPresentException ex){

        }
        return this;
    }

    public AlertPage acceptAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
        }

        return this;
    }

    @FindBy(id = "result")
    WebElement result;
    public AlertPage verifyResult(String text) {
        Assert.assertTrue(shouldHaveTextForAlert(result,text,5));
        return this;
    }

    @FindBy(css = "[onclick='jsConfirm()']")
    WebElement jsConfirmButton;

    public AlertPage clickOnConfirmButton() {
        click(jsConfirmButton);
        return this;
    }

    public AlertPage selectConfirm(String confirm) {
        if (confirm != null && confirm.equalsIgnoreCase("ok")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equalsIgnoreCase("cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(css = "[onclick='jsPrompt()']")
    WebElement promptButton;
    public AlertPage clickOnPromptButton() {
        click(promptButton);
        return this;
    }

    public AlertPage enterMessageToAlert(String message) {
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
        }
        return this;
    }
}
