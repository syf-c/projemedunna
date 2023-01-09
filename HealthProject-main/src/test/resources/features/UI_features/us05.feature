@US05
Feature: US05 Hastalar (patients), hastahaneden randevu (Appointment) olusturabilmelidir.

  Background: Ortak Adimlar

    Given Kullanici Medunna sayfasina gider AG
    Then Kullanici Make an Appointment butonuna tiklar AG

  @US05-TC01
  Scenario: Kullanici gecerli kullanici bilgilerini girer bos birakilamaz

    Then Kullanici First Name textboxina ismini girer AG
    Then Kullanici Last Name textboxina soyismini girer AG
    Then Kullanici SSN textboxina kayitli SSN i girer AG
    Then Kullanici Email textboxina Email adresini girer AG
    Then Kullanici  ucuncu ve altinci rakamdan sonra tire isareti olan on rakamli tel no sunu girer AG
    Then Kullanici gecerli kullanıcı bilgilerini girdigini dogrular AG
    And Kullanici sayfayi kapatir AG


  @US05-TC02
  Scenario: Kullanici First Name alaninini bos biraktiginda uyari almali
    And Kullanici First Name alanini bos birakir AG
    And Kullanici Your FirstName is required. uyarisi aldigini dogrular AG


  @US05-TC03
  Scenario: Kullanici Last Name alaninini bos biraktiginda uyari almali
    And Kullanici Last Name alanini bos birakir AG
    And Kullanici Last NAme is required. uyarisi aldigini dogrular AG


  @US05-TC04
  Scenario: Kullanici SSN alaninini bos biraktiginda uyari almali
    And Kullanici SSN alanini bos birakir AG
    And Kullanici SSN is required. uyarisi aldigini dogrular AG


  @US05-TC05
  Scenario: Kullanici Email alanini bos biraktiginda uyarı almali
    And Kullanici Email alanini bos birakir AG
    And Kullanici Email is required. uyarisi aldigini dogrular AG


  @US05-TC06
  Scenario: Kullanici phone alanini bos biraktiginda uyari almali
    And Kullanici phone alanini bos birakir AG
    And Kullanici phone is required. uyarisi aldigini dogrular AG
    And Kullanici sayfayi kapatir AG

  @US05-TC07
  Scenario: Kullanici randevu alip kaydoldugunda, profillerini gorebilir ve uygulamada oturum acabilir.

    Then Kullanici First Name textboxina ismini girer AG
    And Kullanici Last Name textboxina soyismini girer AG
    And Kullanici SSN textboxina kayitli SSN i girer AG
    And Kullanici Email textboxina Email adresini girer AG
    And Kullanici  ucuncu ve altinci rakamdan sonra tire isareti olan on rakamli tel no sunu girer AG
    And Kullanici Send An Appointment Request butonuna tiklar AG
    Then Kullanici basarili bir sekilde randevu olusturdugunu gorur AG
    Then Kullanici ana sayfada user ikonuna tiklar AG
    Then Kullanici SignIn giris butonuna tiklar AG
    Then Kullanici Username textboxina kullanici ismini girer AG
    Then Kullanici Password textboxina sifresini girer AG
    Then Kullanici SignIn butonuna tiklar AG
    Then Kullanici anasayfada profilinin gorunurlugunu dugrular AG
    Then Kullanici MY PAGES(PATIENT) butonuna tiklar AG
    Then Kullanici My Appointments butonuna tiklar AG
    Then Kullanici aldigi randevuyu profil sayfasinda gorur AG