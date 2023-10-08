package org.ait.herokuapp.pages;

import org.ait.herokuapp.pages.alertsFrameWindows.AlertPage;
import org.ait.herokuapp.pages.alertsFrameWindows.IframePage;
import org.ait.herokuapp.pages.alertsFrameWindows.NestedFramePage;
import org.ait.herokuapp.pages.brockenImg.BrokenImagesPage;
import org.ait.herokuapp.pages.newTab.WindowPage;
import org.ait.herokuapp.pages.simple.AbTestingPage;
import org.ait.herokuapp.pages.simple.DisappearingElementsPage;
import org.ait.herokuapp.pages.upload.FileUploadPage;
import org.ait.herokuapp.pages.widgets.CheckboxesPage;
import org.ait.herokuapp.pages.widgets.DropdownListPage;
import org.ait.herokuapp.pages.widgets.SliderPage;
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

    @FindBy(xpath = "//a[.='Frames']")
    WebElement frames;

    public IframePage getFramePage() {
        click(frames);
        return new IframePage(driver);
    }

    @FindBy(xpath = "//a[.='Horizontal Slider']")
    WebElement slider;

    public SliderPage getSliderPage() {
        click(slider);
        return new SliderPage(driver);
    }


    public NestedFramePage getNestedFramePage() {
        click(frames);
        return new NestedFramePage(driver);
    }


    @FindBy(xpath = "//a[.='Dropdown']")
    WebElement dropdownList;
    public DropdownListPage getDropdownListPage() {
         click(dropdownList);
        return new DropdownListPage(driver);
    }

    @FindBy(xpath = "//a[.='File Upload']")
    WebElement uploadFile;
    public FileUploadPage getFileUploadPage() {
      click(uploadFile);
        return new FileUploadPage(driver);
    }



    @FindBy(xpath = "//a[.='Checkboxes']")
    WebElement checkboxes;
    public CheckboxesPage getCheckboxesPage() {
click(checkboxes);
        return new CheckboxesPage(driver);
    }
}
