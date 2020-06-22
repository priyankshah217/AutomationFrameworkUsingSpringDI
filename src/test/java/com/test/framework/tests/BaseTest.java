package com.test.framework.tests;

import com.test.framework.pages.BasePage;
import com.test.framework.tests.config.TestConfig;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.IHookCallBack;
import org.testng.ITestResult;

@ContextConfiguration(classes = {TestConfig.class})
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Override
    public void run(@NotNull IHookCallBack callBack, ITestResult testResult) {
        String msg = "[BeforeTestExecution] Commencing to run " + testResult.getMethod().getQualifiedName()
                     + "() on thread " + Thread.currentThread().getId();
        System.err.println(msg);
        WebDriver driver = applicationContext.getBean(WebDriver.class);
        super.run(callBack, testResult);
        driver.quit();
    }

    public final <T extends BasePage> T getPage(Class<T> type) {
        return this.applicationContext.getBean(type);
    }

}
