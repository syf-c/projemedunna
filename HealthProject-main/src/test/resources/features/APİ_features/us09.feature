Feature: TC_004 API Test[ US09 Staff (Personel),  hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.]
  @us09
  Scenario: TC_004 Staff, API kullanarak tüm hasta bilgilerini doğrulamalıdır.
    Then US9 GET request gonderir
    And US9 status kodunun 200 oldugu gorulur
    And US9 tum hasta bilgilerini API response ile alir