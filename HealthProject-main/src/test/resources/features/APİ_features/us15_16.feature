@US1516API
Feature: US15 US16 Api ile dogrulama

  @US15TC09
  Scenario: US15 TC09 API ile hasta bilgilerini dogrulayin

    Given US15 GET request gonderir.
    And US15 status kodunun 200 oldugu gorulur.
    And US15 tum hasta bilgilerini API response ile alir.

  @US16TC13
  Scenario: US16 TC13 API ile oda okuma dogrulanmali.

    Given US16TC13 GET request gonderir.
    Then US16TC13 status kodunun 200 oldugu gorulur.
    Then US16TC13 tum oda bilgilerini API response ile alir.

  @US16TC15
  Scenario: US16TC15 API ile oda olusturma dogrulanmali.

    Given US16TC15 POST request gonderiir.
    Then US16TC15 status kodunun 201 oldugu goruluur.
    Then US16TC15 tum oda bilgilerini API ile olusturulur.

  @US16TC14
  Scenario: US16TC14 API ile oda silme dogrulanmali.

    Given US16TC14 DELETE request gonderirr.
    Then US16TC14 status kodunun 204 oldugu gorulurr.
    Then US16TC14 tum oda bilgilerini API ile silinir.

  @US16TC16
  Scenario: US16TC16 API ile oda guncelleme dogrulanmali.

    Given US16TC16 PUT request goonderir.
    Then US16TC16 status kodunun 200 oldugu goorulur.
    Then US16TC16 tum oda bilgilerini API ile guncellenir.