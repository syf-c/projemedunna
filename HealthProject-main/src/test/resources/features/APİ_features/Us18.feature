Feature: US018 Admin olarak yeni Physician olustur gunceller goruntule ve sil
@US18_Api
  Scenario:TC01 API kullanarak doktorlari dogrulayın
  Given Kullanici idsi 203613 Physician  icin get request yapar
    Then Kullanici get request yapilan Physician icin bilgilerini dogrular


