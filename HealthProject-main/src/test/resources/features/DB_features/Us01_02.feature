Feature: email ve ssn dogrulama

  @US01-TC10
  Scenario Outline: Db ile SSN dogrulama

    Given Kullanici database ile connection kurar
    Then Kullanıcı kayitli kisileri "<query>" ve "<ColumnName>" komutlariyla getirir
    And kullanıcı bilgilerini dogrular

    Examples: test verileri
      | query                  |  | ColumnName |
      | SELECT * FROM jhi_user |  | SSN        |

    @US02_TC08
  Scenario Outline: Db ile email dogrulama

    Given Kullanici database ile connection kurar
    Then Kullanıcı kayitli kisileri "<query>" ve "<ColumnName>" komutlariyla getirir
    And kullanıcı mert bilgilerini dogrular

    Examples: test verileri
      | query                  |  | ColumnName |
      | SELECT * FROM jhi_user |  | email        |
