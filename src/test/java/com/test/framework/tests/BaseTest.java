package com.test.framework.tests;

import com.test.framework.tests.config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;


@ContextConfiguration(classes = {TestConfig.class})
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    WebDriver webDriver;

    @AfterMethod
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
