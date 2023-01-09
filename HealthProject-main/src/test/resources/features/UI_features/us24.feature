@US24All
Feature: US24 Kullanici test sonuclarini ve faturasini goruntuler
  Background:
    Given Kullanici Medunna sayfasina gider MCK
    Then Kullanici user icon simgesine tiklar MCK
    And Kullanici sign in butonuna tiklar MCK
    And Kullanici hasta gecerli bir kullanici adi ve sifresi girer ve sign in butonunu tiklar MCK
    And Kullanici MYPAGES (PATIENT) butonunu tiklar MCK
    And Kullanici MY APPOINTMENTS butonunu tiklar MCK


  @US24_TC01
  Scenario: TC01 Hasta hesabina girdiginde test sonuclarini gorebilmelidir. Test sonuclarinda " id, name for test,
  default max ve min value, test date and description" bolumleri gorulmelidir.

    And Kullanici sayfadaki ShowTests butonuna tiklar MCK
    And Kullanici test sonuclarinin goruntulendigini dogrular MCK
    And Kullanici id, name ,default max ve min value, test date and description bolumleri goruntuler MCK
    Then Kullanici sayfayi kapatir MCK

  @US24_TC02
  Scenario: TC01 Hasta faturasini gorebilmelidir.

    And Kullanici sayfadaki ShowInvoice kismina tiklar MCK
    And Kullanici faturanin goruntulendigini dogrular MCK
    Then Kullanici sayfayi kapatir MCK