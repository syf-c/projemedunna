Feature: Verfy appointment
  @Api_Us10
  Scenario: US10_TC05
  Given US10 Doctor set the medunna base url
  When US10 Doctor send the request and get the response
  Then US10 Doctor status code should be 200
  Then US10 Doctor verify expected data with Api

