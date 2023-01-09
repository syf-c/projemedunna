
Feature: US17 Test items(oge) Olustur / Guncelle / Sil
Background:
  Given Kullanici Medunna sayfasina gider

  And Kullanici user icon simgesine tiklar

  Then Kullanici giris yapmak icin sign in butonuna basar

  And Kullanici username ile sifresini girer

  Then Kullanici sign in butonuna basar

  And Kullanici Item-Titles butonuna tiklar

  And Kullanici Test Item butonuna tiklar

  Scenario: TC01 Admin yeni test ogeleri olusturabilir

    Then Kullanici acilan sayfada Create a new Test Item butonuna tiklar

    And  Kullanici "test items; Name, Description, price Default min value Default max value ve created date bilgilerini girer

    Then Kullanici Save butonuna tiklar ve A Test Item is cerated with identifier gorunurlugunu test eder

    And Kullanici sayfayi kapatir


  Scenario: TC02 Admin, "test items; Name, Description, price Default min value, Default max value ve
  created date (Gün/Ay/Yıl) oluşturabilir ve güncelleyebilir.

    And Kullanici daha once kaydedilmis herhangi bir test items a ait Edit butonuna tiklar

    Then Kullanici test items bilgilerini gunceller

    And  Kullanici Save butonuna tiklar ve A Test Item is updated with identifier gorunurlugunu test eder

    Then Kullanici sayfayi kapatir


  Scenario: TC03 Admin test öğelerini görüntüleyebilir

    Then Kullanici istedigi test items a ait View butonuna tiklar

    And Kullanici istedigi test ogelerinin gorulebildigini test eder

    Then Kullanici sayfayi kapatir


  Scenario: TC04 Admin test öğelerini silebilir.

    Then Kullanici istedigi test items a ait Delete butonuna tiklar

    And Kullanici cikan ekranda tekrar Delete butonuna tiklar ve delete islemiminin yapilabildigini test eder

    Then Kullanici sayfayi kapatir




