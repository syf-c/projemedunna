package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;

public class Methodlar {

    static MedunnaPage obje = new MedunnaPage();
    static Actions actions = new Actions(Driver.getDriver());
    static Faker faker = new Faker();
    static String ssn = faker.idNumber().ssnValid();
    static String firstName = faker.name().firstName();
    static String lastName = faker.name().lastName();
    static String username = faker.name().username();
    static String email = faker.internet().emailAddress();
    static String password = faker.internet().password();
    static String idNum;
    public static String locate;



    public static void main(String[] args) {

        staffOlusturmaMethodu();
        staffsilmeMethodu();
        butunrolleriOlusturma();
        usersilme();

    }


    public static void staffOlusturmaMethodu() {

        ReusableMethods.waitFor(2);
        obje.administrationYY.click();
        obje.userManagementYY.click();
        ReusableMethods.waitFor(1);
        JsReusable.jsScrollClick(obje.createANewUserYY);
        obje.userLoginYY.sendKeys(username);
        actions.sendKeys(Keys.TAB, firstName).sendKeys(Keys.TAB, lastName).sendKeys(Keys.TAB, email).
                sendKeys(Keys.TAB, ssn).perform();
        JsReusable.jsScrollClick(obje.roleStaffYY);

        obje.itemsTitlesYY.click();
        ReusableMethods.waitFor(2);
        obje.staffButtonYY.click();
        ReusableMethods.waitFor(2);
        obje.createANewStaffYY.click();
        ReusableMethods.waitFor(2);
        obje.useSearchCheckBoxYY.click();
        obje.ssnSearchBoxYY.sendKeys(ssn);
        obje.searchUserYY.click();
        JsReusable.jsScrollClick(obje.staffPhoneYY);
        obje.staffPhoneYY.sendKeys("0123456789");
        JsReusable.jsScrollClick(obje.staffSaveButonuYY);
        ReusableMethods.waitFor(3);

        ReusableMethods.waitForVisibility(obje.staffOlusturulduMesajiYY, 15);
        if (obje.staffOlusturulduMesajiYY.getText().contains("created")) {
            idNum = obje.staffOlusturulduMesajiYY.getText().replaceAll("\\D", "");
        }
        ReusableMethods.waitFor(1);
        locate = "//*[starts-with(@href, '/staff/" + idNum + "/delete')]";

    }



    public static void staffsilmeMethodu() {
        ReusableMethods.waitFor(2);
        ReusableMethods.jsclick(obje.itemsTitlesYY);
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(obje.staffButtonYY,10);
        JsReusable.jsScrollClick(obje.enSonaGitYY);
        ReusableMethods.waitFor(2);
        WebElement delete = Driver.getDriver().findElement(By.xpath(locate));
        JsReusable.jsScrollClick(delete);
        ReusableMethods.waitFor(1);
        JsReusable.jsScrollClick(obje.deleteConfirmYY);
       // obje.staffSilindiBasariMesajiYY.isDisplayed();
       // ReusableMethods.waitFor(3);

    }

    public static  void usersilme(){
        obje.administrationYY.click();
        ReusableMethods.waitFor(3);
        obje.userManagementYY.click();
        obje.userManagementIDYY.click();
        ReusableMethods.jsclick(obje.userManagementDeleteyy);
        ReusableMethods.jsclick(obje.comfirmDeleteyy);

    }

    public static void butunrolleriOlusturma(){
            ReusableMethods.waitFor(2);
            obje.administrationYY.click();
            obje.userManagementYY.click();
            ReusableMethods.waitFor(1);
            JsReusable.jsScrollClick(obje.createANewUserYY);
            obje.userLoginYY.sendKeys(username);
            actions.sendKeys(Keys.TAB, firstName).sendKeys(Keys.TAB, lastName).sendKeys(Keys.TAB, email).
                    sendKeys(Keys.TAB, "532-11-3333").perform();
            JsReusable.jsScrollClick(obje.roleStaffYY);
            JsReusable.jsScrollClick(obje.rolePatientYY);
            JsReusable.jsScrollClick(obje.roleUserYY);
            JsReusable.jsScrollClick(obje.rolePhysicianYY);
            JsReusable.jsScrollClick(obje.roleAdminYY);
            ReusableMethods.jsclick(obje.staffSaveButonuYY);


    }
    }










