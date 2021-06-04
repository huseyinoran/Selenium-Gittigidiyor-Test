package com.gittigidiyor;

import entities.Log;
import entities.UserInfo;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SearchPage extends BaseClass{

    @Test
    public void Test() throws InterruptedException {
        String title = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
        String email = "goxan92800@vvaa1.com";
        String password = "ASDasd123*";

        MainPage mainPage = new MainPage(webDriver);
        String webDriverTitle = mainPage.getMainPageTitle();

        assertEquals(webDriverTitle, title);
        Log.info("Giris sayfasina git...");
        SignPage signPage = mainPage.getSignPage();

        UserInfo user = new UserInfo(email, password);
        signPage.sign(user);
        Log.info("Ana sayfaya git");

        String accountButtonText = mainPage.getAccountText();

        assertTrue(accountButtonText.contains("Hesabım"));

        Log.info("Bilgisayar kelimesi arama kutusuna yazildi...");
        SearchProductPage searchProductPage = mainPage.search("bilgisayar");
        searchProductPage.scrollToPage("7200");

        searchProductPage.selectPage("2");
        assertTrue(webDriver.getCurrentUrl().contains("2"));

        ProductPage productPage = searchProductPage.goToProductDetails();

        String productPrice = productPage.productPrice();
        productPage.scrollToPage("1000");
        productPage.addToBasket();

        BasketPage basketPage = productPage.goToBasket();
        assertEquals(productPrice, basketPage.priceInTheBasket());

        basketPage.setNumberOfProducts();
        Thread.sleep(2000);
        assertTrue(basketPage.getTotalProduct().contains("2 Adet"));

        basketPage.deleteProduct();
        Thread.sleep(2000);
        String basketMessage = "Sepette ürün bulunmamaktadır.";

        assertEquals(basketMessage, basketPage.isEmpty());

    }
}
