package com.test.framework.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class DriverFactory {

    private static final DriverFactory instance = new DriverFactory();
    @Value("${implicit.timeout}")
    private Integer implicitTimeout;
    ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(implicitTimeout, TimeUnit.SECONDS);
        return webDriver;
    });

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
