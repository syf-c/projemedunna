@musa
Feature: US03 Registration sayfasinda guclu sifre girilmeli ve "Password strength" seviyeleri gorulebilmelidir.
Background:
  Given Kullanici Medunna sayfasina gider
  Then Kullanici user icon simgesine tiklar
  And Kullanici register butonuna tiklar
  @US03_TC01
  Scenario: TC01 Daha guclu bir sifre icin en az 7 karakterden olusan buyuk harf,sayi,ozel karakter ve en az bir kucuk harf olmali,
            "Password strength" seviyesinin degistigi gorulebilmelidir.(Pozitif Senaryo)

    And Kullanici New password kısmına "12345A+" girer
    And Kullanici Password strength de besincii seviyedeki rengin yesil olmadigini test eder
    And Kullanici New password kısmını temizler ve buraya "1234A+a" girer
    And Kullanici Password strength de besinci seviyedeki rengin yesil oldugunu test eder
    And Kullanici sayfayi kapatir

  @US03_TC02
    Scenario:TC02 Daha guclu bir sifre icin en az 7 karakterli ve sadece  buyuk harf,sayi,özel karakter  olmali,
             "Password strength" 5.seviyesinin yesil olmadigi gorulebilmelidir.(Negatif Senaryo)

      And Kullanici New password kısmına "12345A+" girer
      And Kullanici Password strength de besinci seviyedeki rengin yesil olmadiginin gorunebilirligini test eder
      And Kullanici sayfayi kapatir

  @US03_TC03
    Scenario: TC03 Daha guclu bir sifre icin en az 7 karakterden olusan kucuk harf,sayi,ozel karakter ve en az bir buyuk harf olmali,
              "Password strength" seviyesinin degistigi gorulebilmelidir.(Pozitif Senaryo)

      And Kullanıci New password kısmına "12345a+" girer.
      And Kullanici Password strength de besincii seviyedeki rengin yesil olmadigini test eder
      And Kullanıci New password kısmını temizler ve buraya "1234a+A" girer.
      And Kullanici Password strength de besinci seviyedeki rengin yesil oldugunu test eder
      And Kullanici sayfayi kapatir

  @US03_TC04
      Scenario: TCO4 Daha guclu bir sifre icin en az 7 karakterli ve sadece kucuk harf,sayi,ozel karakter olmali,
                "Password strength" 5.seviyesinin yesil olmadigi gorulebilmelidir.(Negatif Senaryo)

      And Kullanıci New password kısmına "12345a+" girer.
      And Kullanici Password strength de besinci seviyedeki rengin yesil olmadiginin gorunebilirligini test eder
      And Kullanici sayfayi kapatir
  @US03_TC05
    Scenario: TC05 Daha guclu bir sifre icin en az 7 karakterden olusan kucuk harf,buyuk harf,ozel karakter ve en az bir rakam olmali,
              "Password strength" seviyesinin degistigi gorulebilmelidir.(Pozitif Senaryo)

      And Kullanıci New password kismına "abcABC+" girer.
      And Kullanici Password strength de besincii seviyedeki rengin yesil olmadigini test eder
      And Kullanıci New password kismını temizler ve buraya "abcAB+1" girer.
      And Kullanici Password strength de besinci seviyedeki rengin yesil oldugunu test eder
      And Kullanici sayfayi kapatir
  @US03_TC06
    Scenario: TC06 Daha guclu bir sifre icin en az 7 karakterli ve sadece kucuk harf,buyuk harf,ozel karakter olmali,
                "Password strength" 5.seviyesinin yesil olmadigi gorulebilmelidir.(Negatif Senaryo)

      And Kullanıci New password kismına "abcABC+" girer.
      And Kullanici Password strength de besinci seviyedeki rengin yesil olmadiginin gorunebilirligini test eder
      And Kullanici sayfayi kapatir

  @US03_TC07
  Scenario: TC07 Daha guclu bir sifre icin en az 7 karakterden olusan kucuk harf,buyuk harf,rakam ve en az 1 ozel karakter olmali,
  "Password strength" seviyesinin degistigi gorulebilmelidir.(Pozitif Senaryo)

    And Kullanıci New password kismina "123abAB" girer.
    And Kullanici Password strength de besincii seviyedeki rengin yesil olmadigini test eder
    And Kullanıci New password kisminı temizler ve buraya "123abA+" girer.
    And Kullanici Password strength de besinci seviyedeki rengin yesil oldugunu test eder
    And Kullanici sayfayi kapatir
  @US03_TC08
  Scenario: TC08 Daha guclu bir sifre icin en az 7 karakterli ve sadece kucuk harf,buyuk harf,rakam olmali,
            "Password strength" 5.seviyesinin yesil olmadigi gorulebilmelidir.(Negatif Senaryo)

    And Kullanıci New password kismina "123abAB" girer.
    And Kullanici Password strength de besinci seviyedeki rengin yesil olmadiginin gorunebilirligini test eder
    And Kullanici sayfayi kapatir
  @US03_TC09
  Scenario: TC09 Guclu bir parola icin sifre en az 7 karakterden olusmali ve kucuk harf,buyuk harf,rakam ve ozel karakter icermeli,
  "Password strength" 5.seviyesinin yesil oldugunu gorulebilmelidir.(Pozitif Senaryo)

    And Kullanıci New password kisminaa "12abA*" girer.
    And Kullanici Password strength de besinci seviyedeki rengin yesil olmadigini test eder
    And Kullanıci New password kismini temizler ve buraya "12abA+*" girer.
    And Kullanici Password strength de besinci seviyedeki rengin yesil oldugunu test eder
    And Kullanici sayfayi kapatir
  @US03_TC10
  Scenario: TC10 Guclu bir parola icin sifre en fazla 6 karakterden olusmalı ve kucuk harf,buyuk harf,rakam ve ozel karakter icermeli,
  "Password strength" 5.seviyesinin yesil olmadigi gorulebilmelidir.(Negatif Senaryo)

    And Kullanıci New password kisminaa "12abA*" girer.
    And Kullanici Password strength de besinci seviyedeki rengin yesil olmadiginin gorunebilirligini test eder
    And Kullanici sayfayi kapatir