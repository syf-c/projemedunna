@US04
Feature: US04 Medunna Login

  Background: Ortak Adimlar
    Given Kullanici medunna sayfasina gider US04
    Then kullanci sign in butonuno tiklar  US04


  @US04-TC01
  Scenario: TC01 Giris
    Then kullanici gecerli usurname girer US04
    Then kullanici gecerli password girer US04
    Then kullanici signinnn butonuna tiklar US04
    And  sayfayi kapatirr US04

  @US04-TC02
  Scenario: TC02 Negatif Test
    Then kullanici hatali giris yapar US04
    And sayfayi kapatirr US04

  @US04-TC03
  Scenario: TC03 Remember
    Then kullanici Remember me secenegi dogrular US04
    And  sayfayi kapatirr US04

  @US04-TC04
  Scenario:  TC04 Password
    Then kullanici Did you forget  password secenegini dogrular US04
    And  sayfayi kapatirr US04

  @US04-TC05
  Scenario:  TC05 Register
    Then kullanici You dont have an account get Register a new account secenegini dogrularr US04
    And  sayfayi kapatirr US04

  @US04-TC06
  Scenario: TC06 Cancel
    Then kullanici cancel secenegini dogrular US04
    And sayfayi kapatirr US04








