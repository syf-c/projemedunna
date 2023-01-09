Feature: US23 Fatura islemleri

  Background: Ortak adimlar
    Given Kullanici url'e gider
    When Kullanici user icon simgesine tiklar us23
    Then Kullanici acilan menude Sign in sekmesine tiklar
    And Kullanici acilan sayfada Staff icin gecerli olan username ve password girip sign in butonuna tiklar
    And Kullanici sayfanin acildigini dogrular
    And Kullanici acilan sayfada My Pages sekmesine tiklar
    And Kullanici Search Patient'e tiklar


  @US23-TC1
  Scenario: TC01 Staff fatura olusturabilmelidir
    Given Kullanici arama kutusuna hastanin SSN numarasini girer
    When Kullanici acilan sayfada Show Appointments butonuna tiklar
    Then Kullanici PaymentInvoice Process butonuna tiklar
    And Kullanici Create invoice butonuna tiklar
    And Kullanici fatura olustugunu dogrular
    And Kullanici sayfayi kapatir us23

  @US23-TC2
  Scenario: TC02 Staff fatura olustururken hastanin durumu COMPLETED ya da CANCELLED olmalidir(bug)

  @US23-TC3
  Scenario: TC03 Staff muayene ucreti ve yapilan testlerin ucretlerini goruntuleyebilmelidir
    Given Kullanici arama kutusuna hastanin SSN numarasini girer2
    When Kullanici acilan sayfada Show Appointments butonuna tiklar2
    And Kullanici PaymentInvoice Process butonuna tiklar
    And Kullanici muayene ve test ucretlerini goruntuleyebildigini dogrular
    And Kullanici sayfayi kapatir us23

  @US23-TC4
  Scenario: TC04 Staff ayni hasta icin yeni bir fatura olusturabilmelidir(bug)

  @US23-TC5
  Scenario: TC05 Staff islemi bitmis bir hastanin daha sonra fatura bilgisini gorebilmelidir
  Given Kullanici arama kutusuna hastanin SSN numarasini girer
  When Kullanici acilan sayfada Show Appointments butonuna tiklar
  Then Kullanici PaymentInvoice Process butonuna tiklar
  And Kullanici Show invoice butonuna tiklar
  And Kullanici Invoice sayfasinin acildigini dogrular
  And Kullanici sayfayi kapatir us23



