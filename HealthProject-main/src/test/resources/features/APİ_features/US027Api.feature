Feature: US_27 Messages by Admin Validate with API and DB

  @US_27_TC05
  Scenario: TC05 Kullanici, API kullanarak iletileri olusturabilmeli ve dogrulamalidir.

    Given Kullanici post islemi icin endpoint olusturur US27
    When Kullanici post islemi icin expectedData olusturur US27
    And  Kullanici token alip POST REQUEST yapar ve response alir US27
    Then Kullanici post islemi icin dogrulamalari yapar US27

  @US_27_TC06
  Scenario: TC06 Kullanici API ile iletileri okuyabilmeli ve dogrulamalidir.

    Given Kullanici get islemi icin endpoint olusturur US27
    When  Kullanici get islemi icin expectedData olusturur US27
    And   Kullanici token alip GET REQUEST yapar ve response alir US27
    Then  Kullanici get islemi icin dogrulamalari yapar US27
