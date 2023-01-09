
@US19_API
Feature: API ile dogrulayin

  Scenario: Staff hesabina GET sorgusu

     Then GET request gonderirYY
    Then status kodunun 200 oldugu dogrulanirYY
    And gereken endpoint ayarlanirYY