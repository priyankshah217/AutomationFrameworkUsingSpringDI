package com.test.framework.tests.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.SimpleThreadScope;

@Configuration
@ComponentScan("com.test.framework")
public class TestConfig {

    @Bean
    public CustomScopeConfigurer newCustomScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        SimpleThreadScope threadScope = new SimpleThreadScope();
        configurer.addScope("thread", threadScope);
        return configurer;
    }

    @Bean
    @Scope(scopeName = "thread")
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }

}
