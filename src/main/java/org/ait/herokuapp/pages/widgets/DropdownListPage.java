package org.ait.herokuapp.pages.widgets;

import org.ait.herokuapp.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownListPage extends BasePage {

    public DropdownListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;


    public DropdownListPage selectOldStyle(String option) {
        Select select = new Select(dropdown);
        select.deselectByVisibleText(option);
        System.out.println(select.getFirstSelectedOption().getText() + " is first <Option 1>");

        System.out.println("*****************************");

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());

        }
        return this;
    }

    public DropdownListPage standardMultiSelect(int i) {
        Select select = new Select(dropdown);

        if (select.isMultiple()) {
            select.selectByIndex(i);
        }
        return this;
    }

    @FindBy(css = "html")
    WebElement space;
    public DropdownListPage multiSelect(String[] options) {
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null) {
                click(dropdown);
                driver.findElement(By.xpath(String.format("//*[text()='%s']", options[i]))).click();

            }
            click(space);
        }
        return this;

    }
}
