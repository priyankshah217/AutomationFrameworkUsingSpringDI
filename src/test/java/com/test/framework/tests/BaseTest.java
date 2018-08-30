package com.test.framework.tests;

import com.test.framework.listeners.SeleniumTestListener;
import com.test.framework.tests.config.TestConfig;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@TestExecutionListeners(listeners = {SeleniumTestListener.class, DependencyInjectionTestExecutionListener.class})
public class BaseTest {
    @Autowired
    WebDriver driver;


    @After
    public void tearDown() {
        driver.quit();
    }
}
