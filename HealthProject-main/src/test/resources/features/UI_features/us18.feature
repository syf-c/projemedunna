
Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil

  Background:
    Given Kullanici Medunna sayfasina gider
    And Kullanici user icon simgesine tiklar
    Then Kullanici giris yapmak icin sign in butonuna basar
    And Kullanici username ile sifresini girer
    Then Kullanici sign in butonuna basar
    And Kullanici Item-Titles butonuna tiklar
    And Kullanici physician sekmesine basar

  Scenario:TC01 Kullanici, doktorlarin bilgilerini gorebilmelidir
    Then Kullanici butun doktorların bilgilerinin goruldugunu test eder
    And Kullanici sayfayi kapatir

  Scenario:TC02 Kullanici, SSN kimligine gore kayitli bir kisiyi secebilir/ arayabilir.
    And Kullanici administration sekmesine basar
    And Kullanici user management sekmesine basar
    And Kullanici create a new user sekmesine basar
    And Kullanici login "yamann50" firstname "hamza" lastname "yaman632" mail "musa522@gmail.com" SSN "789-63-2147" rol olarak doktor girer
    And Kullanici save butonuna basar
    And Kullanici Item-Titles butonuna tiklar
   And Kullanici physician sekmesine basar
    And Kullanici create a new physician sekmesine basar
    Then Kullanici kayitli SSN "789-63-2147" girer ve dogrulama mesajinin geldigini test eder
   And Kullanici sayfayi kapatir
  @yaman1
  Scenario:TC03 Kullanici, Doktorlarin bilgilerini duzenleyebilir.
    And Kullanici kayitli olan doktorun edit butonun tiklar
    And Kullanici doktora ait yeni bilgileri girer
    And Kullanici save tusuna basar
    Then Kullanici edit icin dogrulama mesajinin gorundugunu test eder
    And Kullanici sayfayi kapatir

  Scenario: TC04 Kullanici, Doktorlarin "firstname, lastname birth date .." bilgileri doldurulabilmeli.
    And  Kullanici acilan sayfada Create a new Physician butonuna tiklar
    And Kullanici kayitli SSN "789-63-2147" girer ve aratir
    And  Kullanici doktor için gerekli bilgileri girer ve save butonuna basar
    And Kullanici doktor icin girilen bilgilerin kaydededildigini gorunurlugunu test eder
    And Kullanici sayfayi kapatir

  Scenario: TC05 Kullanici Doktor icin bir uzmanlik alani secebilmeli.
    And Kullanici administration sekmesine basar
    And Kullanici user management sekmesine basar
    And Kullanici create a new user sekmesine basar
    And Kullanici login "yaman61" firstname "hamza41" lastname "yaan7" mail "yamanhamza1412@gmail.com" SSN "582-55-5641" rol olarak doktor girer
    And Kullanici save butonuna basar
    And Kullanici Item-Titles butonuna tiklar
    And Kullanici physician sekmesine basar
    And Kullanici create a new physician sekmesine basar
    Then Kullanici kayitli SSN "582-55-5641" girer ve aratir
    And Kullanici doktor icin bir uzmanlik alanini secer
    And Kullanici doktor icin uzmanlik alaninin secildigini test eder
    And Kullanici sayfayi kapatir

    Scenario: TC06 Kullanici, doktorun profil resmini saglayabilir.
    And Kullanici administration sekmesine basar
    And Kullanici user management sekmesine basar
    And Kullanici create a new user sekmesine basar
    And Kullanici login "yaman62" firstname "haza4" lastname "yanar7" mail "yaar6212@gmail.com" SSN "582-99-5614" rol olarak doktor girer
    And Kullanici save butonuna basar
    And Kullanici Item-Titles butonuna tiklar
    And Kullanici physician sekmesine basar
    And Kullanici create a new physician sekmesine basar
    Then Kullanici kayitli SSN "582-99-5614" girer ve aratir
    And Kullanici doktor icin bir profil resmi secer
    And Kullanici doktor icin profil resminin secildigini test eder
    And Kullanici sayfayi kapatir

Scenario: TC07 Kullanici, doktorun Muayene ucretini girebilmelidir. (Exam fee)
  And  Kullanici acilan sayfada Create a new Physician butonuna tiklar
  And Kullanici kayitli SSN "582-99-5614" girer ve aratir
  And Kullanici doktorun muayene ucretini girer
  And Kullanici muayene ucretinin girilebildini test eder

  Scenario:TC08 Kullanici mevcut kullanicilar arasıindan doktoru seçmelidir.(BUGG)
    Given Kullanici doktoru secebilir
    Then Kullanici physician secilebilir oldugunu dogrular
    And Kullanici sayfayi kapatir

  Scenario:TC09 Kullanici mevcut doktorlari silebilir.
    And Kullanici administration sekmesine basar
    And Kullanici user management sekmesine basar
    And Kullanici create a new user sekmesine basar
    And Kullanici login "yaman365" firstname "hamza" lastname "yaman40" mail "ya1man252@gmail.com" SSN "185-41-4147" rol olarak doktor girer
    And Kullanici save butonuna basar
    And Kullanici son sayfaya gecer
    And Kullanici son sayfadaki SSN "185-41-4147" olan doktorun delete butona tiklar
    And Kullanici cikan uyari mesajinda delete butonuna basar
    Then Kullanici delete icin dogrulama mesajinin gorundugunu test eder
    And Kullanici sayfayi kapatir




