package com.automation.testObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Parameters;

public class WikiHomePage extends BasePage{

    @FindBy(xpath = "//*[@id='search-form']/fieldset/button")
    private WebElement searchButton;

    @FindBy(id="searchInput")
    private WebElement searchImput;

    @FindBy(linkText = "Español")
    private WebElement linkSpanish;

    public WikiHomePage(WebDriver inDriver, String inPage){
        super(inDriver);
        getDriver().get(inPage);
    }

    @Parameters({"datoBusqueda"})
    public ArticlePage busqueda(String inDato){
        searchImput.sendKeys(inDato);
        getWebWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
        return new ArticlePage(getDriver());
    }

    public ArticlePage entrarWikiEspanol(){
        getWebWait().until(ExpectedConditions.elementToBeClickable(linkSpanish));
        linkSpanish.click();
        return new ArticlePage(getDriver());
    }
}
