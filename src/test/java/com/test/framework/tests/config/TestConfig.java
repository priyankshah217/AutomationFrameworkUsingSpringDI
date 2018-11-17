package com.test.framework.tests.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;

@Configuration
@ComponentScan("com.test.framework")
public class TestConfig {

    @Bean
    public WebDriver getDriver() throws MalformedURLException {
        return new ChromeDriver();
    }
}
