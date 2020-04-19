package com.automation.testing;

import com.automation.testObjects.WikiHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public abstract class BaseTest {

    private MyDriver myPersonalDriver;
    private WikiHomePage landingPage;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser","DestinyPage"})
    public void beforeSuite(String inBrowser, String inDestiniy){
        myPersonalDriver = new MyDriver(inBrowser);
        landingPage = new WikiHomePage(myPersonalDriver.getMyDriver(), inDestiniy);
    }

    @AfterSuite(alwaysRun = true)
    public void dispose(){
        getLandingPage().dispose();
    }

    public WikiHomePage getLandingPage() {
        return landingPage;
    }
}
