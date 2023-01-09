Feature: US28_DataBase
  @DB_Us28
  Scenario: US28 Backend Database Testi
    Given Kullaninici Medunna Data Base'e baglanir US28
    Then  Kullanici "country" tablosundan "238498" idli Ulkeyi sorgular ve olustugunu dogrular US28
    #And   Kullanici "c_state" tablosundan "1315" idli State Cityi sorgular ve olustugunu dogrular US28