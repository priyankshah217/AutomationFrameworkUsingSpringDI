package com.test.framework.tests;

import com.test.framework.pages.GoogleHomePage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestAmazonWeb extends BaseTest {
    @Autowired
    private GoogleHomePage googleHomePage;

    @Test
    public void testYahooSample() {
        driver.get("http://www.yahoo.in");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAmazonSample() {
        driver.get("http://www.amazon.in");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
