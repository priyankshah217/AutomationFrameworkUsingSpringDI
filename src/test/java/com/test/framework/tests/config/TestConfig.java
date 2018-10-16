package com.test.framework.tests.config;

import com.test.framework.pages.GoogleHomePage;
import com.test.framework.scope.TestScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackageClasses = TestConfig.class)
public class TestConfig {
    @Bean
    public GoogleHomePage getGoogleHomePage() {
        return new GoogleHomePage();
    }

    @Bean
    @Scope("test")
    public WebDriver getFirefoxDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
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
