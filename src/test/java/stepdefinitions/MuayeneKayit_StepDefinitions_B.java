package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import pages.Hasta_Kayit_Page_B;
import pages.Muayene_Kayit_Page;
import pages.Muayene_Kayit_Page_B;
import utilities.Driver;
import utilities.ReusableMethods;

public class MuayeneKayit_StepDefinitions_B {
    BasePage basePage = new BasePage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    //  Select select=new Select();

    Muayene_Kayit_Page muayene_Kayit_Page = new Muayene_Kayit_Page();
    Muayene_Kayit_Page_B muayene_Kayit_Page_B = new Muayene_Kayit_Page_B();

    @And("Select a valid Poliklinik on Muayene Kayıt Page")
    public void selectAValidPoliklinikOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.selectValidPoliklinik();
    }


    @And("Select a valid Geliş Şekli on Muayene Kayıt Page")
    public void selectAValidGelisSekliOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.selectAValidArrivalType();
    }

    @And("Click Kaydet button on Muayene Kayıt Page")
    public void clickKaydetButtonOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.clickSaveButton();
    }

    @Then("Bilgiler Kaydedildi should be seen on Popup Alert on Muayene Kayıt Page")
    public void bilgilerKaydedildiShouldBeSeenOnPopupAlertOnMuayeneKayıtPage() throws InterruptedException {
        muayene_Kayit_Page_B.succesAlert();
    }

    @And("Select Acil Erişkin Müşahade on Poliklinik on Muayene Kayıt Page")
    public void selectAcilEriskinMusahadeOnPoliklinikOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.emergencyAdult();
    }

    @Then("Bilgiler Kaydedildi shouldnt be seen on Popup Alert on Muayene Kayıt Page")
    public void bilgilerKaydedildiShouldntBeSeenOnPopupAlertOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.failAlert();
    }


    @When("Select  Poliklinik as KADIN DOĞUM on Muayene Kayıt Page")
    public void selectPoliklinikAsKADINDOGUMOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.selectPoliklinikAsKadinDogum();
    }


    @Then("An alert should be seen on Muayene Kayıt Page")
    public void anAlertShouldBeSeenOnMuayeneKayıtPage() {
        muayene_Kayit_Page_B.alertSeen();
    }



}
