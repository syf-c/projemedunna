@US06
Feature: US06 Medunna Settings

  Background: Ortak Adimlar
    Given Kullanici medunna sayfasina gider US04
    Then kullanci sign in butonuno tiklar  US04
    Then kullanici gecerli usurname girer US04
    Then kullanici gecerli password girer US04
    Then kullanici signinnn butonuna tiklar US04
    Then user iconuna tiklaryyy
    Then kullanci settings butonuna tiklaryyy

  @US06-TC01
  Scenario: TC01 Bilgileri Listele

    Then kullanici varolan bilgileri listeler US06
    And  sayfayi kapatirr US04

  @US06-TC02
  Scenario: TC02 FirstName Guncelle
    Then kullanici "firstName" bilgileri günceller US06
    And sayfayi kapatirr US04

  @US06-TC03
  Scenario: TC03 LastName Guncelle
    Then kullanici "lastName" bilgileri güncellerr US06
    And sayfayi kapatirr US04

  @US06-TC04
  Scenario: TC04 Email Guncelle
    Then kullanicii "email" bilgileri güncellerr US06
    And sayfayi kapatirr US04



