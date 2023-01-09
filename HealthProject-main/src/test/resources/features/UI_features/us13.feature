@US13
Feature: US13 Test Results islemleri

  Background: Ortak Adimlar
    Given Kullanici medunna sayfasina gider US04
    Then kullanci sign in butonuno tiklar  US04


    @US13-TC01
    Scenario: TC01 Doktor Test Sonuclarini Gorur
    Then Kullanici gecerli username "sumeyyeDoktor" girer US13-14
    Then Kullanici gecerli password "sumeyyeDoktor3520." girer US13-14
    Then kullanici signinnn butonuna tiklar US13-14
    Then Kullanici My Appointments linkine tiklar US13-14
    Then Kullanici tarih araligini secer US13-14
    Then Kullanici Edit butonuna tiklar US13-14
    Then Kullanici Show Test Results butonuna tiklar US13-14
    Then Kullanici ilgili satirdaki View Resaults butonuna tiklar US13-14
    Then Kullanici acilan sayfada ilgili degerlerinin gorunurlugunu her bir test icin dogrular US13-14
    And  Kullanici sayfayi kapatir US13-14

  @US13-TC02
  Scenario: TC01 Doktor Yatili Tedavi Talep Eder
  Then Kullanici gecerli username "ahmetDoktor2" girer US13-14
  Then Kullanici gecerli password "ahmetDoktor2123," girer US13-14
  Then kullanici signinnn butonuna tiklar US13-14
  Then Kullanici My Appointments linkine tiklar US13-14
  Then Kullanici tarih araligini secer US13-14
  Then Kullanici ilgili satirdaki Edit butonuna tiklar US13-14
  Then Kullanici ID numarasini not eder US13-14
  Then Kullanici Request Inpatient butonuna tiklar US13-14
  Then Kullanici MyInPatients linkine tiklar US13-14
  Then Kullanici acilan sayfada Appointment altinda not ettigi ID'nin gorunurlugunu dogrular US13-14
  And  Kullanici sayfayi kapatir US13-14


