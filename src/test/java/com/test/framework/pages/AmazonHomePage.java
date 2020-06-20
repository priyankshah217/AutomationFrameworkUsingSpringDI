package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class AmazonHomePage extends BasePage {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    public void enterAmazonSearch() {
//        WebElement searchTextBox = driverFactory.getDriver().findElement(By.id("twotabsearchtextbox"));
        System.out.println("################ Amazon");
        System.out.println(searchTextBox.isDisplayed());
        searchTextBox.sendKeys("Computer");
        searchTextBox.sendKeys(Keys.RETURN);
    }


}
