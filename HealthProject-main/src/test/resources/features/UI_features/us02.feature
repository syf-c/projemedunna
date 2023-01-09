Feature: US02 Registration islemleri

  Background: Ortak adimlar
    Given Kullanici Medunna sayfasina gider
    Then Kullanici user icon simgesine tiklar
    And Kullanici register butonuna tiklar
    And Kullanici Registration sayfasinin acildigini dogrular

  @US2-TC1
  Scenario: TC01 Kullanici Username alanini bos biraktiginda uyari almali
  And Kullanici Username alanini bos biraktiginda Your username is required. uyarisi aldigini dogrular
  And Kullanici sayfayi kapatir
