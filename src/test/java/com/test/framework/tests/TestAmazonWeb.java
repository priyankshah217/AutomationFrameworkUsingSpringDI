package com.test.framework.tests;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;


public class TestAmazonWeb extends BaseTest {
    @Autowired
    private GoogleHomePage googleHomePage;

    @Autowired
    private AmazonHomePage amazonHomePage;

    @Test
    @DirtiesContext
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
