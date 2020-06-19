package com.test.framework.tests;

import com.test.framework.tests.config.TestConfig;
import com.test.framework.util.DriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestConfig.class})
public class BaseTest {

    @Autowired
    private DriverFactory driverFactory;

    @AfterEach
    public void tearDown() {
        driverFactory.removeDriver();
    }
}
