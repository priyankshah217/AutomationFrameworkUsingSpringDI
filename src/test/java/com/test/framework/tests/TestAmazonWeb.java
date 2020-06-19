package com.test.framework.tests;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class TestAmazonWeb extends BaseTest {

    @Value("${amazon.url}")
    private String amazonUrl;

    @Value("${google.url}")
    private String googleUrl;

    @Autowired
    private GoogleHomePage googleHomePage;

    @Autowired
    private AmazonHomePage amazonHomePage;

    @Test
    public void testGoogleSample() {
        googleHomePage.launchURL(googleUrl);
        googleHomePage.enterGoogleSearch();
    }

    @Test
    public void testAmazonSample() {
        amazonHomePage.launchURL(amazonUrl);
        amazonHomePage.enterAmazonSearch();
    }
}
