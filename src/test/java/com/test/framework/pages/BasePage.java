package com.test.framework.pages;

import com.test.framework.lib.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {

    @Autowired
    protected DriverFactory driverFactory;

    public void launchURL(String url) {
        driverFactory.getDriver().get(url);
    }

    protected void hardWait() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected boolean isElementPresent(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (NoSuchElementException | TimeoutException ex) {
            return false;
        }
    }
}
