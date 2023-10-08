package org.ait.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

public abstract class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click(WebElement element){
        element.click();
    }

    public void type(WebElement element, String text){
        if(text != null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
// all text
    public boolean shouldHaveTextForAlert(WebElement element, String text, int time){
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }
//part of texts
    public boolean isTextPresent(WebElement element, String book){
        return  element.getText().contains(book);
    }


    public void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            //create connection an get status cod
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.disconnect();
            //get response status code
            if(connection.getResponseCode()>=400){
                System.out.println(linkUrl + " - " + connection.getResponseMessage() + " is a broken link");
            } else {
                System.out.println(linkUrl + " - " + connection.getResponseMessage());
            }
        } catch (Exception ex) {
            System.out.println(linkUrl + " - " + ex.getMessage() + " is a broken link");
        }


    }

    public void pause(int millis){

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
