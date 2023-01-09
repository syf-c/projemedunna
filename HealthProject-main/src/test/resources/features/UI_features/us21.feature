@US21
Feature:Staff hastalar icin randevulari gorur

  Background: Ortak stepler

    Given Personel url gider
    Given US21 Personel Kisi ikonuna  tiklar
    And US21 Personel sigin buttonuna tiklar
    When US21 Personel rolu ile gecerli username "esra-personel" girer
    And  US21 Personel rolu ile gecerli password "161122.d" girer
    And US21 Personel Signi tiklar
    And US21 Personel My Pages buttonuna tiklar
    And US21 Personel Search Patient buttonuna tiklar

  @US21_TC01
  Scenario: US21_TC01
    Given US21 Patient ssn bolumune gecerli ssn numarasini girer
    Then US21 Show Appointments buttonuna tiklar
    Then US21 Edit buttonuna tiklar
    Then US21 "Create or Edit an Appointment" yazisini gorur
    Then US21 Personel sayfayi kapatir


  @US21_TC02
  Scenario: US21_TC02
    Given US21 Patient ssn bolumune gecerli ssn numarasini girer
    Then US21 Show Appointments buttonuna tiklar
    Then US21 Edit buttonuna tiklar
    And US21 UNAPPROVED, PENDING veya CANCELLED seceneklerini secer
    Then US21 Personel sayfayi kapatir

  @US21_TC03
  Scenario:US21_TC03
    Given US21 Patient ssn bolumune gecerli ssn numarasini girer
    Then US21 Show Appointments buttonuna tiklar
    Given US21 Edit buttonuna tiklar
    Then US21 "COMPLETED" seceneginin secilemedigini gorur
    Then US21 Personel sayfayi kapatir

  @US21_TC04
  Scenario:US21_TC04(bug)
    Given US21 Patient ssn bolumune gecerli ssn numarasini girer
    Given US21 Show Appointments buttonuna tiklar
    Then US21 Edit buttonuna tiklar
    And US21 "Anamnesis (Hastalik Gecmisi), Treatment ( Tedavi) veya Diagnosis(Teshis)" bolumlerine data girilemedigini gorur
    Then US21 Personel sayfayi kapatir

  @US21_TC05
  Scenario: US21_TC05
    Given US21 Patient ssn bolumune gecerli ssn numarasini girer
    Given US21 Show Appointments buttonuna tiklar
    Then US21 Edit buttonuna tiklarr
    Then US21 Physician bolumunden doktoru secer
    And US21 Save buttonuna basar kayit yapilabildigini gorur
    Then US21 Personel sayfayi kapatir

