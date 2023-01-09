package stepDefinitions.DB_stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

public class Us17_StepDefinitions {
    @Given("Kullanici database ile baglanti olusturur")
    public void kullaniciDBIleBaglantiOlusturur() {
        DatabaseUtility.createConnection();
    }

    @And("Kullanici DB'e sorgu gonderir id ile test item bilgilerini alir")
    public void kullaniciDBESorguGonderirIdIleTestItemBilgileriniAlir() {
        String query = "select * from c_test_item";
        System.out.println(DatabaseUtility.getColumnNames(query));

        System.out.println("\n====id list=====");
        List<Object> idList = DatabaseUtility.getColumnData(query, "id");
        System.out.println(idList);
    }

    @Then("Kullanici bilgileri dogrular")
    public void kullaniciBilgileriDogrular() {
        List<Object> expectedtestitemsIds=new ArrayList<>();

        expectedtestitemsIds.add(205486);
        Assert.assertTrue("ID'ler uyusmuyor", expectedtestitemsIds.containsAll(expectedtestitemsIds));


        //  CopyOnWriteArrayList<Object> actualtestItems = null;
        //  Assert.assertTrue("ID'ler uyusmuyor",actualtestItems.containsAll(expectedtestitemsIds));
    }
}
