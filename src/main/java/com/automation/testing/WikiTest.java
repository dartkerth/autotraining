package com.automation.testing;

import com.automation.testObjects.ArticlePage;
import com.automation.testObjects.WikiHomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class WikiTest extends BaseTest{

    @Test(groups = {"wiki1"})
    @Parameters({"datoBusqueda"})
    public void testWikiSearch(String inSearchText){
        WikiHomePage home = getLandingPage();
        ArticlePage articlePage = home.busqueda(inSearchText);
        Assert.assertEquals(articlePage.getPageId(),inSearchText);
    }

    @Test(groups = {"wiki"})
    @Parameters({"datoBusqueda"})
    public void rotateFirstPage(String inSearchText){
        WikiHomePage home = getLandingPage();
        ArticlePage articlePage = home.busqueda(inSearchText);
        for (int i = 0; i < 5; i++) {
            articlePage = articlePage.getPageForFirstLink();
        }
    }
}
