
@US27_DB
Feature: US_27 Messages by Admin Validate with API and DB
  Scenario: TC01 Kullanici DB ile mesajlari dogrulamalidir

  Given  Database'e baglan US27
  When Tablodan ileti bilgilerini getir US27
  Then Sorgu Query sonuclarini dogrula US27