package com.test.framework.tests.config;

import com.test.framework.pages.AmazonHomePage;
import com.test.framework.pages.GoogleHomePage;
import com.test.framework.scope.TestScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

    @Bean
    @Scope("test")
    public GoogleHomePage getGoogleHomePage() {
        return new GoogleHomePage();
    }

    @Bean
    @Scope("test")
    public AmazonHomePage getAmazonHomePage() {
        return new AmazonHomePage();
    }

    @Bean
    @Scope("test")
    public WebDriver getDriver() throws MalformedURLException {
        webDriver = new FirefoxDriver();
        return webDriver;
    }

    @Bean
    public TestScope testScope() {
        return new TestScope();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer scopeConfigure = new CustomScopeConfigurer();
        Map<String, Object> scopes = new HashMap<>();
        scopes.put("test", testScope());
        scopeConfigure.setScopes(scopes);
        return scopeConfigure;
    }
}
