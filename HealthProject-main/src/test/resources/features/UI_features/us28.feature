@US28
Feature: US14 Edit Inpatients islemleri

  Background: Ortak Adimlar
    Given Kullanici medunna sayfasina gider US04
    Then kullanci sign in butonuno tiklar  US04

  @US28_TC01
  Scenario: TC01 Admin kullanicisi yeni bir ulke olusturabilir
    Then Kullanici gecerli username "team12" girer US13-14
    Then Kullanici gecerli password "team12B81" girer US13-14
    Then kullanici signinnn butonuna tiklar US04
    Then Kullanici Country linkine tiklar US28
    Then Kullanici Create a new Country butonuna tiklar US28
    Then Kullanici Name kismina yeni ulke ismi olarak "AhmetUlke01" girer US28
    Then Kullanici Save butonuna tiklar US28
    Then Kullanici ekranda "A new Country is created with identifier" mesajini gorur ve olusturulan yeni ulkenin id numarasini not eder US28
    And  Kullanici sayfayi kapatir US13-14

  @US28_TC02
  Scenario: TC02 Admin ulkeleri silebilmelidir
    Then Kullanici gecerli username "team12" girer US13-14
    Then Kullanici gecerli password "team12B81" girer US13-14
    Then kullanici signinnn butonuna tiklar US04
    Then Kullanici Country linkine tiklar US28
    Then Kullanici kaydedilen id'li ulkenin oldugu sirdaki delete butonuna tiklar US28
    Then Kullanici ekranda cikan "Are you sure you want to delete Country" mesajini gorur US28
    Then Kullanici delete butonuna tiklar ve cikan uyarida "A Country is deleted with identifier" mesajini gorur US28
    Then Kullanici acilan sayfada silinen ulke id'sinin olmadigini dogrular US28
    And  Kullanici sayfayi kapatir US13-14

  @US28_TC03 # TODO: Bu Testcase'de bug var
  Scenario: TC02 Admin ulkeleri silebilmelidir
    Then Kullanici gecerli username "team12" girer US13-14
    Then Kullanici gecerli password "team12B81" girer US13-14
    Then kullanici signinnn butonuna tiklar US04
    Then Kullanici StateCity linkine tiklar US28
    Then Kullanici Create a new StateCity butonuna tiklar US28
    Then Kullanici Name kismina Eyalet&Sehir "AhmetEyalet01" ismi girer US28
    Then Kullanici StateCity kismini "Türkiyem" olarak secer US28
    Then Kullanici Save butonuna tiklar US28
    Then Kullanici cikan uyari mesajinda "Field translation-not-found" metnini gormemelidir US28
    And  Kullanici sayfayi kapatir US13-14




