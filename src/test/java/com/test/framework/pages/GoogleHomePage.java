package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@PageObject
public class GoogleHomePage extends BasePage {

    public void enterGoogleSearch() {
        WebElement searchTextBox = driverFactory.getDriver().findElement(By.name("q"));
        searchTextBox.sendKeys("Selenium");
        searchTextBox.sendKeys(Keys.RETURN);
    }
}
