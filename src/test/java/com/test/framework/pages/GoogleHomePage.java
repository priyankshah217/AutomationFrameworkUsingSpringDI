package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class GoogleHomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement searchTextbox;

    public void enterGoogleSearch() {
        hardWait();
        searchTextbox.sendKeys("Selenium");
        searchTextbox.sendKeys(Keys.RETURN);
    }

}
