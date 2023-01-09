Feature: US_017 Test items(öğe) Oluştur / Güncelle / Sil
@US17_Db
  Scenario: US17_TC_007
    Given Kullanici database ile baglanti olusturur
    And Kullanici DB'e sorgu gonderir id ile test item bilgilerini alir
    Then Kullanici bilgileri dogrular
