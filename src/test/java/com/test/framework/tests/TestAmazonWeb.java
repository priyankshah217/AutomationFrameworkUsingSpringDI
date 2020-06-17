package com.test.framework.tests;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.testng.annotations.Test;

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
