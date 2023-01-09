Feature: US10_DataBase
  @DB_Us10
  Scenario: US10 Backend database testi
    Given US10 Connect to database
    Then US10 Get appointment information of all patients from the table
    Then US10 The verify query result