@US22
Feature:Hasta Test sonuclari (Staff)

  Background: Ortak stepler

    Given US22 Personel url gider
    Given US22 Personel Kisi ikonuna  tiklar
    And US22 Personel sigin buttonuna tiklar
    When US22 Personel rolu ile gecerli username "esra-personel" girer
    And  US22 Personel rolu ile gecerli password "161122.d" girer
    And US22 Personel Signi tiklar
    And US22 Personel My Pages buttonuna tiklar
    And US22 Personel Search Patient buttonuna tiklar


  @US22_TC01
  Scenario: US22 Kullanici (Staff) hastanin SSN id ile arama yapabilir.
    Given US22 Patient ssn bolumune gecerli ssn numarasini girer
    Then US22 Hasta bilgilerinin geldigini gorur
    Then US22 Personel sayfayi kapatir

  @US22_TC02
  Scenario: Kullanici (Staff) test sonuclarini gorebilmelidir,
    Given US22 Patient ssn bolumune gecerli ssn numarasini girer
    Then US22 Show Appointments buttonuna tiklar
    And US22 Show Tests buttonuna tiklar
    And US22 View Results buttonuna tiklar
    And US22 Test sonuclarini gorur
    Then US22 Personel sayfayi kapatir

  @US22_TC03
  Scenario: Kullanici (Staff) "ID, Date, Result, description, Created date, ..." gibi sonuc bilgilerini gorebilmeli ve
  guncelleyebilmelidir.
    Given US22 Patient ssn bolumune gecerli ssn numarasini girer
    Then US22 Show Appointments buttonuna tiklar
    Then US22 Show Tests buttonuna tiklar
    Then US22 View Results buttonuna tiklar
    Then US22 Testin edit buttonuna tiklar  ID, Date, Result, description, Created date bolumlerini gorur ve  gunceller.
    Then US22 Personel sayfayi kapatir
















