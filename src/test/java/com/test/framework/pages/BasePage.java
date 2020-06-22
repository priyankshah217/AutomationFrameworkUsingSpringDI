package com.test.framework.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class BasePage implements IWebDriverAware {
    @Autowired
    protected WebDriver webDriver;

    public void launchURL(String url) {
        webDriver.get(url);
    }

    protected void hardWait() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public WebDriver getWebDriver() {
        return webDriver;
    }

}
