package com.gittigidiyor;

import element.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductPage extends BaseClassPage {
    WebDriverWait wait;

    public ProductPage (WebDriver webDriver) {
        super(webDriver);
    }

    public String productPrice(){
        String productPrice = webDriver.findElement(Helper.urununDusukFiyatiBy).getText();
        if (productPrice.isEmpty()) {
            return getText(Helper.urununYuksekFiyatiBy);
        }
        return getText(Helper.urununDusukFiyatiBy);
    }

    public void addToBasket(){
        click(Helper.sepeteUrunEkleButonuBy);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
    }
    public BasketPage goToBasket(){
        click(Helper.sepeteGitButonuBy);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(3));
        return new BasketPage(webDriver);
    }

}
