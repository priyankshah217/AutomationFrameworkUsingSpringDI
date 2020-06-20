package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class GoogleHomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement searchTextBox;

    public void enterGoogleSearch() {
//        WebElement searchTextBox = driverFactory.getDriver().findElement(By.name("q"));
        System.out.println("################ Google");
        System.out.println(searchTextBox.isDisplayed());
        searchTextBox.sendKeys("Selenium");
        searchTextBox.sendKeys(Keys.RETURN);
    }
}
