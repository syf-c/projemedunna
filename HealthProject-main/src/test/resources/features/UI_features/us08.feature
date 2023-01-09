@US08All
Feature: US08 Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir.
  Background:
    Given Kullanici Medunna sayfasina gider MCK
    Then Kullanici user icon simgesine tiklar MCK
    And Kullanici sign in butonuna tiklar MCK
    And Kullanici gecerli bir kullanici adi ve sifresi girer ve sign in butonunu tiklar MCK
    And Kullanici hesaba giris yapildigini goruntuler MCK
    And Kullanici username uzerine tiklar MCK
    And Kullanici password kutusuna tiklar MCK
    And Kullanici Current Password kutusuna gecerli sifreyi girer MCK

  @US08_TC01
  Scenario: TC01 "New password confirmation" onaylanabilmelidir. (Pozitif Senaryo)

    And Kullanici New Password kutusuna iki buyuk harf, iki kucuk harf, iki sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK
    And Kullanici Confirm the New Password kutusuna ayni sifre tekrar girer MCK
    And Kullanici iki kutucuga da ayni sifreyi girdiginde -The password and its confirmation do not match!- hatasi almadan ilerledigini dogrular. MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC02
  Scenario: TC02 "New password confirmation" onaylanabilmelidir. (Negative Test)

    And Kullanici New Password kutusuna iki buyuk harf, iki kucuk harf, iki sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK
    And Kullanici Confirm the New Password kutusuna farkli bir sifre girer MCK
    Then Kullanici iki kutucuga da ayni sifreyi girdiginde The password and its confirmation do not match! hatasi aldigini dogrular. MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC03
  Scenario: TC03 Daha guclu sifre icin en az 1 kucuk harf olmali ve "Password strength:" seviyesinin degistigi görülebilmelidir.

    And Kullanici New Password kutusuna uc buyuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then Kullanici password seviyesinin bes userinden dort oldugunu dogrular.
    And Kullanici New Password kutusuna bir kucuk harf, iki buyuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then Kullanici sifreye eklenen kucuk harfin sifre gucunu artirdigini goruntuler MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC04
  Scenario: TC04 Daha guclu sifre icin en az 1 buyuk harf olmali ve "Password strength" seviyesinin degistigi görülebilmelidir.

    And Kullanici New Password kutusuna uc kucuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then Kullanici password seviyesinin bes userinden dort oldugunu dogrular.
    And Kullanici New Password kutusuna bir buyuk harf, iki kucuk harf, iki sayi ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then  Kullanici sifreye eklenen buyuk harfin sifre gucunu artirdigini goruntuler MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC05
  Scenario: TC05 Daha guclu sifre icin en az 1 sayi olmali ve "Password strength" seviyesinin degistigi görülebilmelidir.

    And Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf ve iki ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then Kullanici password seviyesinin bes userinden dort oldugunu dogrular.
    And Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf, bir ozel karakter ve bir sayi'dan olusan yedi haneli bir sifre girer MCK
    Then Kullanici sifreye eklenen sayinin sifre gucunu artirdigini goruntuler MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC06
  Scenario: TC06 Daha guclu sifre icin en az 1 ozel karakter olmali ve "Password strength" seviyesinin degistigi görülebilmelidir.

    And Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf ve iki sayidan olusan yedi haneli bir sifre girer MCK
    Then Kullanici password seviyesinin bes userinden dort oldugunu dogrular.
    And Kullanici New Password kutusuna uc buyuk harf, iki kucuk harf, bir sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then Kullanici sifreye eklenen ozel karakterin sifre gucunu artirdigini goruntuler MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC07
  Scenario: TC07 Daha guclu sifre icin sifre en az 7 karakter olmali ve "Password strength" seviyesinin degistigi görülebilmelidir.

    And Kullaici New Password kutusuna iki buyuk harf, iki kucuk harf, bir sayi ve bir ozel karakterden olusan alti haneli bir sifre girer MCK
    Then Kullanici password seviyesinin bes userinden bir oldugunu dogrular.
    And Kullaici New Password kutusuna iki buyuk harf, iki kucuk harf, iki sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK
    Then Kullanici yedi haneli sifrenin, sifre gucunu artirdigini goruntuler MCK
    Then Kullanici sayfayi kapatir MCK

  @US08_TC08
  Scenario: TC08 Eski sifre kullanilmamalidir.

    And Kullanici New Password kutusuna iki buyuk harf, iki kucuk harf, iki sayi ve bir ozel karakterden olusan yedi haneli bir sifre girer MCK
    And Kullanici Confirm the New Password kutusuna ayni sifre tekrar girer MCK
    And Kullanici Save butonunu tiklar MCK
    And Kullanici username uzerine tiklar MCK
    And Kullanici signout butonuna tiklar MCK
    And Kullanici user icon simgesine tiklar MCK
    And Kullanici sign in butonuna tiklar MCK
    And Kullanici gecerli kullanici adini ve eski sifreyi girer ve sign in butonunu tiklar MCK
    And Kullanici Failed to sign in! Please check your credentials and try again. uyarisini gordugunu dogrular. MCK
    Then Kullanici sayfayi kapatir MCK

