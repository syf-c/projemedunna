@US12
  Feature: Doktor test ile islemler yapabilmeli

    Background: Ortak Adimlar
      Given Kullanici medunna sayfasina gider US04
      Then kullanci sign in butonuno tiklar  US04
      Then Kullanici gecerli username "sumeyyeDoktor" girer. US11
      Then Kullanici gecerli password "sumeyyeDoktor3520." girer. US11
      Then Sign in butonuna tiklar. US11
      Then My Appointments butonuna tiklar. US11
      Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11

  @US12_TC01
  Scenario: Doktor test isteyebilmeli.
    Then Request A Test butonuna tiklar.
    Then Test items listesinden Glucose secmelidir.
    Then Test items listesinden Urea secmelidir.
    Then Test items listesinden Creatinine secmelidir.
    Then Test items listesinden Sodium secmelidir.
    Then Test items listesinden Potassium secmelidir.
    Then Test items listesinden Total protein secmelidir.
    Then Test items listesinden Albumin secmelidir.
    Then Test items listesinden Hemoglobin secmelidir.
    Then Save butonuna tiklar. US11
    And Kullanici sayfayi kapatir

  @US12_TC02
  Scenario: Doktor test icerigindeki istenilenlere bakmali.

    #Then Request A Test butonuna tiklar.
    #Then Sayfa acilinca birazz bekler.
    #Then Test items listesinden Glucose secmelidir.
  #  Then Test items listesinden Urea secmelidir.
  #  Then Test items listesinden Creatinine secmelidir.
  #  Then Test items listesinden Sodium secmelidir.
  #  Then Test items listesinden Potassium secmelidir.
  #  Then Test items listesinden Total protein secmelidir.
  #  Then Test items listesinden Albumin secmelidir.
   # Then Test items listesinden Hemoglobin secmelidir.
   # Then Save butonuna tiklar. US11
   Then Show Test Results butonuna tiklar.
   Then Sectigi testlere bakmaya gider.
    #And Kullanici sayfayi kapatir