package com.test.framework.pages;

import com.test.framework.annotations.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class GoogleHomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement searchTextbox;

    public void enterGoogleSearch() {
        hardWait();
//        WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 30);
//        wait.until(ExpectedConditions.elementToBeClickable(driverFactory.getDriver().findElement(By.name("q")))).sendKeys("Selenium");
        System.out.println(isElementPresent(searchTextbox));
        searchTextbox.sendKeys("Selenium");
        searchTextbox.sendKeys(Keys.RETURN);
//
//        webDriver.findElement(By.id("lst-ib")).sendKeys("Selenium");
//        webDriver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
    }

}
