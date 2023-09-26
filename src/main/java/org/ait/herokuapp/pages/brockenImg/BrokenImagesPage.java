package org.ait.herokuapp.pages.brockenImg;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokenImagesPage extends BasePage {
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "img")
    List<WebElement> images;
    public BrokenImagesPage checkBrokenImages() {
        System.out.println("Total number of images on thr page " + images.size());

        for (int i = 0; i < images.size(); i++) {
            WebElement img = images.get(i);
            String imgUrl = img.getAttribute("src");
            System.out.println("URL of image " + (i + 1) + " is " + imgUrl);
            verifyLinks(imgUrl);

            try {

                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver)
                        .executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth>0);", img);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("**************************************");

                } else {

                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("**************************************");
                }

            } catch (Exception e) {
                System.out.println("ERROR OCCURRED");
            }
        }
        return this;
    }

}
