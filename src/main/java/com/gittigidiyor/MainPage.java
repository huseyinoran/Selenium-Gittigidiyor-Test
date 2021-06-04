package com.gittigidiyor;

import element.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseClassPage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getMainPageTitle(){
        return webDriver.getTitle();
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Helper.anaSayfaBy));
    }



}
