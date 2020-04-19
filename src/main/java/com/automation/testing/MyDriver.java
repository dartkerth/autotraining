package com.automation.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
    private WebDriver myDriver;

    /*
    El contructor siempre debe generar una instalacia del driver
     */
    public MyDriver(String inBrowser){
        switch (inBrowser){
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
                myDriver = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");
                myDriver = new FirefoxDriver();
                break;
            default:
                System.out.println("¿Qué carajos pidio?");
                break;
        }
    }

    public WebDriver getMyDriver() {
        return myDriver;
    }
}
