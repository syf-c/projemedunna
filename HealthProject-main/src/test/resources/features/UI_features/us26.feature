@US26
Feature: Iletisim Mesaji (Contact messages)

  Background: Ortak Adimlar

    Given Kullanici Medunna sayfasina gider Ag.
    Then Kullanici Contact butonuna tiklar Ag.
    Then Kullanici sayfayi asagi indirir Ag.

  @US26-TC01
  Scenario: TC 01 Herhangi bir kullanici, bilgi almak icin "Contact portal" uzerinden istek gonderebilmeli
    Then Kullanici name textboxina tiklar ve erisebildigini dogrular Ag.
    Then Kullanici name textboxina ismini girer Ag.
    Then Kullanici email textboxina tiklar ve erisebildigini dogrular Ag.
    Then Kullanici email textboxina adresini girer Ag.
    Then Kullanici subject textboxina tiklar ve erisebildigini dogrular Ag.
    Then Kullanici subject textboxina konuyu girer Ag.
    Then Kullanici message textboxina tiklar ve erisebildigini dogrular Ag.
    Then Kullanici message textboxina mesajini girer Ag.
    Then Kullanici Send butonuna tiklar Ag.
    Then Kullanici mesajinin basari ile gonderildigini dogrular Ag.
    And Kullanici sayfayi kapatir Ag.

  @US26-TC02
  Scenario: TC 02 Kullanici "Name, Email, Subject, Message" bolumlerine data girebilmeli ve mesajini gonderebilmeli. (Pozitif)
    Then Kullanici Name textboxina ismini girer AG.
    Then Kullanici Email textboxina adresini girer AG.
    Then Kullanici Subject textboxina konuyu girer AG.
    Then Kullanici Message textboxina mesajini girer AG.
    Then Kullanici Send butonuna tiklar Ag.
    Then Kullanici mesajinin basari ile gonderildigini dogrular Ag.
    And Kullanici sayfayi kapatir Ag.

  @US26-TC03
  Scenario: TC 03 Kullanici "Name, Email, Subject" bolumlerini doldurmadan mesaj gönderemedigini görebilmeli (Negatif)
    Then Kullanici Name textboxini bos birakir Ag.
    Then Kullanici Name is required uyarisini aldigini dogrular Ag.
    Then Kullanici Email textboxini bos birakir Ag.
    Then Kullanici Your email is required uyarisini aldigini dogrular Ag.
    Then Kullanici Subject textboxini bos birakir Ag.
    Then Kullanici This field is required uyarisini aldigini dogrular Ag.
    Then Kullanici mesajini yazar Ag.
    Then Kullanici sendd butonuna tiklar Ag.
    Then Kullanici Name, Email, Subject textboxlarini doldurmadan mesaj gonderemedigini gorur Ag.
    And Kullanici sayfayi kapatir Ag.



