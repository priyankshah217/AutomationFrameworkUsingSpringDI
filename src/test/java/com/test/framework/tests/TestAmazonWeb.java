package com.test.framework.tests;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import org.springframework.test.annotation.DirtiesContext;
import org.testng.annotations.Test;

public class TestAmazonWeb extends BaseTest {

    @Test
    @DirtiesContext
    public void testGoogleSample() {
        GoogleHomePage googleHomePage = getPage(GoogleHomePage.class);
        googleHomePage.launchURL("http://www.google.com");
        googleHomePage.enterGoogleSearch();
    }

    @Test
    @DirtiesContext
    public void testAmazonSample() {
        AmazonHomePage amazonHomePage = getPage(AmazonHomePage.class);
        amazonHomePage.launchURL("http://www.amazon.in");
        amazonHomePage.enterAmazonSearch();
    }
}
