package com.gittigidiyor;

import entities.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.logging.Logger;

public class BaseClass {

    WebDriver webDriver;
    WebDriverWait wait;

    @BeforeMethod
    public void startUpBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        Log.info("Giris Sayfasına Git...");
        String url ="https://www.gittigidiyor.com/";

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        webDriver.get(url);
        webDriver.manage().window().maximize();

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        webDriver.quit();
        Log.info("Test tamamlandı.");

    }
}
