package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObject.CertificationPage;
import org.example.PageObject.UserDashboardPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CertificationSteps {
    private WebDriver driver = Hooks.driver;
    private WebDriverWait driverWait = Hooks.driverWait;

    CertificationPage certificationPage = new CertificationPage(driver);

    //------------------------------------------------
    @Then("User click Sertifikasi button")
    public void userClickSertifikasiButton() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(CertificationPage.btnCertif));
        certificationPage.clickButtonCertification();
    }

    @And("User see popup menu of the certification feature")
    public void userSeePopupMenuOfTheCertificationFeature() {
        Assert.assertTrue(certificationPage
                .verifyPopupCertification());
    }

    //pelaku usaha menu validation
    @Then("User click Pelaku Usaha")
    public void userClickPelakuUsaha() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(CertificationPage.clickbtnPelakuUsaha));
        certificationPage.clickPelakuUsaha();
    }

    @And("User already on Pelaku Usaha page")
    public void userAlreadyOnPelakuUsahaPage() {
        Assert.assertTrue(certificationPage
                .verifyPagePelakuUsaha());
    }

    //edit pelaku usaha
    @Then("User click Edit button")
    public void userClickEditButton() {
        driverWait.until(ExpectedConditions
                .elementToBeClickable(CertificationPage.btnEdit));
        certificationPage.clickButtonEdit();
    }

    @And("User already on Edit Pelaku Usaha page")
    public void userAlreadyOnEditPelakuUsahaPage() {
        Assert.assertTrue(certificationPage
                .verifyPageEditPelakuUsaha());
    }

    //penanggung jawab textbox validation pelaku usaha
    @Then("User click on text box")
    public void userClickOnTextBox() {
        Assert.assertTrue(certificationPage.namePjDisplayed());
        driverWait.until(ExpectedConditions
                .elementToBeClickable(CertificationPage.textboxNamePJ));
        certificationPage.clickTextBoxName();

    }

    @And("User can type in the text box {string} as a name")
    public void userCanTypeInTheTextBoxAsAName(String name) {
        certificationPage.setName(name);
    }
}
