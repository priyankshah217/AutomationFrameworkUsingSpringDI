package com.test.framework.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class DriverFactory {

    private static final DriverFactory instance = new DriverFactory();
    ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(ChromeDriver::new);

    static DriverFactory getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void removeDriver() {
        driver.get().quit();
        driver.remove();
    }
}
