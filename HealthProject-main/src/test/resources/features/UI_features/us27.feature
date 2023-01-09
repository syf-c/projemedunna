@US27
Feature: Admin mesaj kismini goruntuler,editler.

  Background: Ortak adimlar
    Given Kullanici medunna sayfasina gider US04
    Then kullanci sign in butonuno tiklar  US04
    Then Kullanici gecerli username "team12" girer. US11
    Then Kullanici gecerli password "team12B81" girer. US11
    Then Sign in butonuna tiklar. US11
    Then Items&Titles butonuna tiklar.
    Then Messages butonuna tiklar.


@US27_TC01
  Scenario: Admin, mesaj portalina gidebilir ve tum mesajlari, yazarlarini ve e-postalarini goruntuleyebilir.

  Then Tum mesajlari gorebilmelidir.
  Then Tum yazarlarini gorebilmelidir.
  Then Tum emaillerini gorebilmelidir.
  And Kullanici sayfayi kapatir

@US27_TC02
  Scenario: Admin, mesajlari olusturabilir.

  Then Create a new message box'a tiklar.
  Then Name kismini doldurur.
  Then Email kismini doldurur.
  Then Subject kismini doldurur.
  Then Message kismini doldurur.
  Then Save boxa tiklar.
  Then Mesajin kaydedildigini dogrular.
  And Kullanici sayfayi kapatir

@US27_TC03
  Scenario: Admin, mesajlari guncelleyebilir.

  Then Create a new message box'a tiklar.
  Then Name kismini doldurur.
  Then Email kismini doldurur.
  Then Subject kismini doldurur.
  Then Message kismini doldurur.
  Then Save boxa tiklar.
  Then Sutundaki id okuna tiklar.
  Then Kendi olusturdugu mesajin edit bolumune tiklar.
  Then Mesajina guncelleme yapar.
  Then Save boxa tiklar.
  Then Mesajin update isleminin basarili sekilde yapildigibi dogrular.
  And Kullanici sayfayi kapatir

@US27_TC04
  Scenario: Admin,mesajlari silebilir.

  Then Create a new message box'a tiklar.
  Then Name kismini doldurur.
  Then Email kismini doldurur.
  Then Subject kismini doldurur.
  Then Message kismini doldurur.
  Then Save boxa tiklar.
  #Then Sutundaki id okuna tiklar.
  Then Kendi olusturdugu mesajin delete bolumune tiklar.
  Then Silme islemini onaylamak icin gelen Delete butonuna tiklar.
  Then Mesajin silindigini test eder.
  And Kullanici sayfayi kapatir
