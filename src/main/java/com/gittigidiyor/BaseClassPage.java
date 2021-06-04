package com.gittigidiyor;

import element.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseClassPage extends DriverElement {
    WebDriverWait wait;

    public BaseClassPage (WebDriver webDriver) {
        super(webDriver);
    }

    public SignPage getSignPage(){
        moveToElement(Helper.girisveKayitButonuBy);
        click(Helper.girisButonuBy);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        return new SignPage(webDriver);
    }
    public String getAccountText(){
        return getText(Helper.girisveKayitButonuBy);
    }

    public SearchProductPage search(String keyword) {
        webDriver.findElement(Helper.araamaKutusu).sendKeys(keyword + Keys.ENTER);
        return new SearchProductPage(webDriver);
    }

}
