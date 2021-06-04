package com.gittigidiyor;

import element.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class SearchProductPage extends BaseClassPage {
    WebDriverWait wait;

    public SearchProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public By randomSelectProductBy() {
        Random random = new Random();
        int rand = random.nextInt(48) + 1;
        return By.cssSelector(".products-container>li:nth-of-type(" + rand + ")");
    }

    public void selectPage(String pageNumber) {
        webDriver.get(webDriver.getCurrentUrl() + "&sf=" + pageNumber);
    }

    public ProductPage goToProductDetails(){
        click(randomSelectProductBy());
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        return new ProductPage(webDriver);
    }


}
