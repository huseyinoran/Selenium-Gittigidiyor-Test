package element;

import org.openqa.selenium.By;

public class Helper {
    //BaseClassPage Elements
    public static By girisveKayitButonuBy = By.cssSelector("div[data-cy='header-user-menu']");
    public static By girisButonuBy = By.cssSelector("a[data-cy='header-login-button']");
    public static By araamaKutusu = By.className("sc-4995aq-0");

    //BasketPage Elements
    public static By sepettekiFiyat = By.className("total-price");
    public static By urunSayisiBy = By.cssSelector("option[value='2']");
    public static  By toplamUrunBy = By.cssSelector("li[class='clearfix total-price-sticky-container']>:nth-of-type(1)");
    public static  By urunSilBy = By.cssSelector("a[title='Sil']");
    public static  By sepetBosBy = By.cssSelector(".gg-w-22.gg-d-22.gg-t-21.gg-m-18>:nth-child(1)");

    //MainPage Elements
    public static By anaSayfaBy = By.className("f2lc5a-0");

    //ProductPage Elements
    public static By urununDusukFiyatiBy = By.id("sp-price-lowPrice");
    public static By urununYuksekFiyatiBy = By.id("sp-price-highPrice");
    public static By sepeteUrunEkleButonuBy = By.id("add-to-basket");
    public static By sepeteGitButonuBy = By.className("robot-header-iconContainer-cart");

    //SignPage Elements
    public static By kullaniciAdiBy = By.id("L-UserNameField");
    public static By sifreBy = By.id("L-PasswordField");
    public static By girisEkranButonuBy = By.id("gg-login-enter");


}
