Feature: US16 database ile dogrulama

  Scenario: US16TC17 DB ile oda bilgilerini dogrulayin

    Given US16TC17 Kullanici connection kurar.
    And US16TC17 Kullanici query olusturur.
    Then US16TC17 Kullanici oda bilgilerini dogrular.