@US16
Feature: US16 Oda Olusturma / Goruntuleme / Guncelleme /Silme (Admin)

  Background: ortak adimlar
    Given Belirtilen url'e gidilir FC.
    When Giris icon'una tiklanir FC.
    And Sign in'e tiklanir FC.
    And Yonetici username girilir FC.
    And Yonetici password girilir FC.
    And Sign in butonuna tiklanir FC.
    And Items&Titles'a tiklanir FC.
    And Room'e tiklanir FC.

  @US16TC01
  Scenario: TC01 Admin, yatan hastalar icin yeni oda olusturabilir.
    And Create a new room'a tiklanir FC.
    And Oda bilgileri doldurulur FC.
    And SaveRoom butonuna tıklanır FC.
    Then Yeni oda olusturuldu yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC02
  Scenario: TC02 Oda olusturulurken "Room Number" mutlaka olmali
    And Create a new room'a tiklanir FC.
    And Room number bos birakilir FC.
    Then This field is required yazisinin goruldugu test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC03
  Scenario: TC03 Oda olusturulurken "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmali
    And Create a new room'a tiklanir FC.
    Then Room type olarak TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE goruldugu test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC04
  Scenario: TC04 Oda icin "Status" ayarlanabilir olmali.
    And Create a new room'a tiklanir FC.
    Then Status'un ayarlanabilir oldugu test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC05
  Scenario: TC05 Fiyat eklenebilir olmali
    And Create a new room'a tiklanir FC.
    And Price alani doldurulur FC.
    Then Price'ın eklendigi test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC06
  Scenario: TC06 Fiyat bos birakilamamali.
    And Create a new room'a tiklanir FC.
    And Price alani boş birakilir FC.
    Then Price'ın bos birakilmadıgı test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC07
  Scenario: TC07 "Description" istege bagli olarak doldurulmali.
    And Create a new room'a tiklanir FC.
    And Description alaninin bos birakilir FC.
    Then Description alaninin bos birakilabildigi test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC08
  Scenario: TC08 "Created Date" Gun/Ay/Yil seklinde olmali.
    And Create a new room'a tiklanir FC.
    Then Tarihin gun ay yil seklinde oldugu test edilir FC.
    And Sayfa kapatilir FC.

    ##  Scenario: TC09 "Created Date" gecmis tarih secilememeli.(BUG)

  @US16TC10
  Scenario: TC10 Admin ayni tur odalari gorebilir.
    And Room Type'a tiklanir FC.
    Then Ayni tur odalarin gorulebildigi test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC11
  Scenario: TC11 Admin mevcut odalari duzenleyebilir ve guncelleyebilir.
    And Room Edit'e tiklanir FC.
    And Odanin bilgileri düzenlenir FC.
    And Save'e tiklanir FC.
    Then Secilen odanin guncellendigi test edilir FC.
    And Sayfa kapatilir FC.

  @US16TC12
  Scenario: TC12 Odalar Admin tarafindan silinebilir.
    And Secilen odanin delete butonuna tiklanir FC.
    Then Odanin silinebildigi test edilir FC.
    And Sayfa kapatilir FC.