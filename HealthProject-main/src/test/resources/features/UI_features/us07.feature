@US07
Feature: Hastalar randevu tarihi olusturabilmelidir

  Background: Ortak Adimlar

    Given Kullanici Medunna sayfasina gider AG.
    Then Kullanici anasayfada user ikonuna tiklar AG.
    Then Kullanici Sign In giris butonuna tiklar AG.
    Then Kullanici Username textboxina kullanici ismini girer AG.
    Then Kullanici Password textboxina sifresini girer AG.
    Then Kullanici SignIn butonuna tiklar AG.
    Then Kullanici MY PAGES(PATIENT) butonuna tiklar AG.
    Then Kullanici acilan dropdown da Make an Appointment butonuna tiklar AG.
    Then Kullanici Phone textboxina telefon numarasini girer AG.

  @US07-TC01
  Scenario: TC 01 Kullanici gecerli tarih girmelidir. (guncel tarihi veya gelecekteki tarihleri secebilmelidir)

    Then Kullanici guncel tarih ile randevu almak icin Send an Appointment Request butonuna tiklar AG.
    Then Kullanici Appointment Registiration Saved! yazisini gorur AG.
    Then Kullanici Appointment Date Time textboxina ileri bir tarih girer AG.
    Then Kullanici Send an Appointment Request butonuna tiklar AG.
    Then Kullanici Appointment Registiration Saved! yazisini gorur AG.
    And Kullanici sayfayi kapatir AG.

  @US07-TC02
  Scenario: TC 02 Kullanici gecmis bir tarih girdiginde uyari almali

    Then Kullanici Appointment Date Time textboxina gecmis bir tarih girer AG.
    Then Kullanici Appointment date can not be past date! yazisini gorur AG.
    Then Kullanici Send an Appointment Request butonuna tikladiginda basarili yazisini gormemeli AG.
    And Kullanici sayfayi kapatir AG.



  @US07-TC03
  Scenario: TC 03 Tarih sirasi gun/ay/yil (ay/gun/yil) seklinde olmalidir

    And Kullanici Appointment Date Time textboxina tarihi gün.ay.yil formatinda girer AG.
    Then Kullanici Send an Appointment Request butonuna tiklar AG.
    Then Kullanici MY PAGES(PATIENT) butonuna tiklar AG.
    Then Kullanici acilan dropdown da My Appointments butonuna tiklar AG.
    Then Kullanici girdigi tarih formatiyla My Appointment deki formatin aynı oldugunu dogrular AG.
    And Kullanici sayfayi kapatir AG.