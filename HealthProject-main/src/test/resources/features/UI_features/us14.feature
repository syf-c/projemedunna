@US14
Feature: US14 Edit Inpatients islemleri

  Background: Ortak Adimlar
    Given Kullanici medunna sayfasina gider US04
    Then kullanci sign in butonuno tiklar  US04

  @US14-TC01
  Scenario: TC01 Doktor In Patients Bilgilerini Goruntuleyebilir
    Then Kullanici gecerli username "ahmetDoktor2" girer US13-14
    Then Kullanici gecerli password "ahmetDoktor2123," girer US13-14
    Then kullanici signinnn butonuna tiklar US04
    Then Kullanici MyInPatients linkine tiklar US13-14
    Then Kullanici acilan sayfada ilgili basliklarin gorunurlugunu dogrular
    And  Kullanici sayfayi kapatir US13-14


