package com.test.framework.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.DirtiesContext;

import static java.lang.ThreadLocal.withInitial;

@Component
@DirtiesContext
public class DriverFactory {
//    private DriverFactory() {
//    }
//
//    private static DriverFactory instance;
//
//    public static DriverFactory getInstance() {
//        if (instance == null)
//            instance = new DriverFactory();
//        return instance;
//    }

    protected ThreadLocal<WebDriver> driver = withInitial(ChromeDriver::new);
//public static ThreadLocal<WebDriver> driver =new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    public void removeDriver() {
        driver.get().quit();
        driver.remove();
    }
}
