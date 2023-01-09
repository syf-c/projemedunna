@US19
Feature: US_019

  Background:  Ortak adimlar
    Given Admin19 "medunnaUrl" adresine gider
    Then Admin19 Giris simgesine tiklar
    And  Admin19 Sign in simgesine tiklar
    And Admin19 Username alanina gecerli bir username "team12" girer
    And Admin19 Password alanina gecerli bir password "team12B81" girer
    And Admin19 Sign in butonuna tiklar


  @US19_TC01
  Scenario Outline: Admin SSN kullanarak kayitli kisiler arasinda Staff arayabilmeli
    And Admin19 Items&Titles sekmesine tiklar
    And Admin19 Admin Staff secenegini tiklar
    And Admin19 Create a new Staff butonuna tiklar
    And Admin19 Use Search box suna tiklar
    And Admin19 SSN alanina staff in "<SSN>" i girer
    And Admin19 Search User butonunu tiklar
    Then Admin19 User found with search SSN mesajini gorur
    And Admin19 sayfayi kapatir


    Examples:
      | SSN         |
      | 863-95-6872 |

  @US19_TC02
  Scenario Outline: Admin tüm bilgileri doldurabilmeli

    And Admin19 Items&Titles sekmesine tiklar
    And Admin19 Admin Staff secenegini tiklar
    And Admin19 Create a new Staff butonuna tiklar
    And Admin19 Use Search box suna tiklar
    And Admin19 SSN alanina staff in "<SSN>" i girer
    And Admin19 Search User butonunu tiklar
    And Admin19 bos olan "<Phone>" "<Address>" "<Description>" "<Country>" "<State>" alanlarini doldurur
    Then Admin19 tum bilgilerin dolduruldugu dogrular
    And Admin19 sayfayi kapatir

    Examples:
      | SSN         | Phone      | Address    | Description | Country | State      |
      | 863-95-6872 | 0493456321 | istanbul   | test        | USA     | California |

  @US19_TC03
  Scenario: Admin kayitli kisilerden bir kullanici secebilmeli

    And Admin19 Administratiton sekmesine tiklar
    And Admin19 User management sekmesine tiklar
    And Admin19 sececegi kullanicinin  View butonuna tiklar
    Then Admin19 kullaniciyi sectigini dogrular
    And Admin19 sayfayi kapatir

  @US19_TC04
  Scenario: Admin kullanici bilgilerini duzenleyebilmeli
    Then Kullanici "367707" duzenleme yaparyy
    And Admin19 kullanici bilgileri duzenler
    Then Admin19 kullanici bilgilerinin duzenledigine dair basari mesajini gorur
    And Admin19 sayfayi kapatir

  @US19_TC05
  Scenario: Admin personeli silebilmeli
    Then Admin19 silmek istedigi personelin delete butonuna tiklar
    And  Admin19 silindi mesajini dogrular
    And Admin19 sayfayi kapatir