package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@PageObject
public class AmazonHomePage extends BasePage {

    public void enterAmazonSearch() {
        WebElement searchTextBox = driverFactory.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchTextBox.sendKeys("Computer");
        searchTextBox.sendKeys(Keys.RETURN);
    }


}
