Feature:  DP kullanarak doktorları doğrulayın.

  @US18_Db
  Scenario Outline:  Kullanici Physician bilgilerini dogrular
    Given Kullanici database ile baglanti olusturur
    And kullanici physician bilgilerini "*" "physician" tablosundan alir
    Then kullanici tabloda firstname "<firstname>" oldugunu dogrular
    Then kullanici tabloda lastname "<lastname>" oldugunu dogrular
    Then kullanici tabloda phone "<phone>" oldugunu dogrular
    Then kullanici tabloda gender "<gender>" oldugunu dogrular
    Then kullanici tabloda adress "<adress>" oldugunu dogrular
    And database kapatilir

    Examples:
      | firstname | lastname | phone | gender | adress |

      |Noella|Conn|5355557575|MALE |Meow York  |