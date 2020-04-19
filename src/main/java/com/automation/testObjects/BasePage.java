package com.automation.testObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait webWait;

    public BasePage(WebDriver inDriver) {
        PageFactory.initElements(inDriver,this); // Y esto con que se come?
        webWait = new WebDriverWait(inDriver,10);
        driver = inDriver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void dispose() {
        if (driver != null)
            driver.quit();
    }

    public WebDriverWait getWebWait() {
        return webWait;
    }

    private List getPageLinks(){
        List allLinks = driver.findElements(By.tagName("a"));
        return allLinks;
    }

    public BasePage entrarAPrimerLink(){
        List<WebElement> links = getPageLinks();
        for (WebElement forElement :links
             ) {
            if(forElement.isDisplayed()) {
                System.out.println(forElement.getText());
                System.out.println(forElement.getAttribute("href"));
                //getWebWait().until(ExpectedConditions.elementToBeClickable(forElement));
                //forElement.click();
                break;
            }
        }
        return this;
    }
}