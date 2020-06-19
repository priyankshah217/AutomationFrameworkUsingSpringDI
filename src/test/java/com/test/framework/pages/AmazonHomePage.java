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
        WebElement searchTextBox = driverFactory.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchTextBox.sendKeys("Computer");
        searchTextBox.sendKeys(Keys.RETURN);

//        amazonSearchTextbox.sendKeys("Computer");
//        amazonSearchTextbox.sendKeys(Keys.RETURN);
    }


}
