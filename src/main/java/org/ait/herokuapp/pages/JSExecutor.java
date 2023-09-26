package org.ait.herokuapp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JSExecutor extends BasePage{
 JavascriptExecutor js;
    public JSExecutor(WebDriver driver) {
        super(driver);
        js=(JavascriptExecutor) driver;
    }

    public JSExecutor enterDataWithJSE(String userName, String userPassword) {
        if(userName != null && userPassword != null){
            js.executeScript("document.getElementById('username').value='"+userName+"'");
            js.executeScript("document.getElementById('password').value='"+userPassword+"'");
            js.executeScript("document.getElementById('password').style.border='3px solid red'");
        }
        return this;
    }

    public JSExecutor clickOnLoginButtonWithJSE() {
        js.executeScript("document.querySelector('.radius').click();");
        return this;
    }

    public JSExecutor checkURLWithJSE() {
        String URL =  js.executeScript("return document.URL;").toString();
        System.out.println("URL if the site: " + URL);
        return this;
    }
}
