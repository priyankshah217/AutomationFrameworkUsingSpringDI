package com.test.framework.pages;

import com.test.framework.util.DriverFactory;
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
}
