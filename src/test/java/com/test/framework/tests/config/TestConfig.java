package com.test.framework.tests.config;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import com.test.framework.scope.TestScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackageClasses = TestConfig.class)
public class TestConfig {
    private WebDriver webDriver;
    private GoogleHomePage googleHomePage;
    private AmazonHomePage amazonHomePage;

    @Bean
    @Scope("test")
    public GoogleHomePage getGoogleHomePage() {
        googleHomePage = new GoogleHomePage();
        PageFactory.initElements(webDriver, googleHomePage);
        return googleHomePage;
    }

    @Bean
    @Scope("test")
    public AmazonHomePage getAmazonHomePage() {
        amazonHomePage = new AmazonHomePage();
        PageFactory.initElements(webDriver, amazonHomePage);
        return amazonHomePage;
    }

    @Bean
    @Scope("test")
    public WebDriver getDriver() throws MalformedURLException {
        webDriver = new ChromeDriver();
        return webDriver;
    }

    @Bean
    public TestScope testScope() {
        return new TestScope();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        TestScope testScope = testScope();
        CustomScopeConfigurer scopeConfigure = new CustomScopeConfigurer();
        Map<String, Object> scopes = new HashMap<>();
        scopes.put("test", testScope);
        scopeConfigure.setScopes(scopes);
        return scopeConfigure;
    }
}
