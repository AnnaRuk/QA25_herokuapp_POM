package org.ait.herokuapp.pages.widgets;

import org.ait.herokuapp.pages.BasePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage {
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    private static final String[] CHECKBOXES = {"checkbox 1", "checkbox 2"};


    @FindBy(xpath = "//input[1]")
    WebElement checkboxOne;

    @FindBy(xpath = "//input[2]")
    WebElement checkboxTwo;

    public CheckboxesPage checkCheckboxes() {
        for (String checkbox : CHECKBOXES) {
            pause(1000);
            if (checkbox.equals("checkbox 1")) {
                click(checkboxOne);
            }
            pause(1000);
            if (checkbox.equals("checkbox 2")) {
                click(checkboxTwo);
            }

        }
        return this;
    }
}
