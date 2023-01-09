@Api_US28
Feature: US28_TC05 Kullanıcı ulke silme islemini API ile dogrulayabilmeli

  @Api_US28_TC05
  Scenario: US28_TC05 Kullanici Yeni Bir Ulke Olusturabilir
    Given Admin set the url for post request US28
    When  Admin enter the expected datas for post request US28
    Then  Admin send the post request and get the response US28
    Then  Admin checked status code should be 201 US28
    Then  Admin verify the post request expected data with Api US28

  @Api_US28_TC06
  Scenario: US28_TC06 Kullanici Ulkeleri Silebilmelidir
    Given Admin set the url for delete request US28
    When  Admin send the delete request and get the response US28
    Then  Admin checked status code should be 204 US28

  @Api_US28_TC07
  Scenario: US28_TC07 Kullanici, Mevcut Ulkeleri Guncelleyebilmelidir
    Given Admin set the url for put request US28
    # *'li scenario bloglari test ulkesi olusturmak icindir
    *  Admin enter the expected datas for post request US28
    *  Admin send the post request and get the response US28
    *  Admin verify the post request expected data with Api US28
    # Bu adımda  countryId ve countryName elde edildi
    Then  Admin enter the expected datas for put request US28
    Then  Admin send the put request and get the response US28
    Then  Admin checked status code should be 200 US28
    Then  Admin verify the put request expected data with Api US28



