package com.test.framework.tests;

import com.test.framework.pages.GoogleHomePage;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestAmazonWeb extends BaseTest {
    @Autowired
    private GoogleHomePage googleHomePage;

    @Test
    public void testYahooSample(){
        driver.get("http://www.yahoo.in");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAmazonSample(){
        driver.get("http://www.amazon.in");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
