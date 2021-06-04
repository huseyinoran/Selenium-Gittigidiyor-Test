package com.gittigidiyor;

import element.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasketPage extends BaseClassPage {
    WebDriverWait wait;

    public BasketPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String priceInTheBasket(){
        return webDriver.findElement(Helper.sepettekiFiyat).getText();
    }

    public void setNumberOfProducts(){
        click(Helper.urunSayisiBy);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public String getTotalProduct(){
        return webDriver.findElement(Helper.toplamUrunBy).getText();
    }

    public void deleteProduct(){
        click(Helper.urunSilBy);
    }

    public String isEmpty(){
        return webDriver.findElement(Helper.sepetBosBy).getText();
    }
}
