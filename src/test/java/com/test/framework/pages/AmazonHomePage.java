package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class AmazonHomePage extends BasePage {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement amazonSearchTextbox;

    public void enterAmazonSearch() {
        hardWait();
//        amazonSearchTextbox.sendKeys("Computer");
//        amazonSearchTextbox.sendKeys(Keys.RETURN);
//
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
    }


}
