Feature:"Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir."

  Scenario: Kullanici, DB kullanarak tum hasta bilgilerini dogrulamalidir.

    Given us09Connect to database
    And us09According to the SSN value in the table, the user receives all information
    Then us09Verify  query result













