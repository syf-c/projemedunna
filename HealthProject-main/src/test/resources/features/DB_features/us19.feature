
@US19_DB
  Feature: US019

    Scenario: Kullanici staff bilgileri  DB ile dogrular
      Given Kullanici connection kurarYY
      Then  Kullanici query olustururYY
      Then  Kullanici staff bilgilerini dogrularYY
