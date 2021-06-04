package com.gittigidiyor;

import element.Helper;
import entities.UserInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignPage extends BaseClassPage {

    WebDriverWait wait;

    public SignPage (WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage sign(UserInfo user) {
        sendKeys(Helper.kullaniciAdiBy, user.getEmail());
        sendKeys(Helper.sifreBy, user.getPassword());
        click(Helper.girisEkranButonuBy);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(webDriver);
        mainPage.waitForLoad();
        return mainPage;
    }


}
