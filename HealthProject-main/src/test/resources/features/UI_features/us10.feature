Feature: US10 Doktor Randevuları

   Background: Ortak stepler

   Given US10 Doktor url gider
   Given US10 Doktor Kisi ikonuna  tiklar
   And US10 Doktor sigin buttonuna tiklar
   When US10 Doktor rolu ile gecerli username "AcilSifa" girer
   And  US10 Doktor rolu ile gecerli password "161122.d" girer
   And US10 Doktor Sign 'i tiklar
   And US10 My Pages buttonuna tiklar
   And US10 My Appointment buttonuna tiklar

   @US10_TC01
   Scenario: US10_TC01 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden gorebilmelidir
   Given US10 Zaman araligini gorur
   Then US10 Doktor randevu tarihini onbes gun aralikla belirler
   Then US10 Randevu takvimini gorur
   Then US10 Doktor Sayfayi kapatir

   @US10_TC02
   Scenario: US10_TC02 Doktor "patient id, start date, end date, status" bilgilerini görebilmeli
   Then US10 Doktor randevu tarihini onbes gun aralikla belirler
   Then US10 Doktor uzerine kayitli olan randevularin detaylarini gorebilir
   Then US10 Doktor Sayfayi kapatir

   @US10_TC03
   Scenario: US10_TC03 Randevu olmayan bir aralik secildiginde Doktor "patient id, start date, end date, status" bilgilerini göremez.
   Then US10 Doktor randevu olmayan bir aralik girer
   Then US10 Doktor secilen aralikta randevu yoksa "No Appointments found" uyarisini gorur
   Then US10 Doktor Sayfayi kapatir

   @US10_TC04
   Scenario: US10_TC04Zaman araligi 15 gunden fazla secilirse  Doktor "patient id, start date, end date, status" bilgilerini göremez
   Then US10 Doktor Zaman araligini onbes gunden fazla secer
   Then US10 Doktor uyari mesajini alir
   Then US10 Doktor Sayfayi kapatir































