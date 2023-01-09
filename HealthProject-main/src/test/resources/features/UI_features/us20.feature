@US_020
Feature: US_020

  Background:  Ortak adimlar

    Given Admin20 "medunnaUrl" adresine gider
    Then Admin20 Giris simgesine tiklar
    Then Admin20 Sign in simgesine tiklar
    Then Admin20 Username alanina gecerli bir username "team12" girer
    Then Admin20 Password alanina gecerli bir password "team12B81" girer
    Then Admin20 Sign in butonuna tiklar


  @US20_TC01
  Scenario: Admin, kayitli kisilerin "firstname, lastname, email... Gibi bilgilerini gorebilmeli.
    Then Admin20 Administratiton sekmesine tiklar
    Then Admin20  User management sekmesine tiklar
    Then Admin20 sececegi kullanicinin  View butonuna tiklar
    Then Admin20 sectigi kullanicinin bilgilerini yazdirir
    And  Admin20 sayfayi kapatir

  @US20_TC02
  Scenario: Admin kullaniciliar aktive edebilir ve rollerini "ADMIN, USER" olarak atayabilir.
    Then Admin20 yeni bir kullanici olusturur
    And  Admin20 sayfayi kapatir

  @US20_TC03
  Scenario: Admin kullanicilari silebilir.
    Then Admin20 personeli silebilmelidir
    And  Admin20 sayfayi kapatir