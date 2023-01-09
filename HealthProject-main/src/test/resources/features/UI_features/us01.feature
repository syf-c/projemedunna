Feature: US01 Registration islemleri

  Background: Ortak adimlar
    Given Kullanici Medunna sayfasina gider
    Then Kullanici user icon simgesine tiklar
    And Kullanici register butonuna tiklar
    And Kullanici Registration sayfasinin acildigini dogrular

  @US1-TC1
  Scenario: TC01 Kullanici gecerli SSN sartini sagladiginda uyari almamali

    And Kullanici gecerli SSN numarasi girdiginde uyari almadigini dogrular
    And Kullanici sayfayi kapatir

  @US1-TC2
  Scenario Outline: TC02 Kullanici gecersiz SSN girdiginde uyari almali

    And Kullanici SSN kismina "<gecersiz SSN numarasi>" girdiginde SSN invalid uyarisi alir
    And Kullanici sayfayi kapatir
    Examples:
      | gecersiz SSN numarasi |
      | 000-12-2528           |
      | 780-00-2528           |
      | 129-12-0000           |
      | 00-12-25288           |
      | abc-12-2528           |
      | 123456789             |

  @US1-TC3
  Scenario: TC03 Kullanici SSN girmediginde uyari almali
    And Kullanici SSN alanini bos biraktiginda "Your SSN is required" uyarisi aldigini dogrular
    And Kullanici sayfayi kapatir

  @US1-TC4
  Scenario: TC04 Kullanici First Name alanina herhangi bir karakter girdiginde uyari almamali
    And Kullanici First Name alanina herhangi bir karakter girdiginde uyari mesaji almadigini dogrular
    And Kullanici sayfayi kapatir


  @US1-TC5
  Scenario: TC05 Kullanici First Name alanini bos biraktiginda uyari almali
    And Kullanici First Name alanini bos birakir
    And Kullanici "Your FirstName is required." uyarisi aldigini dogrular.
    And Kullanici sayfayi kapatir

  @US1-TC6
  Scenario: TC06 Kullanici Last Name alanina herhangi bir karakter girdiginde uyari almamali
    And Kullanici Last Name alanina herhangi bir karakter girdiginde uyari mesaji almadigini dogrular
    And Kullanici sayfayi kapatir

  @US1-TC7
  Scenario: TC07 Kullanici Last Name alanini bos biraktiginda uyari almali
    And Kullanici Last Name alanini bos birakir
    And Kullanici last name alanini bos biraktiginda "Your LastName is required." uyarisi aldigini dogrular.
    And Kullanici sayfayi kapatir









