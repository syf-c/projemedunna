@US15
Feature: US15 Admin tarafindan hasta olusturma ve duzenleme

  Background: Ortak Adimlar
    Given Belirtilen url'e gidilir FC.
    When Giris icon'una tiklanir FC.
    And Sign in'e tiklanir FC.
    And Yonetici username girilir FC.
    And Yonetici password girilir FC.
    And Sign in butonuna tiklanir FC.
    And Items&Titles'a tiklanir FC.
    And Patient'e tiklanir FC.

  @US15TC01
  Scenario: TC01 Yeni hastalar yalnizca yonetici tarafindan olusturulabilir.
    And Create a new patient'e tiklanir FC.
    Then Create or edit a Patient yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir FC.

  @US15TC02
  Scenario: TC02 Yonetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,
  Description, Created Date, User, Country and state / City" gibi hasta bilgilerini gorebilir.
    Then SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,Description, Created Date, User, Country and state City gibi hasta bilgilerinin goruldugu test edilir FC.
    And Sayfa kapatilir FC.

  @US15TC03
  Scenario: TC03 Hasta olusturuldugunda veya guncellendiginde yukaridaki ogelere data girisi yapilabilmeli.
    And Create a new patient'e tiklanir FC.
    And Istenen hasta bilgileri girilir FC.
    And Save butonuna tıklanır FC.
    Then Hasta oluturuldu yazinin görundugu test edilir FC.
    And Sayfa kapatilir FC.

  @US15TC04
  Scenario: TC04 Hasta olusturuldugunda veya guncellendiginde yukaridaki ogelere data girisi yapilabilmeli.
    And Edit'e tiklanir FC.
    And Hasta bilgileri guncellenir FC.
    And Save butonuna tıklanır FC.
    Then Hastanin güncellendigi yazinin görundugu test edilir FC.
    And Sayfa kapatilir FC.

    ##   Scenario: TC05 Hastaya doktoru sadece Admin atayabilir.

  @US15TC06
  Scenario: TC06 "Country", "US state" olmali ve bos birakilmamali
    And Create a new patient'e tiklanir FC.
    Then Country ve Us state seceneklerinin oldugu test edilir FC.
    And Sayfa kapatilir FC.

   ## Scenario: TC07 "Country", "US state" olmali ve bos birakilmamali

  @US15TC08
  Scenario: TC08 Yonetici herhangi bir hastayi silebilir
    And Delete'e tiklanir FC.
    Then Hasta silindi yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir FC.

