@US11
  Feature: My Appointments doktor tarafindan düzenlenebilmeli.

    Background: Ortak Adimlar
      Given Kullanici medunna sayfasina gider US04
      Then kullanci sign in butonuno tiklar  US04
      Then Kullanici gecerli username "sumeyyeDoktor" girer. US11
      Then Kullanici gecerli password "sumeyyeDoktor3520." girer. US11
      Then Sign in butonuna tiklar. US11
      Then My Appointments butonuna tiklar. US11

  @US11_TC01
    Scenario: Doktor edit islemi yapar.
    Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11
    Then Save butonuna tiklar. US11
    And Kullanici sayfayi kapatir

  @US11_TC02
    Scenario: Doktor hastanin asagidaki bilgilerini gormelidir.
    Then Appointments sayfasindaki id bilgisini gorebilmeli.
    Then Appointments sayfasindaki Start Date Time bilgisini gorebilmeli.
    Then Appointments sayfasindaki End Date Time bilgisini gorebilmeli.
    Then Appointments sayfasindaki Status bilgisini gorebilmeli.
    Then Appointments sayfasindaki Physician bilgisini gorebilmeli.
    Then Appointments sayfasindaki Patient bilgisini gorebilmeli.
    And Kullanici sayfayi kapatir

  @US11_TC03
   Scenario: Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarini doldurmalidir.
    Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11
    Then Doktor Anamnesis alanina "bahar alerjisi" girer.
    Then Doktor Treatment alanina "ilac verildi" girer.
    Then Doktor Diagnosis alanina "turp gibi" girer.
    Then Save butonuna tiklar. US11
    And Kullanici sayfayi kapatir

  @US11_TC04
  Scenario: Doktor "prescription ve description" alanlarini doldurmalidir.
    Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11
    Then Doktor Anamnesis alanina "bahar alerjisi" girer.
    Then Doktor Treatment alanina "ilac verildi" girer.
    Then Doktor Diagnosis alanina "turp gibi" girer.
    Then Doktor Prescription alanina "dinlenmesi lazim" girer.
    Then Doktor Description alanina "yogun alerji doneminde" direr.
    Then Save butonuna tiklar. US11
    And Kullanici sayfayi kapatir

  @US11_TC05
  Scenario: Doktor "prescription ve description" alanlarini bos birakmalidir.
    Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11
    Then Doktor Prescription alanini bos birakir.
    Then Doktor Description alanini bos birakir.
    Then Save butonuna tiklar. US11
    And Kullanici sayfayi kapatir

  @US11_TC06
  Scenario: Doktor tarafindan status "PENDiNG, COMPLETED veya CANCELLED" secilmelidir.
    Then Appointments listesindeki ilk siradaki hastanin Edit butonuna tiklar. US11
    Then Status ,COMPLETED olarak secilebilmeli.
    Then Save butonuna tiklar. US11
    And Kullanici sayfayi kapatir






