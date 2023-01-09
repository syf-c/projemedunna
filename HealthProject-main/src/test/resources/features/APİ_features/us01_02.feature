Feature: Api sorgusu ve dogrulamasi

  @US01_Api1
  Scenario: TC08 Kullanici tum kayit bilgilerini almali ve dogrulamalidir.
    Given Kullanici tum kayit bilgilerini Get request ile getirebilmelidir


  @US01_Api2
  Scenario: TC09 API kullanarak kayıtlı kişiler oluşturun ve doğrulayın
    Given Kullanici API icin Url set ederr
    When Kullanici expected datalari girerr
    Then Kullanici request gonderir ve response alirr
    And Kullanici  bilgileri dogrularr

  @US02_Api3
  Scenario: TC07 Kullanici adi ve email api kullanilarak dogrulanmalidir.
    Given Kullanici adi ve email dogrulamak icin gerekli requesti yollar
    When Status code 200 olmalidir
    Then Kullanici sonucu dogrular



