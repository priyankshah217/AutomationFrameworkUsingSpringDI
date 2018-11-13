package com.test.framework.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {
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
}
