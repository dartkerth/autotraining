package com.automation.testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ArticlePage extends BasePage{

    public ArticlePage(WebDriver inDriver){
        super(inDriver);
    }

    @FindBy(id = "firstHeading")
    private WebElement pageId;

    public String getPageId(){
        return pageId.getText();
    }

    public ArticlePage getPageForFirstLink(){
        return (ArticlePage) entrarAPrimerLink();
    }

    public void testHandle(){
        System.out.println(getDriver().getWindowHandles());
    }

}
