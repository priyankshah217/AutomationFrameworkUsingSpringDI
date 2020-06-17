package com.test.framework.tests.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.test.framework")
public class TestConfig {

  WebDriver webDriver;

  @Bean
  @Scope(scopeName = "prototype")
  public WebDriver getDriver() {
    if (webDriver == null || ((ChromeDriver) webDriver).getSessionId() == null) {
      webDriver = new ChromeDriver();
      return webDriver;
    }
    return webDriver;
  }
}
