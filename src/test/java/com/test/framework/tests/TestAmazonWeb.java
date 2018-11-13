package com.test.framework.tests;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestAmazonWeb extends BaseTest {
    @Autowired
    private GoogleHomePage googleHomePage;

    @Autowired
    private AmazonHomePage amazonHomePage;

    @Test
    public void testGoogleSample() {
        googleHomePage.launchURL("http://www.google.com");
        googleHomePage.enterGoogleSearch();
    }

    @Test
    public void testAmazonSample() {
        amazonHomePage.launchURL("http://www.amazon.in");
        amazonHomePage.enterAmazonSearch();
    }
}
