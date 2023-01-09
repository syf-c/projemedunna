@US09
Feature: US09 "Staff (Personel),hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir."

  Background: ortak adimlar
    Given Belirtilen url'e gidilir FC.
    When Giris icon'una tiklanir FC.
    And Sign in'e tiklanir FC.
    And Personel username girilir FC.
    And Personel password girilir FC.
    And Sign in butonuna tiklanir FC.
    And My pages'a tiklanir FC.
    And Search patient'e tiklanir FC.

  @TC01FC1
  Scenario: TC01 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
    And Patient ssn box'a ssn girilir FC.
    And View'e tiklanir FC.
    Then Hasta bilgilerinin goruldugu test edilir FC.
    And Sayfa kapatilir FC.

  @TC02FC1
  Scenario: TC02 "Kullanıcı bütün hasta bilgilerini ""id, firstname, lastname, birthdate, email, phone, gender, blood group,
  address, description, user, country and state/city"" düzenleyebilmelidir."
    And Patient ssn box'a ssn girilir FC.
    And Edit butonuna tiklanir FC.
    And firstname lastname birthdate email phone gender blood group address description user country and state city bilgileri duzenlenir FC.
    And Save butonuna tiklanir FC.
    Then firstname lastname birthdate email phone gender blood group address description user country and state city bilgilerin düzenlenebildigi test edilir FC.
    And Sayfa kapatilir FC.

  @TC03FC1
  Scenario: TC03 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    And Ssn girilerek aranabildiği test edilir FC.
    Then Tum kayit bilgilerinin dolduruldugu test edilir FC.
    And Sayfa kapatilir FC.

  ##Scenario: TC04 Kullanıcı herhangi bir hasta bilgisini silebilir.

  ##10-Delete butonu yok(bug)
