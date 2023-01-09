@US25
Feature: Hasta Hesabinda Randevu Olusturma

  Background: Ortak Adimlar

    Given Kullanici Medunna sayfasina gider Ag
    Then Kullanici user ikonuna tiklar Ag
    Then Kullanici acilan dropdown da Sign In butonuna tiklar Ag
    Then Kullanici Username textboxina ismini girer Ag
    Then Kullanici Paswword textboxina parolasini girer Ag
    Then Kullanici Sign In butonuna tiklar Ag
    Then Kullanici MY PAGES(PATIENT) butonuna tiklar Ag
    Then Kullanici acilan dropdown da Make an Appointment butonuna tiklar Ag
    Then Kullanici Phone textboxina telefon numarasini girer Ag

  @US25-TC01
  Scenario: TC01 Hasta kendi portalini kullanarak yeni bir randevu alabilir

    Then Kullanici guncel tarih ile randevu almak icin Send an Appointment Request butonuna tiklar Ag
    Then Kullanici kendi portalini kullanarak basarili bir sekilde randevu alabildigini dogrular Ag
    Then Kullanici Appointment Date Time textboxına ileri bir tarih girer Ag
    Then Kullanici Send an Appointment Request butonuna tiklar Ag
    Then Kullanici kendi portalini kullanarakk basarili bir sekilde randevu alabildigini dogrular Ag
    And Kullanici sayfayi kapatir Ag

  @US25-TC02
  Scenario: TC02 Hasta kendi portalini kullanarak yeni bir randevu alirken gecmis tarih girdiginde uyari almali

    Then Kullanici Appointment Date Time textboxına gecmis bir tarih girer Ag
    Then Kullanici Appointment date can not be past date! yazısını görür Ag
    Then Kullanici Send an Appointment Request butonuna tikladiginda basarili yazisini görmemeli Ag
    And Kullanici sayfayi kapatir Ag
