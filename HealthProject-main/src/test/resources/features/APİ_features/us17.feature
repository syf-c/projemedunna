Feature: US017 Test Item
@US17_Api_TC05
  Scenario: TC05 Kullanici get request ile test item bilgilerini alir
    Given kullanici test item bilgileri icin get request yapar
    And Kulanici Get request icin status kodu 200 oldugunu test eder


  @US17_Api_TC02
  Scenario: TC02 Kullanici test ogelerini goruntuleyebilir
    Given Kullanici idsi 33020 olan test-items icin expected datalari girer
    And Kullanici idsi 33020 test-items icin get request yapar
    Then Kullanici get request yapilan test-items icin bilgileri dogrular

  @US17_Api_TC06
  Scenario: TC06 API ile test items oluşturun.
    Given Kullanici expected datalari girer
    And Kullanici request gonderir ve response alir
    And Kullanici  status kodu 201 oldugunu dogrular





