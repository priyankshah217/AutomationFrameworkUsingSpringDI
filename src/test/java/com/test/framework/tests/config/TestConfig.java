package com.test.framework.tests.config;

import com.test.framework.pages.GoogleHomePage;
import com.test.framework.scope.TestScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackageClasses = TestConfig.class)
public class TestConfig {
    @Bean
    public GoogleHomePage getGoogleHomePage(){
        return new GoogleHomePage();
    }

    @Bean
    @Scope("test")
    public WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        return new FirefoxDriver();
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
