package stepDefinitions.UI_stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us08StepDefinitions {

    MedunnaPage medunnaPage = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("Kullanici Medunna sayfasina gider MCK")
    public void kullaniciMedunnaSayfasinaGiderMCK() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        ReusableMethods.waitFor(1);
    }

    @Then("Kullanici user icon simgesine tiklar MCK")
    public void kullaniciUserIconSimgesineTiklarMCK() {
    medunnaPage.userIcon.click();
    }

    @And("Kullanici sign in butonuna tiklar MCK")
    public void kullaniciSignInButonunaTiklarMCK() {
        medunnaPage.signInMck.click();
    }

    @And("Kullanici gecerli bir kullanici adi ve sifresi girer ve sign in butonunu tiklar MCK")
    public void kullaniciGecerliBirKullaniciAdiVeSifresiGirerVeSignInButonunuTiklarMCK() {
        medunnaPage.userNameMck.sendKeys("caner.karakoyun");
        medunnaPage.passwordMck.sendKeys("Dene_27");
        medunnaPage.signInButtonMck.click();
    }

    @And("Kullanici hesaba giris yapildigini goruntuler MCK")
    public void kullaniciHesabaGirisYapildiginiGoruntulerMCK() {
        Assert.assertTrue(medunnaPage.userNameIconMck.isDisplayed());
    }

    @And("Kullanici username uzerine tiklar MCK")
    public void kullaniciUsernameUzerineTiklarMCK() {
        medunnaPage.userNameIconMck.click();

    }

    @And("Kullanici password kutusuna tiklar MCK")
    public void kullaniciPasswordKutusunaTiklarMCK() {
        medunnaPage.passwordButtonMck.click();
    }

    @And("Kullanici Current Password kutusuna gecerli sifreyi girer MCK")
    public void kullaniciCurrentPasswordKutusunaGecerliSifreyiGirerMCK() {
        medunnaPage.currentPasswordBoxMck.sendKeys("Dene_27");
    }

    @And("Kullanici New Password kutusuna iki buyuk harf, iki kucuk harf, iki sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaIkiBuyukHarfIkiKucukHarfIkiSayiVeBirOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.sendKeys("AAaa11*");
    }

    @And("Kullanici Confirm the New Password kutusuna ayni sifre tekrar girer MCK")
    public void kullaniciConfirmTheNewPasswordKutusunaAyniSifreTekrarGirerMCK() {
        medunnaPage.confirmPasswordBoxMck.sendKeys("AAaa11*");
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Kullanici iki kutucuga da ayni sifreyi girdiginde -The password and its confirmation do not match!- hatasi almadan ilerledigini dogrular. MCK")
    public void kullaniciIkiKutucugaDaAyniSifreyiGirdigindeThePasswordAndItsConfirmationDoNotMatchHatasiAlmadanIlerlediginiDogrularMCK() {
        boolean uyariYazisi = true;
        try {
            medunnaPage.passwordNotMatchAlertMck.isDisplayed();
        } catch (Exception e) {
            uyariYazisi = false;
        }
        Assert.assertFalse(uyariYazisi);
    }

    @And("Kullanici Confirm the New Password kutusuna farkli bir sifre girer MCK")
    public void kullaniciConfirmTheNewPasswordKutusunaFarkliBirSifreGirerMCK() {
        medunnaPage.confirmPasswordBoxMck.sendKeys("AAaa11-");
        actions.sendKeys(Keys.TAB).perform();
    }

    @Then("Kullanici iki kutucuga da ayni sifreyi girdiginde The password and its confirmation do not match! hatasi aldigini dogrular. MCK")
    public void kullaniciIkiKutucugaDaAyniSifreyiGirdigindeThePasswordAndItsConfirmationDoNotMatchHatasiAldiginiDogrularMCK() {
        Assert.assertTrue(medunnaPage.passwordNotMatchAlertMck.isDisplayed());
    }

    @And("Kullanici New Password kutusuna uc buyuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaUcBuyukHarfIkiSayiVeIkiOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.sendKeys("AAA11**");
    }

    @Then("Kullanici password seviyesinin bes userinden dort oldugunu dogrular.")
    public void kullaniciPasswordSeviyesininBesUserindenDortOldugunuDogrular() {
        Assert.assertTrue(medunnaPage.passwordStrength4GreentMck.isDisplayed());
        Assert.assertTrue(medunnaPage.passwordStrength5GreytMck.isDisplayed());
    }

    @And("Kullanici New Password kutusuna bir kucuk harf, iki buyuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaBirKucukHarfIkiBuyukHarfIkiSayiVeIkiOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
        medunnaPage.newPasswordBoxMck.sendKeys("aAA11**");
    }

    @Then("Kullanici sifreye eklenen kucuk harfin sifre gucunu artirdigini goruntuler MCK")
    public void kullaniciSifreyeEklenenKucukHarfinSifreGucunuArtirdiginiGoruntulerMCK() {
        Assert.assertTrue(medunnaPage.passwordStrength5GreentMck.isDisplayed());
    }

    @And("Kullanici New Password kutusuna uc kucuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaUcKucukHarfIkiSayiVeIkiOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.sendKeys("aaa11**");
    }

    @And("Kullanici New Password kutusuna bir buyuk harf, iki kucuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaBirBuyukHarfIkiKucukHarfIkiSayiVeIkiOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
        medunnaPage.newPasswordBoxMck.sendKeys("Aaa11**");
    }

    @Then("Kullanici sifreye eklenen buyuk harfin sifre gucunu artirdigini goruntuler MCK")
    public void kullaniciSifreyeEklenenBuyukHarfinSifreGucunuArtirdiginiGoruntulerMCK() {
        Assert.assertTrue(medunnaPage.passwordStrength5GreentMck.isDisplayed());
    }

    @And("Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaUcKucukHarfIkiKucukHarfVeIkiOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.sendKeys("AAAaa**");
    }

    @And("Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf, bir ozel karakter ve bir sayi'dan olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaUcBuyukHarfUcKucukHarfUcOzelKarakterVeUcSayiDanOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
        medunnaPage.newPasswordBoxMck.sendKeys("AAAaa*1");
    }

    @Then("Kullanici sifreye eklenen sayinin sifre gucunu artirdigini goruntuler MCK")
    public void kullaniciSifreyeEklenenSayininSifreGucunuArtirdiginiGoruntulerMCK() {
        Assert.assertTrue(medunnaPage.passwordStrength5GreentMck.isDisplayed());
    }

    @And("Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf ve iki sayidan olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaUcKucukHarfIkiKucukHarfVeIkiSayidanOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.sendKeys("AAAaa11");
    }

    @And("Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf, bir sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaniciNewPasswordKutusunaUcBuyukHarfIkiKucukHarfBirSayiVeBirOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
        medunnaPage.newPasswordBoxMck.sendKeys("AAAaa1*");
    }

    @Then("Kullanici sifreye eklenen ozel karakterin sifre gucunu artirdigini goruntuler MCK")
    public void kullaniciSifreyeEklenenOzelKarakterinSifreGucunuArtirdiginiGoruntulerMCK() {
        Assert.assertTrue(medunnaPage.passwordStrength5GreentMck.isDisplayed());
    }

    @And("Kullaici New Password kutusuna iki buyuk harf, iki kucuk harf, bir sayi ve bir ozel karakterden olusan alti haneli bir sifre girer MCK")
    public void kullaiciNewPasswordKutusunaIkiBuyukHarfIkiKucukHarfBirSayiVeBirOzelKarakterdenOlusanAltiHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.sendKeys("AAaa1*");
    }

    @Then("Kullanici password seviyesinin bes userinden bir oldugunu dogrular.")
    public void kullaniciPasswordSeviyesininBesUserindenBirOldugunuDogrular() {
        Assert.assertTrue(medunnaPage.passwordStrength1RedMck.isDisplayed());
    }

    @And("Kullaici New Password kutusuna iki buyuk harf, iki kucuk harf, iki sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK")
    public void kullaiciNewPasswordKutusunaIkiBuyukHarfIkiKucukHarfIkiSayiVeBirOzelKarakterdenOlusanYediHaneliBirSifreGirerMCK() {
        medunnaPage.newPasswordBoxMck.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
        medunnaPage.newPasswordBoxMck.sendKeys("AAaa11*");
    }

    @Then("Kullanici yedi haneli sifrenin, sifre gucunu artirdigini goruntuler MCK")
    public void kullaniciYediHaneliSifreninSifreGucunuArtirdiginiGoruntulerMCK() {
        Assert.assertTrue(medunnaPage.passwordStrength5GreentMck.isDisplayed());
    }

    @And("Kullanici Save butonunu tiklar MCK")
    public void kullaniciSaveButonunuTiklarMCK() {
        medunnaPage.saveButtonMck.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici signout butonuna tiklar MCK")
    public void kullaniciSignoutButonunaTiklarMCK() {
        medunnaPage.signOutButtonMck.click();
    }

    @And("Kullanici gecerli kullanici adini ve eski sifreyi girer ve sign in butonunu tiklar MCK")
    public void kullaniciGecerliKullaniciAdiniVeEskiSifreyiGirerVeSignInButonunuTiklarMCK() {
        ReusableMethods.waitFor(1);
        medunnaPage.userNameMck.sendKeys("caner.karakoyun");
        medunnaPage.passwordMck.sendKeys("Dene_27");
        medunnaPage.signInButtonMck.click();
        ReusableMethods.waitFor(1);
    }

    @And("Kullanici Failed to sign in! Please check your credentials and try again. uyarisini gordugunu dogrular. MCK")
    public void kullaniciFailedToSignInPleaseCheckYourCredentialsAndTryAgainUyarisiniGordugunuDogrularMCK() {
        Assert.assertTrue(medunnaPage.failedToSignInAlerttMck.isDisplayed());

        ReusableMethods.waitFor(3);
        medunnaPage.passwordMck.click();
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys("AAaa11*").perform();
        medunnaPage.signInButtonMck.click();
        ReusableMethods.waitFor(1);
        medunnaPage.userIcon.click();
        ReusableMethods.waitFor(1);
        medunnaPage.passwordButtonMck.click();
        ReusableMethods.waitFor(1);
        medunnaPage.currentPasswordBoxMck.sendKeys("AAaa11*");
        medunnaPage.newPasswordBoxMck.sendKeys("Dene_27");
        medunnaPage.confirmPasswordBoxMck.sendKeys("Dene_27");
        ReusableMethods.waitFor(1);
        medunnaPage.saveButtonMck.click();
        ReusableMethods.waitFor(5);
    }


    @Then("Kullanici sayfayi kapatir MCK")
    public void kullaniciSayfayiKapatirMCK() {
        Driver.closeDriver();
    }
}
